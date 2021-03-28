package model.discount;

import java.sql.Connection;
import GUI.UpdateCustomerDetails;
import model.database.DB_Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.discount.DiscountHelper;

/**
 * @author Gera
 * This class deals with Flexible discounts for valued customers
 * It calculates the price with the discount bands applied to the subtotal price from the database.
 * ApplyDiscount is then called with this new total price and updates the database (See Discount class)
 *
 */

public class FlexibleDiscount extends Discount {

    public ArrayList<Integer> JobIDS = new ArrayList<Integer>();
    public ArrayList<Integer> TaskIDS = new ArrayList<Integer>();
    private static DB_Connection conn1 = new DB_Connection();
    private static PreparedStatement Stm = null;
    private static PreparedStatement Stm_1 = null;


    public void addFlexibleDiscountBeforePayment(double discountRate,String discountType,int discountBandCustomerID,int discountBandID,int accountNumber){
        DiscountHelper GetData = new DiscountHelper(conn1,accountNumber);
        JobIDS=GetData.GetIDs(accountNumber,discountType);//list of all jobs under a customer account
        double newPrice, subPrice=0.0;
        UpdateDiscountBandCustomer(discountBandCustomerID,discountBandID);//test

        for (Integer i: JobIDS) {

            subPrice= GetData.GetOriginalPrice(i,"Job Total");
            newPrice=GetData.calculatePrice(discountRate,subPrice);
            System.out.println(newPrice);
            GetData.UpdateJobDiscount(discountRate,newPrice,i);

        }
    }

    /**
     * Get all discount band details from a customer.
     * SELECT * FROM DiscountBand WHERE DiscountBandCustomer_ID=23
     */

    /**
     * Update DiscountBandCustomer to include the new DiscountBound that have been created (see Create methods)
     *
     */
    public void UpdateDiscountBandCustomer(int DiscountBandCustomerID, int DiscountBandID) {

        try {
            Stm = conn1.connect().prepareStatement("UPDATE DiscountBandCustomer SET DiscountBand_ID= WHERE DiscountBandCustomer_ID=?");
            Stm.setDouble(1, DiscountBandID);
            Stm.setDouble(2, DiscountBandCustomerID);
            Stm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Have Customer ID from GUI, put Customer ID into DiscountBandCustomer
     *
     */
    public void CreateDiscountBandCustomer(int AccNo) {

        try {
            Stm = conn1.connect().prepareStatement("INSERT INTO DiscountBandCustomer (Account_no) VALUES (?)");
            Stm.setInt(1, AccNo);
            Stm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Create a DiscountBand, set your bounds, and discount rate for the respective bound (i.e. 1000-2000, 20%)
     * and relate to the DiscountBandCustomer entry you made earlier
     *
     */
    public void CreateDiscountBand(int AccNo) {

        try {
            //INSERT INTO DiscountBand(lower, upper, discount_rate, DiscountBandCustomer_ID) VALUES (1000, 2000, 20, 23)
            Stm = conn1.connect().prepareStatement("INSERT INTO DiscountBand(lower, upper, discount_rate, DiscountBandCustomer_ID) VALUES (?,?,?,?)");
            Stm.setInt(1, AccNo);
            Stm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}