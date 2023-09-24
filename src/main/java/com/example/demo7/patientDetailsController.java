package com.example.demo7;

/**
 * Sample Skeleton for 'patient_details.fxml' Controller Class
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class patientDetailsController implements Initializable {
private Stage stage;

private Scene scene;
        @FXML // ResourceBundle that was given to the FXMLLoader
        private ResourceBundle resources;

        @FXML // URL location of the FXML file that was given to the FXMLLoader
        private URL location;

        @FXML // fx:id="anchorpaneP"
        private AnchorPane anchorpaneP; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpaneSP"
        private AnchorPane anchorpaneSP; // Value injected by FXMLLoader

        @FXML // fx:id="buttonbloodrequest"
        private Button buttonbloodrequest; // Value injected by FXMLLoader

        @FXML // fx:id="buttondonor"
        private Button buttondonor; // Value injected by FXMLLoader

        @FXML // fx:id="buttonhome"
        private Button buttonhome; // Value injected by FXMLLoader

        @FXML // fx:id="buttonlogout"
        private Button buttonlogout; // Value injected by FXMLLoader

        @FXML // fx:id="buttonpatient"
        private Button buttonpatient; // Value injected by FXMLLoader

        @FXML // fx:id="iamgebloodrequest"
        private ImageView iamgebloodrequest; // Value injected by FXMLLoader

        @FXML // fx:id="iamgehome"
        private ImageView iamgehome; // Value injected by FXMLLoader

        @FXML // fx:id="iamgepatient"
        private ImageView iamgepatient; // Value injected by FXMLLoader

        @FXML // fx:id="imagedonor"
        private ImageView imagedonor; // Value injected by FXMLLoader

        @FXML // fx:id="labelBG"
        private Label labelBG; // Value injected by FXMLLoader

        @FXML // fx:id="sliderP"
        private Slider sliderP; // Value injected by FXMLLoader

        @FXML // fx:id="tablecolumnage"
        private TableColumn<?, ?> tablecolumnage; // Value injected by FXMLLoader

        @FXML // fx:id="tablecolumnbloodgroup"
        private TableColumn<?, ?> tablecolumnbloodgroup; // Value injected by FXMLLoader

        @FXML // fx:id="tablecolumncontactno"
        private TableColumn<?, ?> tablecolumncontactno; // Value injected by FXMLLoader

        @FXML // fx:id="tablecolumndisease"
        private TableColumn<?, ?> tablecolumndisease; // Value injected by FXMLLoader

        @FXML // fx:id="tablecolumndisease1"
        private TableColumn<?, ?> tablecolumndisease1; // Value injected by FXMLLoader

        @FXML // fx:id="tablecolumnname"
        private TableColumn<?, ?> tablecolumnname; // Value injected by FXMLLoader

        @FXML // fx:id="tableview"
        private TableView<?> tableview; // Value injected by FXMLLoader

        @FXML // This method is called by the FXMLLoader when initialization is complete
        void initialize() {
            assert anchorpaneP != null : "fx:id=\"anchorpaneP\" was not injected: check your FXML file 'patient_details.fxml'.";
            assert anchorpaneSP != null : "fx:id=\"anchorpaneSP\" was not injected: check your FXML file 'patient_details.fxml'.";
            assert buttonbloodrequest != null : "fx:id=\"buttonbloodrequest\" was not injected: check your FXML file 'patient_details.fxml'.";
            assert buttondonor != null : "fx:id=\"buttondonor\" was not injected: check your FXML file 'patient_details.fxml'.";
            assert buttonhome != null : "fx:id=\"buttonhome\" was not injected: check your FXML file 'patient_details.fxml'.";
            assert buttonlogout != null : "fx:id=\"buttonlogout\" was not injected: check your FXML file 'patient_details.fxml'.";
            assert buttonpatient != null : "fx:id=\"buttonpatient\" was not injected: check your FXML file 'patient_details.fxml'.";
            assert iamgebloodrequest != null : "fx:id=\"iamgebloodrequest\" was not injected: check your FXML file 'patient_details.fxml'.";
            assert iamgehome != null : "fx:id=\"iamgehome\" was not injected: check your FXML file 'patient_details.fxml'.";
            assert iamgepatient != null : "fx:id=\"iamgepatient\" was not injected: check your FXML file 'patient_details.fxml'.";
            assert imagedonor != null : "fx:id=\"imagedonor\" was not injected: check your FXML file 'patient_details.fxml'.";
            assert labelBG != null : "fx:id=\"labelBG\" was not injected: check your FXML file 'patient_details.fxml'.";
            assert sliderP != null : "fx:id=\"sliderP\" was not injected: check your FXML file 'patient_details.fxml'.";
            assert tablecolumnage != null : "fx:id=\"tablecolumnage\" was not injected: check your FXML file 'patient_details.fxml'.";
            assert tablecolumnbloodgroup != null : "fx:id=\"tablecolumnbloodgroup\" was not injected: check your FXML file 'patient_details.fxml'.";
            assert tablecolumncontactno != null : "fx:id=\"tablecolumncontactno\" was not injected: check your FXML file 'patient_details.fxml'.";
            assert tablecolumndisease != null : "fx:id=\"tablecolumndisease\" was not injected: check your FXML file 'patient_details.fxml'.";
            assert tablecolumndisease1 != null : "fx:id=\"tablecolumndisease1\" was not injected: check your FXML file 'patient_details.fxml'.";
            assert tablecolumnname != null : "fx:id=\"tablecolumnname\" was not injected: check your FXML file 'patient_details.fxml'.";
            assert tableview != null : "fx:id=\"tableview\" was not injected: check your FXML file 'patient_details.fxml'.";

        }

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {

        }
    @FXML
    void DonorButtonOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("donor_details.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Donor");
    }

    @FXML
    void HomeButtonOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("4_HOME PAGE ADMIN.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setScene(scene);
        stage.show();
        stage.setTitle("HomePage_Admin");
    }

    @FXML
    void LogoutButtonOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("login.fxml"));
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
    void bloodrequestsButtonOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("Blood_request.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setScene(scene);
        stage.show();
        stage.setTitle("BloodRequest");
    }
}


