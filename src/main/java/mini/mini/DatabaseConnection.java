package mini.mini;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {


    public Connection databaselink;

    public Connection getConnection() {
        String databaseName = "bloodbank";
        String databaseUser = "root";
        String databasepassword = "1937rbpy";
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

