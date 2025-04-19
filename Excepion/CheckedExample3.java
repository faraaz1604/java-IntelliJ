package Excepion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExample3 {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "user", "pass");
        } catch (SQLException e) {
            System.out.println("Database connection error!");
        }
    }
}
