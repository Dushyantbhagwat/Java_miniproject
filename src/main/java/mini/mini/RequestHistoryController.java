package mini.mini;

/**
 * Sample Skeleton for '11_My Blood Request History.fxml' Controller Class
 */

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.swing.*;


public class RequestHistoryController implements Initializable {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="pdfopner"
    private Button pdfopner; // Value injected by FXMLLoader

    @FXML // fx:id="AnchorPane"
    private AnchorPane AnchorPane; // Value injected by FXMLLoader

    @FXML // fx:id="AnchorPanefull"
    private AnchorPane AnchorPanefull; // Value injected by FXMLLoader

    @FXML // fx:id="BloodGaurdiansLabel"
    private Label BloodGaurdiansLabel; // Value injected by FXMLLoader

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
    private TableColumn<Refresh,String> TColumnBloodgrp; // Value injected by FXMLLoader

    @FXML // fx:id="TColumnPatientName"
    private TableColumn<Refresh,String> TColumnPatientName; // Value injected by FXMLLoader

    @FXML // fx:id="TcolumnAge"
    private TableColumn<Refresh, LocalDate> TcolumnAge; // Value injected by FXMLLoader

    @FXML // fx:id="TcolumnReport"
    private TableColumn<Refresh, ?> TcolumnReport; // Value injected by FXMLLoader

    @FXML // fx:id="UnderLabelAnchorPane"
    private AnchorPane UnderLabelAnchorPane; // Value injected by FXMLLoader

    @FXML // fx:id="bloodrequestsymbol"
    private ImageView bloodrequestsymbol; // Value injected by FXMLLoader

    @FXML // fx:id="donatesymbol"
    private ImageView donatesymbol; // Value injected by FXMLLoader

    @FXML // fx:id="homeButton"
    private Button homeButton; // Value injected by FXMLLoader

    @FXML // fx:id="homeButton1"
    private Button homeButton1; // Value injected by FXMLLoader

    @FXML // fx:id="homesymbol"
    private ImageView homesymbol; // Value injected by FXMLLoader

    @FXML // fx:id="refreshbutton"
    private Button refreshbutton; // Value injected by FXMLLoader

    @FXML // fx:id="requesthistorysybol"
    private ImageView requesthistorysybol; // Value injected by FXMLLoader

    @FXML // fx:id="tableView"
    private TableView<Refresh> tableView; // Value injected by FXMLLoader

    private Stage stage;
    private Scene scene;

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert AnchorPane != null : "fx:id=\"AnchorPane\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert AnchorPanefull != null : "fx:id=\"AnchorPanefull\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert BloodGaurdiansLabel != null : "fx:id=\"BloodGaurdiansLabel\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert LogOutButton != null : "fx:id=\"LogOutButton\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert MakeRequestButton != null : "fx:id=\"MakeRequestButton\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert MyBloodRequestlabel != null : "fx:id=\"MyBloodRequestlabel\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert RequestHistoryButton != null : "fx:id=\"RequestHistoryButton\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert SplitPane != null : "fx:id=\"SplitPane\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert TColumnBloodgrp != null : "fx:id=\"TColumnBloodgrp\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert TColumnPatientName != null : "fx:id=\"TColumnPatientName\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert TcolumnAge != null : "fx:id=\"TcolumnAge\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert UnderLabelAnchorPane != null : "fx:id=\"UnderLabelAnchorPane\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert bloodrequestsymbol != null : "fx:id=\"bloodrequestsymbol\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert donatesymbol != null : "fx:id=\"donatesymbol\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert homeButton != null : "fx:id=\"homeButton\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert homeButton1 != null : "fx:id=\"homeButton1\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert homesymbol != null : "fx:id=\"homesymbol\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert refreshbutton != null : "fx:id=\"refreshbutton\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert requesthistorysybol != null : "fx:id=\"requesthistorysybol\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert pdfopner != null : "fx:id=\"pdfopner\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert tableView != null : "fx:id=\"tableView\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
        assert TcolumnReport != null : "fx:id=\"TcolumnReport\" was not injected: check your FXML file '11_My Blood Request History.fxml'.";
    }


    ObservableList<Refresh> RefreshObservableList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        File backFile1 = new File("im/WhatsApp Image 2023-09-02 at 22.25.59.jpg");
        Image backImage1 = new Image(backFile1.toURI().toString());
        homesymbol.setImage(backImage1);

        File backFile2 = new File("im/WhatsApp Image 2023-09-02 at 22.25.5.jpg");
        Image backImage2 = new Image(backFile2.toURI().toString());
        donatesymbol.setImage(backImage2);

        File backFile5 = new File("im/WhatsApp Image 2023-09-02 at 22.25..jpg");
        Image backImage5 = new Image(backFile5.toURI().toString());
        requesthistorysybol.setImage(backImage5);
    }


        public void refreshButtonOnAction(ActionEvent actionEventevent) throws SQLException {
            int loggedInUserId = AuthService.getInstance().getLoggedInUserId();
                refBu(loggedInUserId);
        }


public void refBu(int loggedInUserId) throws SQLException {


    DatabaseConnection connectNow = new DatabaseConnection();
    Connection connectDB = connectNow.getConnection();


    String refreshQuery = "SELECT users.name, users.dob, users.bloodgroup, users.report " +
            "FROM users " +
            "INNER JOIN patient_table ON users.user_id = patient_table.user_id " +
            "WHERE users.user_id ='" + loggedInUserId + "'";

    if (loggedInUserId != -1) {
        try {

            Statement statement = connectDB.createStatement();
            ResultSet queryOutput = statement.executeQuery(refreshQuery);


            while (queryOutput.next()) {

                String queryName = queryOutput.getString("name");

                String queryDob = queryOutput.getString("dob");

                LocalDate dob = LocalDate.parse(queryDob);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy-MM-dd");
                String formatted_Dob = dob.format(formatter);

                String queryBloodgroup = queryOutput.getString("bloodgroup");

                byte[] pdfData = queryOutput.getBytes("report");



                RefreshObservableList.add(new Refresh(queryName, formatted_Dob, queryBloodgroup, pdfData));

            }

            TColumnPatientName.setCellValueFactory(new PropertyValueFactory<>("name"));
            TcolumnAge.setCellValueFactory(new PropertyValueFactory<>("dob"));
            TColumnBloodgrp.setCellValueFactory(new PropertyValueFactory<>("bloodgroup"));
            TcolumnReport.setCellValueFactory(new PropertyValueFactory<>("report"));


            tableView.setItems(RefreshObservableList);

        } catch (SQLException e) {
            Logger.getLogger(RequestHistoryController.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        }
    } else {
        System.out.println("error");
    }
}

    @FXML
    void PdfopnerOnAction(ActionEvent event) {
        String pdfUrl = "https://drive.google.com/file/d/1hcbjDsPC9p0on8c3C-ZdEoLWclyLzmpt/view?usp=drive_link";
        // Replace "YOUR_FILE_ID" with the actual ID of your Google Drive file
        try {
            java.awt.Desktop.getDesktop().browse(new URI(pdfUrl));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
            // Handle any exceptions here
        }
    }


            @FXML
            void DonateButtonOnAction (ActionEvent event){
                FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("12_DONOR PAGE.fxml"));
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
            void RequestHistoryButtonOnAction (ActionEvent event){
                FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("10_Patient Requesting for blood.fxml"));
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
            void homeButtonOnAction (ActionEvent event){
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
            void loginbuttonOnAction (ActionEvent event){
                FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("2_coomon_login_page.fxml"));
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

}
