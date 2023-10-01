package mini.mini;

import java.sql.*;
import java.sql.DriverManager;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

public class DatabaseConnection {


    public Connection databaselink;

    public Connection getConnection() {
        String databaseName = "mini_project";
        String databaseUser = "root";
        String databasePassword = "haunting363@";
        String url = "jdbc:mysql://localhost/" + databaseName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaselink = DriverManager.getConnection(url, databaseUser, databasePassword);

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
            System.out.println("not done");
        }
        return databaselink;

    }
}










//
//    /* Establishing Connection */
//    static String url = "jdbc:mysql://localhost:3306/miniproject";
//    static String user = "root";
//    static String dbpassword = "1937rbpynky@";
//    static Connection connection;
//
//    static {
//        try {
//            connection = DriverManager.getConnection(url, user, dbpassword);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    static int validateuser(String username) throws SQLException {
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery("select * from blood_guardians");
//        while (resultSet.next()) {
//            String usernametext = resultSet.getString("username");
//            if (username.equals(usernametext)) {
//                return 0;
//            }
//        }
//        return 1;
//    }
//
//    static int validatePassword(String username, String password) throws SQLException {
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery("select * from blood_guardians");
//        while (resultSet.next()) {
//            String usernametext = resultSet.getString("username");
//            if (username.equals(usernametext)) {
//                String passwordtext = resultSet.getString("password");
//                if (password.equals(passwordtext)) {
//                    return 0;
//                }
//            }
//        }
//        return 1;
//    }
//}


