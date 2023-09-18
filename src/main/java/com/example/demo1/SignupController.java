package com.example.demo1;

import com.mysql.cj.xdevapi.Statement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.time.LocalDate;

public class SignupController {

    @FXML
    private AnchorPane anchorpaneBBSU;

    @FXML
    private Button backbuttton;

    @FXML
    private Button buttonsignupBBD;

    @FXML
    private ChoiceBox<String> chechbox2;

    @FXML
    private ChoiceBox<String> choicebox1;

    @FXML
    private DatePicker datefrom;

    @FXML
    private DatePicker datetodate;

    @FXML
    private Label incorrect;

    @FXML
    private Label labelBBD;

    @FXML
    private Label labelBBN;

    @FXML
    private Label labelPHN;

    @FXML
    private Label labeladdress;

    @FXML
    private Label labelcategory;

    @FXML
    private Label labelcity;

    @FXML
    private Label labelcomponentfacility;

    @FXML
    private Label labelconfirmpassword;

    @FXML
    private Label labelcontactno;

    @FXML
    private Label labeldetails;

    @FXML
    private Label labeldistrict;

    @FXML
    private Label labelemail;

    @FXML
    private Label labelfromdate;

    @FXML
    private Label labelsetpassword;

    @FXML
    private Label labeltodate;

    @FXML
    private Label lablelisenceno;

    @FXML
    private Label lablestate;

    @FXML
    private PasswordField passwordconfirmpassword;

    @FXML
    private Label registered;

    @FXML
    private TextField textBBN;

    @FXML
    private TextField textPHN;

    @FXML
    private TextField textcontactno;

    @FXML
    private TextField textdistrict;

    @FXML
    private TextField textfieldcity;

    @FXML
    private TextField textlicenseno;

    @FXML
    private TextField textsetpassword;

    @FXML
    private TextField textstate;

    @FXML
    private TextField textusername;
    private String date;


    public void signupButtonOnAction(ActionEvent event) throws IOException {
        buttonsignupBBD.setOnAction(e -> {

//            date = String.valueOf(datefrom.getValue());
//            date = String.valueOf(datetodate.getValue());

            if (labelsetpassword.getText().equals(passwordconfirmpassword.getText())) {
//            registeruser();
                incorrect.setText("you are set");
            } else {
                incorrect.setText("password does not match");
            }
        });
    }
//    public void registeruser() {
//
//        DatabaseConnection connectNow = new DatabaseConnection();
//        Connection connectionDB = connectNow.getConnection();
//        Statement statement = null;
//
//        String state = textstate.getText();
//        String district = textdistrict.getText();
//        String city = textfieldcity.getText();
//        String blood_bank_name = textBBN.getText();
//        String email_id = textusername.getText();
//        String lisence_no = textlicenseno.getText();
//        String contact_no = textcontactno.getText();
//        String password = textsetpassword.getText();
//        String parent_hospital = textPHN.getText();
//        LocalDate satrt_date = datefrom.getValue();
//        LocalDate end_date = datetodate.getValue();
//        String category  = chechbox2.getValue();
//        String component_facility = choicebox1.getValue();
//
//
//
//        String currentDate = null;
//        String sql = "select satrt_date()";
//        sql = "select end_date()";
//
//        Statement s = null;
//        try {
//            s = connectionDB.createStatement();
//            ResultSet resultSet = s.executeQuery(sql);
//            if(resultSet.next()) {
//                currentDate = resultSet.getString(1);
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//
//
//
//        String insertFields1 = "insert into admin1_ (state,district,city,blood_bank_name,email_id,lisence_no,contact_no,password) values ('";
//        String insertValues1 = state + "','" + district + "','" + city + "','" + blood_bank_name + "','" + email_id + "','" + lisence_no + "','" + contact_no + "','" + password + "')";
//        String insertFields2 = "insert into admin_2 (parent_hospital,category,satrt_date,end_date,component_facility) values ('";
//        String insertValues2 = parent_hospital + "','" + category + "','" + satrt_date + "','" + end_date + "','" + component_facility + "')";
//        String insertToRegister = insertFields1 + insertValues1 + insertFields2 + insertValues2;
//
//

    public void backtoLogin() {
        try {
            Object root = FXMLLoader.load(getClass().getResource("2_coomon_login_page.fxml")); //pass scene name here
            Scene scene = new Scene((Parent) root);
            Stage registerstage = new Stage();
            registerstage.setScene(scene);
            registerstage.show();
            registerstage.setResizable(false);
            registerstage.setTitle("Login"); // set title of app

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


