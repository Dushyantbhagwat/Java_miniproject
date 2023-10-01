/**
 * Sample Skeleton for '8_user sign up.fxml' Controller Class
 */

package com.example.user;

import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.StringConverter;

import java.io.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class userSignupController implements Initializable {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="addresstext"
    private TextArea addresstext; // Value injected by FXMLLoader


    @FXML // fx:id="anchorpanescreen"
    private AnchorPane anchorpanescreen; // Value injected by FXMLLoader

    @FXML // fx:id="bloodguardianslabel"
    private Label bloodguardianslabel; // Value injected by FXMLLoader


    @FXML // fx:id="button_back"
    private Button button_back; // Value injected by FXMLLoader

    @FXML // fx:id="confirmtext"
    private TextField confirmtext; // Value injected by FXMLLoader

    @FXML // fx:id="contactnumbertext"
    private TextField contactnumbertext; // Value injected by FXMLLoader

    @FXML // fx:id="dateofbirthtext"
    private DatePicker dateofbirthtext; // Value injected by FXMLLoader

    @FXML // fx:id="emailidtext"
    private TextField emailidtext; // Value injected by FXMLLoader

    @FXML // fx:id="emailidtext1"
    private TextField emailidtext1; // Value injected by FXMLLoader

    @FXML // fx:id="fullbackgimage"
    private ImageView fullbackgimage; // Value injected by FXMLLoader

    @FXML // fx:id="bloodgroupchoice"
    private ChoiceBox<String> bloodgroupchoice; // Value injected by FXMLLoader


    @FXML // fx:id="passwordtext"
    private TextField passwordtext; // Value injected by FXMLLoader

    @FXML // fx:id="profiletext"
    private Label profiletext; // Value injected by FXMLLoader

    @FXML // fx:id="registerduser"
    private Label registerduser; // Value injected by FXMLLoader

    @FXML // fx:id="signupbutton"
    private Button signupbutton; // Value injected by FXMLLoader

    @FXML // fx:id="filess"
    private Button filess; // Value injected by FXMLLoader

    @FXML // fx:id="labelfile"
    private Label labelfile; // Value injected by FXMLLoader

    private Stage stage;
    private Scene scene;
    Timeline timeline;

    Label warning;

    @FXML
        // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert addresstext != null : "fx:id=\"addresstext\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert anchorpanescreen != null : "fx:id=\"anchorpanescreen\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert bloodgroupchoice != null : "fx:id=\"bloodgroupchoice\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert bloodguardianslabel != null : "fx:id=\"bloodguardianslabel\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert button_back != null : "fx:id=\"button_back\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert confirmtext != null : "fx:id=\"confirmtext\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert contactnumbertext != null : "fx:id=\"contactnumbertext\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert dateofbirthtext != null : "fx:id=\"dateofbirthtext\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert emailidtext != null : "fx:id=\"emailidtext\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert emailidtext1 != null : "fx:id=\"emailidtext1\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert fullbackgimage != null : "fx:id=\"fullbackgimage\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert passwordtext != null : "fx:id=\"passwordtext\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert profiletext != null : "fx:id=\"profiletext\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert registerduser != null : "fx:id=\"registerduser\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert signupbutton != null : "fx:id=\"signupbutton\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert addresstext != null : "fx:id=\"addresstext\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert filess != null : "fx:id=\"filess\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert labelfile != null : "fx:id=\"labelfile\" was not injected: check your FXML file '8_user sign up.fxml'.";
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        File backFile = new File("im/background.png");
        Image backImage = new Image(backFile.toURI().toString());
        fullbackgimage.setImage(backImage);

        bloodgroupchoice.getItems().addAll("A+", "B+", "O+", "AB+", "A-", "B-", "O-", "AB-");
        bloodgroupchoice.setConverter(new StringConverter<String>() {
            @Override
            public String toString(String s) {
                return (s == null) ? "select blood group" : s;
            }

            @Override
            public String fromString(String s) {
                return null;
            }
        });
    }

    @FXML
    void filesetOnAction(ActionEvent event){
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(filess.getScene().getWindow());
        String filename = file.getAbsolutePath();
        labelfile.setText(filename);
        }




    public void signupOnAction(ActionEvent event) throws SQLException, FileNotFoundException {
        if (passwordtext.getText().equals(confirmtext.getText())) {
            registeruser();
        } else {
            registerduser.setText("password does not match!");

        }
    }

    public void registeruser() throws SQLException, FileNotFoundException {
        {
            LocalDate localDate = dateofbirthtext.getValue();
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String DOB = localDate.format(dateTimeFormatter);


            DatabaseConnection connectNow = new DatabaseConnection();
            Connection connectDB = connectNow.getConnection();

            PreparedStatement psinsert = null;
            PreparedStatement pscheck = null;
            ResultSet resultSet = null;

            String name = emailidtext1.getText();
            String password = passwordtext.getText();
            String emailid = emailidtext.getText();
            String phonenumber = contactnumbertext.getText();
            String blood_grp = bloodgroupchoice.getValue();
            String address = addresstext.getText();
            InputStream report = new FileInputStream(labelfile.getText());
            try {
                pscheck = connectDB.prepareStatement("select * from users where emailid= ?");
                pscheck.setString(1, emailid);
                resultSet = pscheck.executeQuery();
                if (resultSet.isBeforeFirst()) {
                    System.out.println("User Already Exists...");
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("YOU CANNOT USE THIS EMAILID.");
                    alert.show();
                } else {
                    // Prepare the insert statement with a parameter for the Blob
                    String insertSQL = "insert into users (name, DOB, password, emailid, phonenumber, address, blood_grp, report) values (?, ?, ?, ?, ?, ?, ?, ?)";

                    // Create a PreparedStatement for inserting data
                    psinsert = connectDB.prepareStatement(insertSQL);

                    // Set parameters for the PreparedStatement
                    psinsert.setString(1, name);
                    psinsert.setString(2, DOB);
                    psinsert.setString(3, password);
                    psinsert.setString(4, emailid);
                    psinsert.setString(5, phonenumber);
                    psinsert.setString(6, address);
                    psinsert.setString(7, blood_grp);
                    psinsert.setBlob(8, report); // Set the Blob parameter

                    // Execute the insert statement
                    int rowsInserted = psinsert.executeUpdate();

                    if (rowsInserted > 0) {
                        System.out.println("You have registered successfully!");
                    } else {
                        System.out.println("Insertion failed.");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Close resources (resultset, statements, connection) in a finally block
                try {
                    if (resultSet != null) {
                        resultSet.close();
                    }
                    if (pscheck != null) {
                        pscheck.close();
                    }
                    if (psinsert != null) {
                        psinsert.close();
                    }
                    if (connectDB != null) {
                        connectDB.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @FXML
    void backTologinOnAction(ActionEvent event) {
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

}








