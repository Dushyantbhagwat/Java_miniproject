package com.example.demo7;
/**
 * Sample Skeleton for '4_HOME PAGE ADMIN.fxml' Controller Class
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
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AdminHomePageController implements Initializable {
    private Stage stage;
    private Scene scene;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Abga"
    private Label Abga; // Value injected by FXMLLoader

    @FXML // fx:id="Abgm"
    private Label Abgm; // Value injected by FXMLLoader

    @FXML // fx:id="AnchorPane"
    private AnchorPane AnchorPane; // Value injected by FXMLLoader

    @FXML // fx:id="a"
    private MenuItem a; // Value injected by FXMLLoader

    @FXML // fx:id="aapprovedrequest"
    private Label aapprovedrequest; // Value injected by FXMLLoader

    @FXML // fx:id="ab"
    private MenuItem ab; // Value injected by FXMLLoader

    @FXML // fx:id="abbga"
    private Label abbga; // Value injected by FXMLLoader

    @FXML // fx:id="abbgm"
    private Label abbgm; // Value injected by FXMLLoader

    @FXML // fx:id="abm"
    private MenuItem abm; // Value injected by FXMLLoader

    @FXML // fx:id="addbuttton"
    private Button addbuttton; // Value injected by FXMLLoader

    @FXML // fx:id="addstocktectlabel"
    private Label addstocktectlabel; // Value injected by FXMLLoader

    @FXML // fx:id="am"
    private MenuItem am; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpaneA"
    private AnchorPane anchorpaneA; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpanesplit"
    private AnchorPane anchorpanesplit; // Value injected by FXMLLoader

    @FXML // fx:id="apprivedrequest1"
    private ImageView apprivedrequest1; // Value injected by FXMLLoader

    @FXML // fx:id="b"
    private MenuItem b; // Value injected by FXMLLoader

    @FXML // fx:id="bbga"
    private Label bbga; // Value injected by FXMLLoader

    @FXML // fx:id="bbgm"
    private Label bbgm; // Value injected by FXMLLoader

    @FXML // fx:id="blodrop1"
    private ImageView blodrop1; // Value injected by FXMLLoader

    @FXML // fx:id="blodrop2"
    private ImageView blodrop2; // Value injected by FXMLLoader

    @FXML // fx:id="blodrop3"
    private ImageView blodrop3; // Value injected by FXMLLoader

    @FXML // fx:id="blodrop4"
    private ImageView blodrop4; // Value injected by FXMLLoader

    @FXML // fx:id="blodrop5"
    private ImageView blodrop5; // Value injected by FXMLLoader

    @FXML // fx:id="blodrop6"
    private ImageView blodrop6; // Value injected by FXMLLoader

    @FXML // fx:id="blodrop7"
    private ImageView blodrop7; // Value injected by FXMLLoader

    @FXML // fx:id="blodrop8"
    private ImageView blodrop8; // Value injected by FXMLLoader

    @FXML // fx:id="bloodgroupmenu"
    private SplitMenuButton bloodgroupmenu; // Value injected by FXMLLoader

    @FXML // fx:id="bm"
    private MenuItem bm; // Value injected by FXMLLoader

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

    @FXML // fx:id="iamgebloodrequest1"
    private ImageView iamgebloodrequest1; // Value injected by FXMLLoader

    @FXML // fx:id="iamgehome"
    private ImageView iamgehome; // Value injected by FXMLLoader

    @FXML // fx:id="iamgepatient"
    private ImageView iamgepatient; // Value injected by FXMLLoader

    @FXML // fx:id="imagedonor"
    private ImageView imagedonor; // Value injected by FXMLLoader

    @FXML // fx:id="imagedonor1"
    private ImageView imagedonor1; // Value injected by FXMLLoader

    @FXML // fx:id="imageview"
    private ImageView imageview; // Value injected by FXMLLoader

    @FXML // fx:id="label0"
    private Label label0; // Value injected by FXMLLoader

    @FXML // fx:id="label100"
    private Label label100; // Value injected by FXMLLoader

    @FXML // fx:id="label2"
    private Label label2; // Value injected by FXMLLoader

    @FXML // fx:id="label25"
    private Label label25; // Value injected by FXMLLoader

    @FXML // fx:id="label38"
    private Label label38; // Value injected by FXMLLoader

    @FXML // fx:id="label5"
    private Label label5; // Value injected by FXMLLoader

    @FXML // fx:id="label7"
    private Label label7; // Value injected by FXMLLoader

    @FXML // fx:id="labelBG"
    private Label labelBG; // Value injected by FXMLLoader

    @FXML // fx:id="o"
    private MenuItem o; // Value injected by FXMLLoader

    @FXML // fx:id="obga"
    private Label obga; // Value injected by FXMLLoader

    @FXML // fx:id="obgm"
    private Label obgm; // Value injected by FXMLLoader

    @FXML // fx:id="om"
    private MenuItem om; // Value injected by FXMLLoader

    @FXML // fx:id="qunatitytext"
    private TextField qunatitytext; // Value injected by FXMLLoader

    @FXML // fx:id="splitpaneA"
    private SplitPane splitpaneA; // Value injected by FXMLLoader

    @FXML // fx:id="totaldonors"
    private Label totaldonors; // Value injected by FXMLLoader

    @FXML // fx:id="totalrequest"
    private Label totalrequest; // Value injected by FXMLLoader

    @FXML // fx:id="totalunit"
    private Label totalunit; // Value injected by FXMLLoader

    @FXML // fx:id="totalunit1"
    private ImageView totalunit1; // Value injected by FXMLLoader

    @FXML
    void BloodGrpMenuOnAction(ActionEvent event) {

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
        stage.setTitle("Logout");
    }

    @FXML
    void PatientButtonOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("patient_details.fxml"));
         stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Patient");
    }

    @FXML
    void addButtonOnAction(ActionEvent event) {

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

    @FXML
    void quantityTextButtonOnAction(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert Abga != null : "fx:id=\"Abga\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert Abgm != null : "fx:id=\"Abgm\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert AnchorPane != null : "fx:id=\"AnchorPane\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert a != null : "fx:id=\"a\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert aapprovedrequest != null : "fx:id=\"aapprovedrequest\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert ab != null : "fx:id=\"ab\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert abbga != null : "fx:id=\"abbga\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert abbgm != null : "fx:id=\"abbgm\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert abm != null : "fx:id=\"abm\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert addbuttton != null : "fx:id=\"addbuttton\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert addstocktectlabel != null : "fx:id=\"addstocktectlabel\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert am != null : "fx:id=\"am\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert anchorpaneA != null : "fx:id=\"anchorpaneA\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert anchorpanesplit != null : "fx:id=\"anchorpanesplit\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert apprivedrequest1 != null : "fx:id=\"apprivedrequest1\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert b != null : "fx:id=\"b\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert bbga != null : "fx:id=\"bbga\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert bbgm != null : "fx:id=\"bbgm\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert blodrop1 != null : "fx:id=\"blodrop1\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert blodrop2 != null : "fx:id=\"blodrop2\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert blodrop3 != null : "fx:id=\"blodrop3\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert blodrop4 != null : "fx:id=\"blodrop4\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert blodrop5 != null : "fx:id=\"blodrop5\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert blodrop6 != null : "fx:id=\"blodrop6\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert blodrop7 != null : "fx:id=\"blodrop7\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert blodrop8 != null : "fx:id=\"blodrop8\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert bloodgroupmenu != null : "fx:id=\"bloodgroupmenu\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert bm != null : "fx:id=\"bm\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert buttonbloodrequest != null : "fx:id=\"buttonbloodrequest\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert buttondonor != null : "fx:id=\"buttondonor\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert buttonhome != null : "fx:id=\"buttonhome\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert buttonlogout != null : "fx:id=\"buttonlogout\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert buttonpatient != null : "fx:id=\"buttonpatient\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert iamgebloodrequest != null : "fx:id=\"iamgebloodrequest\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert iamgebloodrequest1 != null : "fx:id=\"iamgebloodrequest1\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert iamgehome != null : "fx:id=\"iamgehome\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert iamgepatient != null : "fx:id=\"iamgepatient\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert imagedonor != null : "fx:id=\"imagedonor\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert imagedonor1 != null : "fx:id=\"imagedonor1\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert imageview != null : "fx:id=\"imageview\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert label0 != null : "fx:id=\"label0\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert label100 != null : "fx:id=\"label100\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert label2 != null : "fx:id=\"label2\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert label25 != null : "fx:id=\"label25\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert label38 != null : "fx:id=\"label38\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert label5 != null : "fx:id=\"label5\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert label7 != null : "fx:id=\"label7\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert labelBG != null : "fx:id=\"labelBG\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert o != null : "fx:id=\"o\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert obga != null : "fx:id=\"obga\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert obgm != null : "fx:id=\"obgm\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert om != null : "fx:id=\"om\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert qunatitytext != null : "fx:id=\"qunatitytext\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert splitpaneA != null : "fx:id=\"splitpaneA\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert totaldonors != null : "fx:id=\"totaldonors\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert totalrequest != null : "fx:id=\"totalrequest\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert totalunit != null : "fx:id=\"totalunit\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert totalunit1 != null : "fx:id=\"totalunit1\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
