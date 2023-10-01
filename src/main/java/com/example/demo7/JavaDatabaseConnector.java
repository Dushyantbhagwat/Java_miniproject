package com.example.demo7;


import java.sql.*;


public class JavaDatabaseConnector {
    /* Establishing Connection */
    static String url = "jdbc:mysql://localhost:3306/ams";
    static String user = "javafx_login";
    static String dbpassword = "Vaibhav22@sql";
    static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(url, user, dbpassword);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
    /* database connection code ends here */

