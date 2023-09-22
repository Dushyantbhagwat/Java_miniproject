package mini.mini;

/**
 * Sample Skeleton for '3_blood_bank_sign_up.fxml' Controller Class
 */


import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.util.StringConverter;


public class SignupController implements Initializable {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="anchorpaneBBSU"
    private AnchorPane anchorpaneBBSU; // Value injected by FXMLLoader

    @FXML // fx:id="backbuttton"
    private Button backbuttton; // Value injected by FXMLLoader

    @FXML // fx:id="buttonsignupBBD"
    private Button buttonsignupBBD; // Value injected by FXMLLoader

    @FXML // fx:id="chechbox2"
    private ChoiceBox<String> chechbox2; // Value injected by FXMLLoader

    @FXML // fx:id="choicebox1"
    private ChoiceBox<String> choicebox1; // Value injected by FXMLLoader

    @FXML // fx:id="enddate"
    private DatePicker enddate; // Value injected by FXMLLoader

    @FXML // fx:id="incorrect"
    private Label incorrect; // Value injected by FXMLLoader

    @FXML // fx:id="labelBBD"
    private Label labelBBD; // Value injected by FXMLLoader

    @FXML // fx:id="labelBBN"
    private Label labelBBN; // Value injected by FXMLLoader

    @FXML // fx:id="labelPHN"
    private Label labelPHN; // Value injected by FXMLLoader

    @FXML // fx:id="labeladdress"
    private Label labeladdress; // Value injected by FXMLLoader

    @FXML // fx:id="labelcategory"
    private Label labelcategory; // Value injected by FXMLLoader

    @FXML // fx:id="labelcity"
    private Label labelcity; // Value injected by FXMLLoader

    @FXML // fx:id="labelcomponentfacility"
    private Label labelcomponentfacility; // Value injected by FXMLLoader

    @FXML // fx:id="labelconfirmpassword"
    private Label labelconfirmpassword; // Value injected by FXMLLoader

    @FXML // fx:id="labelcontactno"
    private Label labelcontactno; // Value injected by FXMLLoader

    @FXML // fx:id="labeldetails"
    private Label labeldetails; // Value injected by FXMLLoader

    @FXML // fx:id="labeldistrict"
    private Label labeldistrict; // Value injected by FXMLLoader

    @FXML // fx:id="labelemail"
    private Label labelemail; // Value injected by FXMLLoader

    @FXML // fx:id="labelfromdate"
    private Label labelfromdate; // Value injected by FXMLLoader

    @FXML // fx:id="labelsetpassword"
    private Label labelsetpassword; // Value injected by FXMLLoader

    @FXML // fx:id="labeltodate"
    private Label labeltodate; // Value injected by FXMLLoader

    @FXML // fx:id="lablelisenceno"
    private Label lablelisenceno; // Value injected by FXMLLoader

    @FXML // fx:id="lablestate"
    private Label lablestate; // Value injected by FXMLLoader

    @FXML // fx:id="passwordconfirmpassword"
    private PasswordField passwordconfirmpassword; // Value injected by FXMLLoader

    @FXML // fx:id="registered"
    private Label registered; // Value injected by FXMLLoader

    @FXML // fx:id="saveit"
    private Button saveit; // Value injected by FXMLLoader

    @FXML // fx:id="startdate"
    private DatePicker startdate; // Value injected by FXMLLoader

    @FXML // fx:id="textBBN"
    private TextField textBBN; // Value injected by FXMLLoader

    @FXML // fx:id="textPHN"
    private TextField textPHN; // Value injected by FXMLLoader

    @FXML // fx:id="textcontactno"
    private TextField textcontactno; // Value injected by FXMLLoader

    @FXML // fx:id="textdistrict"
    private TextField textdistrict; // Value injected by FXMLLoader

    @FXML // fx:id="textfieldcity"
    private TextField textfieldcity; // Value injected by FXMLLoader

    @FXML // fx:id="textlicenseno"
    private TextField textlicenseno; // Value injected by FXMLLoader

    @FXML // fx:id="textsetpassword"
    private TextField textsetpassword; // Value injected by FXMLLoader

    @FXML // fx:id="textstate"
    private TextField textstate; // Value injected by FXMLLoader

    @FXML // fx:id="textusername"
    private TextField textusername; // Value injected by FXMLLoader

