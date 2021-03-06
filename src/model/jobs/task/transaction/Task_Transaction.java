package model.jobs.task.transaction;

import model.database.DB_Connection;
import model.discounts.discount.transaction.I_DiscountTransaction;
import model.jobs.task.Task;
import model.jobs.task.Task_List;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Manpreet
 */

public class Task_Transaction implements I_Task_Transaction {

    private PreparedStatement Stm = null;
    private Connection conn;
    private I_DiscountTransaction discount;

    /**
     * constructor
     *
     * @param conn
     * @param discount
     */
    public Task_Transaction(DB_Connection conn, I_DiscountTransaction discount){
        this.conn = conn.getConn();
        this.discount = discount;
    }

    /**
     * creates a new Task
     *
     * @param existing_task
     * @param Job_ID
     * @param technician
     * @param task_status
     */
    public void addTask(String existing_task, int Job_ID, String technician, String task_status) {
        int ExistingTask_ID = 0;
        int user_ID = 0;
        try {
            Stm = conn.prepareStatement("select Catalog_ID from Task_Catalog where Task_name = ? ");
            Stm.setString(1,existing_task);
            ResultSet rs = Stm.executeQuery();
            while (rs.next()){
                ExistingTask_ID = rs.getInt(1);
            }
            Stm = conn.prepareStatement("select user_account_id from User_account where name = ? ");
            Stm.setString(1,technician);
            ResultSet rs1 = Stm.executeQuery();
            while (rs1.next()){
                user_ID = rs1.getInt(1);
            }
            rs.close();
            rs1.close();
            Stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        new Task(task_status);
        //calls the save method
        storeTaskDetails(ExistingTask_ID, Job_ID, user_ID, task_status);
    }

    /**
     * store task details in the database
     *
     * @param ExistingTask_ID
     * @param Job_ID
     * @param user_ID
     * @param task_status
     */
    public void storeTaskDetails(int ExistingTask_ID, int Job_ID, int user_ID, String task_status) {
        try {
            Stm = conn.prepareStatement("INSERT INTO `bapers`.`Task` (`Task_status`,`Task_start`, `User_accountUser_ID`,`Task_CatalogCatalog_ID`, `JobJob_ID`) VALUES (?,?,?,?,?) ");
            Stm.setString(1, task_status);
            Stm.setTimestamp(2, Timestamp.valueOf(LocalDateTime.now()));
            Stm.setInt(3, user_ID);
            Stm.setInt(4, ExistingTask_ID);
            Stm.setInt(5, Job_ID);
            Stm.executeUpdate();
            Stm.close();
            calculateSub_price(Job_ID, ExistingTask_ID);
            discount.calculatePrice(Job_ID);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * updates the task status in the database
     *
     * @param Task_ID
     * @param Task_status
     */
    public void updateTaskStatus(int Task_ID, String Task_status) {
        try {
            Stm = conn.prepareStatement("UPDATE `bapers`.`Task` SET Task_status = ? WHERE Task_ID =?;");
            Stm.setString(1, Task_status);
            Stm.setInt(2,Task_ID);
            Stm.executeUpdate();
            Stm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (Task_status == "Processing"){
            start(Task_ID);
        }

        if (Task_status == "Completed"){
            finish(Task_ID);
        }
    }

    /**
     * calculates the sub total price of a job
     *
     * @param job_ID
     * @param ExistingTask_ID
     */
    public void calculateSub_price(int job_ID, int ExistingTask_ID){
        try {
            double task_price = 0;
            double subtotal_price = 0;

            Stm = conn.prepareStatement("select Price from Task_Catalog where Catalog_ID = ? ");
            Stm.setInt(1, ExistingTask_ID);
            ResultSet rs = Stm.executeQuery();
            while(rs.next()){
                task_price = rs.getDouble("Price");
            }
            rs.close();
            Stm.close();

            Stm = conn.prepareStatement("select Subtotal_price from Job where Job_ID = ? ");
            Stm.setInt(1, job_ID);
            ResultSet rs2 = Stm.executeQuery();
            while(rs2.next()){
                subtotal_price = rs2.getDouble("Subtotal_price");
            }
            rs2.close();
            Stm.close();

            subtotal_price = subtotal_price + task_price;

            Stm = conn.prepareStatement("UPDATE `bapers`.`Job` SET Subtotal_price = ? WHERE Job_ID =?;");
            Stm.setDouble(1, subtotal_price);
            Stm.setInt(2,job_ID);
            Stm.executeUpdate();
            Stm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * stores the start_time of the task in the database
     *
     * @param Task_ID
     */
    public void start( int Task_ID) {
        try {
            Stm = conn.prepareStatement("UPDATE `bapers`.`Task` SET Task_start = ? WHERE Task_ID =?;");
            Stm.setTimestamp(1, Timestamp.valueOf(LocalDateTime.now()));
            Stm.setInt(2,Task_ID);
            Stm.executeUpdate();
            Stm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * stores the finish_time of the task in the database
     *
     * @param Task_ID
     */
    public void finish( int Task_ID) {
        try {
            Stm = conn.prepareStatement("UPDATE `bapers`.`Task` SET Task_completion = ? WHERE Task_ID =?;");
            Stm.setTimestamp(1, Timestamp.valueOf(LocalDateTime.now()));
            Stm.setInt(2,Task_ID);
            Stm.executeUpdate();
            Stm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * returns a list of existing task names
     *
     * @return tasks
     */
    public String[] retrieveExistingTasks(){
        int i = 1;
        String[] tasks = new String[0];
        int rowCount = 0;
        try {
            Stm = conn.prepareStatement("SELECT COUNT(*) FROM Task_Catalog");
            ResultSet rs1 = Stm.executeQuery();
            while(rs1.next()){
                rowCount = rs1.getInt(1);
            }
            rs1.close();
            Stm.close();
            Stm = conn.prepareStatement("SELECT Task_name FROM Task_Catalog");
            ResultSet rs = Stm.executeQuery();
            tasks = new String[rowCount+1];
            tasks[0] = "Select Task";
            while (rs.next()){
                tasks[i] = rs.getString(1);
                i++;
            }
            rs.close();
            Stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    /**
     * returns a list of technician names
     *
     * @param existing_task
     * @return technician
     */
    public String[] retrieveTechnicians(String existing_task){
        int i = 1;
        String department = null;
        String[] technician = new String[0];
        int rowCount = 0;
        try {
            PreparedStatement Stm1 = conn.prepareStatement("select Task_department from Task_Catalog where Task_name = ? ");
            Stm1.setString(1,existing_task);
            ResultSet rs2 = Stm1.executeQuery();
            while (rs2.next()){
                department = rs2.getString(1);
            }

            Stm = conn.prepareStatement("SELECT COUNT(*) FROM User_account WHERE department= ?");
            Stm.setString(1,department);
            ResultSet rs1 = Stm.executeQuery();
            while(rs1.next()){
                rowCount = rs1.getInt(1);
            }
            rs1.close();
            Stm.close();
            Stm = conn.prepareStatement("SELECT name FROM User_account WHERE department = ?");
            Stm.setString(1,department);
            ResultSet rs = Stm.executeQuery();
            technician = new String[rowCount+1];
            technician[0] = "Select Technician";
            while (rs.next()){
                technician[i] = rs.getString(1);
                i++;
            }
            rs.close();
            Stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return technician;
    }

    /**
     * returns a list of task which are associated with the job
     *
     * @param job_ID
     * @return task_details
     */
    public ArrayList<Task_List> getAllTasks(int job_ID) {
        ArrayList<Task_List> task_details = null;
        try {
            task_details = new ArrayList<>();
            Stm = conn.prepareStatement("SELECT * FROM Task WHERE JobJob_ID = ?");
            Stm.setInt(1, job_ID);
            ResultSet rs = Stm.executeQuery();
            while (rs.next()) {
                Stm = conn.prepareStatement("SELECT * FROM Task_Catalog WHERE Catalog_ID = ?");
                Stm.setInt(1, rs.getInt(6));
                ResultSet rs1 = Stm.executeQuery();
                while (rs1.next()){
                    Task_List task = new Task_List(
                            rs.getInt(1),
                            rs1.getString(2),
                            rs1.getString(4),
                            rs.getString(2),
                            rs1.getDouble(3),
                            rs1.getInt(5)
                    );
                    task_details.add(task);
                }
                rs1.close();
            }
            rs.close();
            Stm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return task_details;
    }

    /**
     *
     * @param id
     * @return task
     */
    @Override
    public Task read(int id) {
        Task task = null;
        try {
            Stm = conn.prepareStatement("SELECT * FROM Task WHERE Task_ID = ?");
            Stm.setInt(1, id);
            ResultSet rs = Stm.executeQuery();
            task = new Task(
                    rs.getString(2)
            );
            rs.close();
            Stm.close();
            System.out.println("Queried " + task.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return task;
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
            Stm = conn.prepareStatement("DELETE FROM Task WHERE Task_ID =?");
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
