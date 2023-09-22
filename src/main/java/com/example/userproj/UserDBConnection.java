package com.example.userproj;

import java.sql.Connection;
import java.sql.DriverManager;

public class UserDBConnection {

    public Connection databaselink;

    public Connection getConnection() {
        String databaseName = "javafx_login";
        String databaseUser = "root";
        String databasepassword = "Vaibhav22@sql";
        String url = "jdbc:mysql://localhost:3306/" + databaseName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaselink = DriverManager.getConnection(url, databaseUser, databasepassword);

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return databaselink;

    }
}