    private Stage stage;
    private Scene scene;
    Timeline timeline;


    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert anchorpaneBBSU != null : "fx:id=\"anchorpaneBBSU\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert backbuttton != null : "fx:id=\"backbuttton\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert buttonsignupBBD != null : "fx:id=\"buttonsignupBBD\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert chechbox2 != null : "fx:id=\"chechbox2\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert choicebox1 != null : "fx:id=\"choicebox1\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert enddate != null : "fx:id=\"enddate\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert incorrect != null : "fx:id=\"incorrect\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert labelBBD != null : "fx:id=\"labelBBD\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert labelBBN != null : "fx:id=\"labelBBN\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert labelPHN != null : "fx:id=\"labelPHN\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert labeladdress != null : "fx:id=\"labeladdress\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert labelcategory != null : "fx:id=\"labelcategory\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert labelcity != null : "fx:id=\"labelcity\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert labelcomponentfacility != null : "fx:id=\"labelcomponentfacility\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert labelconfirmpassword != null : "fx:id=\"labelconfirmpassword\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert labelcontactno != null : "fx:id=\"labelcontactno\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert labeldetails != null : "fx:id=\"labeldetails\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert labeldistrict != null : "fx:id=\"labeldistrict\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert labelemail != null : "fx:id=\"labelemail\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert labelfromdate != null : "fx:id=\"labelfromdate\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert labelsetpassword != null : "fx:id=\"labelsetpassword\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert labeltodate != null : "fx:id=\"labeltodate\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert lablelisenceno != null : "fx:id=\"lablelisenceno\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert lablestate != null : "fx:id=\"lablestate\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert passwordconfirmpassword != null : "fx:id=\"passwordconfirmpassword\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert registered != null : "fx:id=\"registered\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert saveit != null : "fx:id=\"saveit\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert startdate != null : "fx:id=\"startdate\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert textBBN != null : "fx:id=\"textBBN\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert textPHN != null : "fx:id=\"textPHN\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert textcontactno != null : "fx:id=\"textcontactno\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert textdistrict != null : "fx:id=\"textdistrict\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert textfieldcity != null : "fx:id=\"textfieldcity\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert textlicenseno != null : "fx:id=\"textlicenseno\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert textsetpassword != null : "fx:id=\"textsetpassword\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert textstate != null : "fx:id=\"textstate\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";
        assert textusername != null : "fx:id=\"textusername\" was not injected: check your FXML file '3_blood_bank_sign_up.fxml'.";

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            chechbox2.getItems().addAll("Govt","Private","Charitable");
            choicebox1.getItems().addAll("Yes","No");

             chechbox2.setConverter(new StringConverter<String>() {
                 @Override
                 public String toString(String s) {
                     return (s == null) ? "nothing selected" : s ;
                 }

                 @Override
                 public String fromString(String s) {
                     return null;
                 }
             });

        choicebox1.setConverter(new StringConverter<String>() {
            @Override
            public String toString(String s) {
                return (s == null) ? "nothing selected" : s;
            }

            @Override
            public String fromString(String s) {
                return null;
            }
        });
    }


    public void saveOnAction(ActionEvent event) {

        if (textsetpassword.getText().equals(passwordconfirmpassword.getText())) {
            registeruser();
            incorrect.setText("you are set");
        } else {
            incorrect.setText("password does not match");
        }
    }

    public void registeruser() {

        LocalDate localDate = startdate.getValue();
        localDate = enddate.getValue();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String satrt_date = localDate.format(dateTimeFormatter);
        String end_date = localDate.format(dateTimeFormatter);

        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String state = textstate.getText();
        String district = textdistrict.getText();
        String city = textfieldcity.getText();
        String blood_bank_name = textBBN.getText();
        String email_id = textusername.getText();
        String lisence_no = textlicenseno.getText();
        String contact_no = textcontactno.getText();
        String password = textsetpassword.getText();
        String lisence = textlicenseno.getText();
        String parent_hospital = textPHN.getText();
        String component_facility = choicebox1.getValue();
        String category = chechbox2.getValue();

        String insertFields = "insert into admin1_ (state, district, city, blood_bank_name, email_id, lisence_no, contact_no, password) values ('";
        String insertValues = state + "','" + district + "','" + city + "','" + blood_bank_name + "','" + email_id + "','" + lisence_no + "','" + contact_no + "','" + password + "')";
        String insertToRegister1 = insertFields + insertValues;

        String insertFields1 = "insert into admin_2 (lisence, parent_hospital, component_facility, category, satrt_date, end_date) values ('";
        String insertValues1 = lisence + "','" + parent_hospital + "','" + component_facility + "','" + category + "','" + satrt_date + "','" + end_date + "')";
        String insertToRegister2 = insertFields1 + insertValues1;


        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertToRegister1);
            statement.executeUpdate(insertToRegister2);
            registered.setText("You have registered successfully!");

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    @FXML
    void backTologinOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("2_coomon_login_page.fxml"));
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

