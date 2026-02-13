package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/pos_system";
    private static final String USER = "root"; // replace with your DB username
    private static final String PASSWORD = ""; // replace with your DB password

    // Static method so it can be called without creating an object
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
