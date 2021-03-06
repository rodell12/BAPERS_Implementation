package model.jobs.card_payment.transaction;

import model.Model;
import model.database.DB_Connection;
import model.jobs.card_payment.Card_payment;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Manpreet
 */

public class Card_payment_Transaction implements I_Card_payment_Transaction {

    private PreparedStatement Stm = null;
    private Connection conn;

    /**
     * constructor
     *
     * @param conn
     */
    public Card_payment_Transaction(DB_Connection conn){
        this.conn = conn.getConn();
    }

    /**
     * creates a new card payment and call the save method
     *
     * @param payment_id
     * @param payment_amount
     * @param card_type
     * @param expiry_date
     * @param last_digits
     * @param security_code
     * @param date
     * @param job_ID
     */
    public void makeCard_payment(int payment_id, double payment_amount, String card_type, String expiry_date, String last_digits, String security_code, Date date, int job_ID){
        new Card_payment(payment_amount, card_type, expiry_date, last_digits, date, security_code);
        storeCard_details(payment_id, card_type, expiry_date, last_digits, security_code);
    }

    /**
     * save the card details in the database
     *
     * @param payment_ID
     * @param card_type
     * @param expiry_date
     * @param last_digits
     * @param security_code
     */
    public void storeCard_details(int payment_ID, String card_type, String expiry_date, String last_digits, String security_code){
        try {
            Stm = conn.prepareStatement("INSERT INTO `bapers`.`Card_details` (`Card_type`, `Expiry_date`, `Last_four_digits`, `Payment_ID`, `Security_code`) VALUES (?,?,?,?,?) ");
            Stm.setString(1,card_type);
            Stm.setString(2,expiry_date);
            Stm.setString(3,last_digits);
            Stm.setInt(4,payment_ID);
            Stm.setString(5, security_code);
            Stm.executeUpdate();
            Stm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Card_payment read(int id) {
        Card_payment card_payment = null;
        try {
            Stm = conn.prepareStatement("SELECT Card_detailsCard_ID, Payment_Date FROM Payment WHERE Payment_ID = ?");
            Stm.setInt(1, id);
            ResultSet rs1 = Stm.executeQuery();
            Stm = conn.prepareStatement("SELECT * FROM Card_detials WHERE Card_ID = ?");
            Stm.setInt(1, rs1.getInt("Card_detailsCard_ID"));
            ResultSet rs = Stm.executeQuery();
            card_payment = new Card_payment(
                    rs.getDouble(3),
                    rs.getString(2),
                    rs.getString(4),
                    rs.getString(5),
                    rs1.getDate(2),
                    rs1.getString(6)
            );
            rs.close();
            Stm.close();
            System.out.println("Queried " + card_payment.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return card_payment;
    }

    /**
     *
     * @return card_details
     */
    @Override
    public ArrayList<Card_payment> getAll() {
        ArrayList<Card_payment> card_details = null;
        try {
            card_details = new ArrayList<>();
            Stm = conn.prepareStatement("SELECT * FROM Card_details");
            ResultSet rs = Stm.executeQuery();
            while (rs.next()) {
                Card_payment card_payment = new Card_payment(
                        rs.getDouble(3),
                        rs.getString(2),
                        rs.getString(4),
                        rs.getString(5),
                        Date.valueOf("2021-03-28"),
                        rs.getString(6)
                );
                card_details.add(card_payment);
            }
            rs.close();
            Stm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return card_details;
    }

    /**
     *
     * @param id
     * @return removed
     */
    @Override
    public boolean remove(int id) {
        boolean removed = false;
        try {
            Stm = conn.prepareStatement("DELETE FROM Card_details WHERE Card_ID=?");
            Stm.setInt(1, id);
            int update = Stm.executeUpdate();
            Stm.close();
            System.out.println("Removed " + id);
            removed = update == 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return removed;
    }

}
