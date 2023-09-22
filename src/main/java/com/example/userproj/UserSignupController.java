package com.example.userproj;

/**
 * Sample Skeleton for '8_user sign up.fxml' Controller Class
 */

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
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class UserSignupController implements Initializable {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="a"
    private MenuItem a; // Value injected by FXMLLoader

    @FXML // fx:id="ab"
    private MenuItem ab; // Value injected by FXMLLoader

    @FXML // fx:id="abm"
    private MenuItem abm; // Value injected by FXMLLoader

    @FXML // fx:id="addresstext"
    private TextField addresstext; // Value injected by FXMLLoader

    @FXML // fx:id="am"
    private MenuItem am; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpanescreen"
    private AnchorPane anchorpanescreen; // Value injected by FXMLLoader

    @FXML // fx:id="b"
    private MenuItem b; // Value injected by FXMLLoader

    @FXML // fx:id="bloodgroupmenu"
    private SplitMenuButton bloodgroupmenu; // Value injected by FXMLLoader

    @FXML // fx:id="bloodguardianslabel"
    private Label bloodguardianslabel; // Value injected by FXMLLoader

    @FXML // fx:id="bm"
    private MenuItem bm; // Value injected by FXMLLoader

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

    @FXML // fx:id="o"
    private MenuItem o; // Value injected by FXMLLoader

    @FXML // fx:id="om"
    private MenuItem om; // Value injected by FXMLLoader

    @FXML // fx:id="iamge_"
    private ImageView iamge_; // Value injected by FXMLLoader

    @FXML // fx:id="passwordtext"
    private TextField passwordtext; // Value injected by FXMLLoader

    @FXML // fx:id="registerduser"
    private Label registerduser; // Value injected by FXMLLoader

    @FXML // fx:id="profiletext"
    private Label profiletext; // Value injected by FXMLLoader

    @FXML // fx:id="signupbutton"
    private Button signupbutton; // Value injected by FXMLLoader

    @FXML // fx:id="button_back"
    private Button button_back; // Value injected by FXMLLoader


    private Stage stage;
    private Scene scene;
    Timeline timeline;

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert a != null : "fx:id=\"a\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert ab != null : "fx:id=\"ab\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert abm != null : "fx:id=\"abm\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert addresstext != null : "fx:id=\"addresstext\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert am != null : "fx:id=\"am\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert anchorpanescreen != null : "fx:id=\"anchorpanescreen\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert b != null : "fx:id=\"b\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert bloodgroupmenu != null : "fx:id=\"bloodgroupmenu\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert bloodguardianslabel != null : "fx:id=\"bloodguardianslabel\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert bm != null : "fx:id=\"bm\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert button_back != null : "fx:id=\"button_back\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert confirmtext != null : "fx:id=\"confirmtext\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert contactnumbertext != null : "fx:id=\"contactnumbertext\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert dateofbirthtext != null : "fx:id=\"dateofbirthtext\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert emailidtext != null : "fx:id=\"emailidtext\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert emailidtext1 != null : "fx:id=\"emailidtext1\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert fullbackgimage != null : "fx:id=\"fullbackgimage\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert o != null : "fx:id=\"o\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert om != null : "fx:id=\"om\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert passwordtext != null : "fx:id=\"passwordtext\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert profiletext != null : "fx:id=\"profiletext\" was not injected: check your FXML file '8_user sign up.fxml'.";
        assert signupbutton != null : "fx:id=\"signupbutton\" was not injected: check your FXML file '8_user sign up.fxml'.";

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        File backFile = new File("im/background.png");
        Image backImage = new Image(backFile.toURI().toString());
        iamge_.setImage(backImage);
    }

    public void registeruser() {

        LocalDate localDate = dateofbirthtext.getValue();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String satrt_date = localDate.format(dateTimeFormatter);


        UserDBConnection connectNow = new UserDBConnection();
        Connection connectDB = connectNow.getConnection();

        String username = emailidtext1.getText();
        String password = passwordtext.getText();
        String emailid = emailidtext.getText();
        String phonenumber = contactnumbertext.getText();
        String address = addresstext.getText();
        String lisence_no = confirmtext.getText();

        String insertFields = "insert into users (username,password, emailid, phonenumber,address) values ('";
        String insertValues = username + "','" + password + "','" + emailid + "','" + phonenumber + "','" + address + "')";
        String insertToRegister1 = insertFields + insertValues;


        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertToRegister1);
            registerduser.setText("You have registered successfully!");

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }


    @FXML
    void backTologinOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("2_coomon login page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
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




