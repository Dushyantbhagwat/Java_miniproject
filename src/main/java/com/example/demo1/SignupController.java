package com.example.demo1;

/**
 * Sample Skeleton for '3_blood bank sign up.fxml' Controller Class
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import javax.xml.stream.events.StartDocument;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ResourceBundle;



public class SignupController implements Initializable {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="anchorpaneBBSU"
    private AnchorPane anchorpaneBBSU; // Value injected by FXMLLoader

    @FXML // fx:id="buttonsignupBBD"
    private Button buttonsignupBBD; // Value injected by FXMLLoader

    @FXML // fx:id="datefrom"
    private DatePicker datefrom; // Value injected by FXMLLoader

    @FXML // fx:id="datetodate"
    private DatePicker datetodate; // Value injected by FXMLLoader

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

    @FXML // fx:id="menucharitable"
    private MenuItem menucharitable; // Value injected by FXMLLoader

    @FXML // fx:id="menugovt"
    private MenuItem menugovt; // Value injected by FXMLLoader

    @FXML // fx:id="menuno"
    private MenuItem menuno; // Value injected by FXMLLoader

    @FXML // fx:id="menuprivate"
    private MenuItem menuprivate; // Value injected by FXMLLoader

    @FXML // fx:id="menuredcross"
    private MenuItem menuredcross; // Value injected by FXMLLoader

    @FXML // fx:id="menuyes"
    private MenuItem menuyes; // Value injected by FXMLLoader

    @FXML // fx:id="passwordconfirmpassword"
    private PasswordField passwordconfirmpassword; // Value injected by FXMLLoader

    @FXML // fx:id="splitbuttoncategory"
    private SplitMenuButton splitbuttoncategory; // Value injected by FXMLLoader

    @FXML // fx:id="splitmenubuttonselectvalue"
    private SplitMenuButton splitmenubuttonselectvalue; // Value injected by FXMLLoader

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

    @FXML // fx:id="registered"
    private Label registered; // Value injected by FXMLLoader

    @FXML // fx:id="incorrect"
    private Label incorrect; // Value injected by FXMLLoader
    private com.example.demo1.DatabaseConnection DatabaseConnection;

    @FXML
        // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert anchorpaneBBSU != null : "fx:id=\"anchorpaneBBSU\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert buttonsignupBBD != null : "fx:id=\"buttonsignupBBD\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert datefrom != null : "fx:id=\"datefrom\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert datetodate != null : "fx:id=\"datetodate\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert labelBBD != null : "fx:id=\"labelBBD\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert labelBBN != null : "fx:id=\"labelBBN\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert labelPHN != null : "fx:id=\"labelPHN\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert labeladdress != null : "fx:id=\"labeladdress\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert labelcategory != null : "fx:id=\"labelcategory\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert labelcity != null : "fx:id=\"labelcity\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert labelcomponentfacility != null : "fx:id=\"labelcomponentfacility\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert labelconfirmpassword != null : "fx:id=\"labelconfirmpassword\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert labelcontactno != null : "fx:id=\"labelcontactno\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert labeldetails != null : "fx:id=\"labeldetails\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert labeldistrict != null : "fx:id=\"labeldistrict\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert labelemail != null : "fx:id=\"labelemail\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert labelfromdate != null : "fx:id=\"labelfromdate\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert labelsetpassword != null : "fx:id=\"labelsetpassword\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert labeltodate != null : "fx:id=\"labeltodate\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert lablelisenceno != null : "fx:id=\"lablelisenceno\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert lablestate != null : "fx:id=\"lablestate\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert menucharitable != null : "fx:id=\"menucharitable\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert menugovt != null : "fx:id=\"menugovt\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert menuno != null : "fx:id=\"menuno\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert menuprivate != null : "fx:id=\"menuprivate\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert menuredcross != null : "fx:id=\"menuredcross\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert menuyes != null : "fx:id=\"menuyes\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert passwordconfirmpassword != null : "fx:id=\"passwordconfirmpassword\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert splitbuttoncategory != null : "fx:id=\"splitbuttoncategory\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert splitmenubuttonselectvalue != null : "fx:id=\"splitmenubuttonselectvalue\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert textBBN != null : "fx:id=\"textBBN\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert textPHN != null : "fx:id=\"textPHN\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert textcontactno != null : "fx:id=\"textcontactno\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert textdistrict != null : "fx:id=\"textdistrict\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert textfieldcity != null : "fx:id=\"textfieldcity\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert textlicenseno != null : "fx:id=\"textlicenseno\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert textsetpassword != null : "fx:id=\"textsetpassword\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert textstate != null : "fx:id=\"textstate\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";
        assert textusername != null : "fx:id=\"textusername\" was not injected: check your FXML file '3_blood bank sign up.fxml'.";

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void signupButtonOnAction(ActionEvent event) {
        if (labelsetpassword.getText().equals(passwordconfirmpassword.getText())){
            registeruser();
            incorrect.setText("you are set");
        }else {
            incorrect.setText("password does not match");
        }
    }


    public void date(ActionEvent event) {
        LocalDate localDate = datefrom.getValue();
        LocalDate localDate1 = datetodate.getValue();
    }


        public void registeruser(){

            DatabaseConnection connectNow  = new DatabaseConnection();
            Connection connectionDB = connectNow.getConnection();

            String state = textstate.getText();
            String district = textdistrict.getText();
            String city = textfieldcity.getText();
            String blood_bank_name= textBBN.getText();
            String email_id = textusername.getText();
            String lisence_no = textlicenseno.getText();
            int contact_no = Integer.parseInt("textcontactno.getText()");
            String password = textsetpassword.getText() ;
            String parent_hospital= textPHN.getText();
            String category= splitbuttoncategory.getText();
//            String satrt_date= datefrom.getText();
//            String end_date = datetodate.getText();
            String component_facility= splitmenubuttonselectvalue.getText();

            String insertFields1="insert into admin_1 (state,district,city,blood_bank_name,email_id,lisence_no,contact_no,password) values ('";
            String insertValues1= state + "','" + district + "','" + city + "','" + blood_bank_name + "','" + email_id + "','" + lisence_no + "','" + contact_no + "','" + password + "')";
            String insertFields2 ="insert into admin_2 (parent_hospital,category,satrt_date,end_date,component_facility) values ('";
            String insertValues2 = parent_hospital + "','" + category +  "','" + component_facility + "')";
            String insertToRegister= insertFields1 + insertValues1 + insertFields2 + insertValues2;

            try{
                Statement statement = connectionDB.createStatement();
                statement.executeUpdate(insertToRegister);

                registered.setText("You have registered successfully!");

            }catch (Exception e){
                e.printStackTrace();
                e.getCause();
            }




        }




}

