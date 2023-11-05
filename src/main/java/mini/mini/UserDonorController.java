package mini.mini;

/**
 * Sample Skeleton for '12_DONOR PAGE (1).fxml' Controller Class
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

    public class UserDonorController implements Initializable {

        @FXML // fx:id="iamgehome"
        private ImageView iamgehome; // Value injected by FXMLLoader

        @FXML // ResourceBundle that was given to the FXMLLoader
        private ResourceBundle resources;

        @FXML // URL location of the FXML file that was given to the FXMLLoader
        private URL location;

//        @FXML // fx:id="Checkbox1"
//        private CheckBox Checkbox1; // Value injected by FXMLLoader

        @FXML // fx:id="Checkbox2"
        private CheckBox Checkbox2; // Value injected by FXMLLoader

        @FXML // fx:id="DonateButton"
        private Button DonateButton; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanelBG"
        private Label anchorpanelBG; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanello"
        private Button anchorpanello; // Value injected by FXMLLoader

        @FXML // fx:id="RULES1"
        private Button RULES1; // Value injected by FXMLLoader

        @FXML // fx:id="message"
        private Label message; // Value injected by FXMLLoader

        private Stage stage;
        private Scene scene;


        @FXML
            // This method is called by the FXMLLoader when initialization is complete
        void initialize() {
            assert Checkbox1 != null : "fx:id=\"Checkbox1\" was not injected: check your FXML file '12_DONOR PAGE (1).fxml'.";
            assert Checkbox2 != null : "fx:id=\"Checkbox2\" was not injected: check your FXML file '12_DONOR PAGE (1).fxml'.";
            assert DonateButton != null : "fx:id=\"DonateButton\" was not injected: check your FXML file '12_DONOR PAGE (1).fxml'.";
            assert anchorpanelBG != null : "fx:id=\"anchorpanelBG\" was not injected: check your FXML file '12_DONOR PAGE (1).fxml'.";
            assert anchorpanello != null : "fx:id=\"anchorpanello\" was not injected: check your FXML file '12_DONOR PAGE (1).fxml'.";
            assert iamgehome != null : "fx:id=\"iamgehome\" was not injected: check your FXML file '12_DONOR PAGE.fxml'.";
            assert RULES1 != null : "fx:id=\"RULES1\" was not injected: check your FXML file '12_DONOR PAGE.fxml'.";
            assert message != null : "fx:id=\"message\" was not injected: check your FXML file '12_DONOR PAGE.fxml'.";
        }

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {

            File backFile1 = new File("im/bgdonor.jpg");
            Image backImage1 = new Image(backFile1.toURI().toString());
            iamgehome.setImage(backImage1);

        }


        public void donateButtonOnAction(ActionEvent actionEvent) throws SQLException {
            DatabaseConnection connectNow = new DatabaseConnection();
            Connection connectDB = connectNow.getConnection();

            int loggedInUserId = AuthService.getInstance().getLoggedInUserId();

            if (loggedInUserId != -1) {
                try {
                    // Get the current date
                    java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());

                    // Calculate the date 30 days ago
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(currentDate);
                    cal.add(Calendar.DATE, -30);
                    java.sql.Date thirtyDaysAgo = new java.sql.Date(cal.getTimeInMillis());

                    // Check if there is a record with the same user_id and request_date within the last 30 days
                    String checkExistingRequest = "SELECT COUNT(*) FROM donor WHERE user_id = ? AND request_date >= ?";
                    PreparedStatement checkStatement = connectDB.prepareStatement(checkExistingRequest);
                    checkStatement.setInt(1, loggedInUserId);
                    checkStatement.setDate(2, thirtyDaysAgo);
                    ResultSet resultSet = checkStatement.executeQuery();

                    resultSet.next();
                    int count = resultSet.getInt(1);

                    if (count > 0) {
                        showAlert("Request Not Allowed", "You must wait at least 30 days between donations.");
                    } else {
                        String insertToRegister5 = "INSERT INTO donor (user_id, request_date) VALUES (?, ?)";
                        PreparedStatement preparedStatement = connectDB.prepareStatement(insertToRegister5);
                        preparedStatement.setInt(1, loggedInUserId);
                        preparedStatement.setDate(2, currentDate);
                        preparedStatement.executeUpdate();

                        message.setText("Your request to donate blood has been made!");
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("error");
            }
        }

//        public void donateButtonOnAction(ActionEvent actionEvent) throws SQLException {
//            DatabaseConnection connectNow = new DatabaseConnection();
//            Connection connectDB = connectNow.getConnection();
//
//            int loggedInUserId = AuthService.getInstance().getLoggedInUserId();
//
//            if (loggedInUserId != -1) {
//                try {
//                    // Get the current date
//                    java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
//
//                    // Checking if there is a record with the same user_id and request_date
//                    String checkExistingRequest = "SELECT COUNT(*) FROM donor WHERE user_id = ? AND request_date = ?";
//                    PreparedStatement checkStatement = connectDB.prepareStatement(checkExistingRequest);
//                    checkStatement.setInt(1, loggedInUserId);
//                    checkStatement.setDate(2, currentDate);
//                    ResultSet resultSet = checkStatement.executeQuery();
//
//                    resultSet.next();
//                    int count = resultSet.getInt(1);
//
//                    if (count > 0) {
//                        showAlert("Request Already Made", "You've already made a request to donate blood today.");
//                    } else {
//                        String insertToRegister5 = "INSERT INTO donor (user_id, request_date) VALUES (?, ?)";
//
//                    PreparedStatement preparedStatement = connectDB.prepareStatement(insertToRegister5);
//                    preparedStatement.setInt(1, loggedInUserId);
//                    preparedStatement.setDate(2, currentDate);
//                    preparedStatement.executeUpdate();
//
//                    message.setText("You request to donate blood has been made!");
//                }} catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
//            } else {
//                System.out.println("error");
//            }
//        }

        private void showAlert(String title, String message) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle(title);
            alert.setHeaderText(null);
            alert.setContentText(message);
            alert.showAndWait();
        }


//        public void donateButtonOnAction(ActionEvent actionEventevrnt) throws SQLException{
//
//
//            DatabaseConnection connectNow = new DatabaseConnection();
//            Connection connectDB = connectNow.getConnection();
//
//            int loggedInUserId = AuthService.getInstance().getLoggedInUserId();
//            if (loggedInUserId != -1) {
//                try {
//
//                    java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
//
//                    String insertToRegister5 = "INSERT INTO donor (user_id, request_date) VALUES (?, ?)";
//
//                    PreparedStatement preparedStatement = connectDB.prepareStatement(insertToRegister5);
//                    preparedStatement.setInt(1, loggedInUserId);
//                    preparedStatement.setDate(2, currentDate);
//                    preparedStatement.executeUpdate();
//
//                    message.setText("You request to donate blood has been made!");
//
//                } catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
//            } else {
//                System.out.println("error");
//            }
//        }


//        public void donateButtonOnAction(ActionEvent actionEventevent) throws SQLException {
//
//            DatabaseConnection connectNow = new DatabaseConnection();
//            Connection connectDB = connectNow.getConnection();
//
//            int loggedInUserId = AuthService.getInstance().getLoggedInUserId();
//            if (loggedInUserId != -1) {
//                try {
//
//                    String insertFields = "insert into donor(user_id, request_date) values ('";
//                    String inserValues = loggedInUserId + "')";
//                    String insertToRegister5 = insertFields + inserValues;
//
//                    Statement statement = connectDB.createStatement();
//                    statement.executeUpdate(insertToRegister5);
//
//                    message.setText("You request to donate blood has been made!");
//
//                } catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
//            } else {
//                System.out.println("error");
//            }
//
//        }

        public void requestbuttonOnAction(ActionEvent actionEventevrnt) throws SQLException{


            DatabaseConnection connectNow = new DatabaseConnection();
            Connection connectDB = connectNow.getConnection();

            int loggedInUserId = AuthService.getInstance().getLoggedInUserId();
            if (loggedInUserId != -1) {
                try {

                    // Get the current date
                    java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());

                    // Checking if there is a record with the same user_id and request_date
                    String checkExistingRequest = "SELECT COUNT(*) FROM patient_table WHERE user_id = ? AND request_date = ?";
                    PreparedStatement checkStatement = connectDB.prepareStatement(checkExistingRequest);
                    checkStatement.setInt(1, loggedInUserId);
                    checkStatement.setDate(2, currentDate);
                    ResultSet resultSet = checkStatement.executeQuery();

                    resultSet.next();

                    int count = resultSet.getInt(1);

                    if (count > 0) {
                        showAlert("Request Already Made", "You've already made a request for blood today.");
                    }else {

                        String insertToRegister5 = "INSERT INTO patient_table (user_id, request_date) VALUES (?, ?)";

                        PreparedStatement preparedStatement = connectDB.prepareStatement(insertToRegister5);
                        preparedStatement.setInt(1, loggedInUserId);
                        preparedStatement.setDate(2, currentDate);
                        preparedStatement.executeUpdate();

                        message.setText("You request for blood has been made!");
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("error");
            }
        }


        @FXML
        void loginbuttonOnAction(ActionEvent event) {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("2_coomon_login_page.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            try {
                scene = new Scene(fxmlLoader.load());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Login");

        }

        @FXML
        void HomeButtonOnAction(ActionEvent event) {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("9_patientoverview.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            try {
                scene = new Scene(fxmlLoader.load());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Home");


        }

        @FXML
        void ShowrulesOnAction(ActionEvent event) {

            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("13_rules for donation.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            try {
                scene = new Scene(fxmlLoader.load());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Rules");

        }




    }
