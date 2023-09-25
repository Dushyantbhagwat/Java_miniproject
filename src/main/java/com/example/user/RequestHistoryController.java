package com.example.user;

/**
 * Sample Skeleton for '11_My Blood Request History.fxml' Controller Class
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
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RequestHistoryController implements Initializable {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="AnchorPane"
    private AnchorPane AnchorPane; // Value injected by FXMLLoader

    @FXML // fx:id="AnchorPanefull"
    private AnchorPane AnchorPanefull; // Value injected by FXMLLoader

    @FXML // fx:id="BloodGaurdiansLabel"
    private Label BloodGaurdiansLabel; // Value injected by FXMLLoader

    @FXML // fx:id="DonateButton"
    private Button DonateButton; // Value injected by FXMLLoader

    @FXML // fx:id="LogOutButton"
    private Button LogOutButton; // Value injected by FXMLLoader

    @FXML // fx:id="MakeRequestButton"
    private Button MakeRequestButton; // Value injected by FXMLLoader

    @FXML // fx:id="MyBloodRequestlabel"
    private Label MyBloodRequestlabel; // Value injected by FXMLLoader

    @FXML // fx:id="RequestHistoryButton"
    private Button RequestHistoryButton; // Value injected by FXMLLoader

    @FXML // fx:id="SplitPane"
    private SplitPane SplitPane; // Value injected by FXMLLoader

    @FXML // fx:id="TColumnBloodgrp"
    private TableColumn<?, ?> TColumnBloodgrp; // Value injected by FXMLLoader

    @FXML // fx:id="TColumnDate"
    private TableColumn<?, ?> TColumnDate; // Value injected by FXMLLoader

    @FXML // fx:id="TColumnPatientName"
    private TableColumn<?, ?> TColumnPatientName; // Value injected by FXMLLoader

    @FXML // fx:id="TColumnStatus"
    private TableColumn<?, ?> TColumnStatus; // Value injected by FXMLLoader

    @FXML // fx:id="TcolumnAge"
    private TableColumn<?, ?> TcolumnAge; // Value injected by FXMLLoader

    @FXML // fx:id="TcoulmnReason"
    private TableColumn<?, ?> TcoulmnReason; // Value injected by FXMLLoader

    @FXML // fx:id="UnderLabelAnchorPane"
    private AnchorPane UnderLabelAnchorPane; // Value injected by FXMLLoader

    @FXML // fx:id="bloodrequestsymbol"
    private ImageView bloodrequestsymbol; // Value injected by FXMLLoader

    @FXML // fx:id="donatesymbol"
    private ImageView donatesymbol; // Value injected by FXMLLoader

    @FXML // fx:id="homeButton"
    private Button homeButton; // Value injected by FXMLLoader

    @FXML // fx:id="homesymbol"
    private ImageView homesymbol; // Value injected by FXMLLoader

    @FXML // fx:id="requesthistorysybol"
    private ImageView requesthistorysybol; // Value injected by FXMLLoader

    @FXML // fx:id="tableView"
    private TableView<?> tableView; // Value injected by FXMLLoader

    @FXML
    void DonateButtonOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("12_DONOR PAGE.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Scene scene;
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
    void MakeRequestButtonOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("10_Patient Requesting for blood.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Scene scene;
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
    void RequestHistoryButtonOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("10_Patient Requesting for blood.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Scene scene;
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
    void homeButtonOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("9_patientoverview.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Scene scene;
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Donor");

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert AnchorPane != null : "fx:id=\"AnchorPane\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert AnchorPanefull != null : "fx:id=\"AnchorPanefull\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert BloodGaurdiansLabel != null : "fx:id=\"BloodGaurdiansLabel\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert DonateButton != null : "fx:id=\"DonateButton\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert LogOutButton != null : "fx:id=\"LogOutButton\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert MakeRequestButton != null : "fx:id=\"MakeRequestButton\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert MyBloodRequestlabel != null : "fx:id=\"MyBloodRequestlabel\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert RequestHistoryButton != null : "fx:id=\"RequestHistoryButton\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert SplitPane != null : "fx:id=\"SplitPane\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert TColumnBloodgrp != null : "fx:id=\"TColumnBloodgrp\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert TColumnDate != null : "fx:id=\"TColumnDate\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert TColumnPatientName != null : "fx:id=\"TColumnPatientName\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert TColumnStatus != null : "fx:id=\"TColumnStatus\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert TcolumnAge != null : "fx:id=\"TcolumnAge\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert TcoulmnReason != null : "fx:id=\"TcoulmnReason\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert UnderLabelAnchorPane != null : "fx:id=\"UnderLabelAnchorPane\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert bloodrequestsymbol != null : "fx:id=\"bloodrequestsymbol\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert donatesymbol != null : "fx:id=\"donatesymbol\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert homeButton != null : "fx:id=\"homeButton\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert homesymbol != null : "fx:id=\"homesymbol\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert requesthistorysybol != null : "fx:id=\"requesthistorysybol\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert tableView != null : "fx:id=\"tableView\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}


