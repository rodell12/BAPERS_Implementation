package model.admin.userAccount.transaction;

import model.Transaction;
import model.admin.userAccount.UserAccount;

import java.sql.SQLException;
import java.util.ArrayList;

public interface I_UserAccountTransaction extends Transaction {
    UserAccount create(String name, String email, int phone, String password, String role) throws SQLException;
    UserAccount update(int id, String name, String email, int phone, String password, String role) throws SQLException;
}