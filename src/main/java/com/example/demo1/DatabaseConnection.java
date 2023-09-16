package com.example.demo1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Connection databaselink;

    public Connection getConnection(){
        String databaseName = "user";
        String databaseUser = "root";
        String databsepassword = "1937rbpy";
        String url = "jdbc:mysql://localhost/" + databaseName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaselink = DriverManager.getConnection(url,databaseUser,databsepassword);

        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return databaselink;

    }

}
