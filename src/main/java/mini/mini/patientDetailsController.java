package mini.mini;

/**
 * Sample Skeleton for 'patient_details.fxml' Controller Class
 */

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class patientDetailsController implements Initializable {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="anchorpaneP"
    private AnchorPane anchorpaneP; // Value injected by FXMLLoader
    @FXML // fx:id="pdf"
    private Button pdf; // Value injected by FXMLLoader

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

    @FXML // fx:id="refbo"
    private Button refbo; // Value injected by FXMLLoader

    @FXML // fx:id="sliderP"
    private Slider sliderP; // Value injected by FXMLLoader

    @FXML // fx:id="tablecolumnage"
    private TableColumn<AdminPatient, String> tablecolumnage; // Value injected by FXMLLoader

    @FXML // fx:id="tablecolumnbloodgroup"
    private TableColumn<AdminPatient,LocalDate> tablecolumnbloodgroup; // Value injected by FXMLLoader

    @FXML // fx:id="tablecolumncontactno"
    private TableColumn<AdminPatient,String> tablecolumncontactno; // Value injected by FXMLLoader

    @FXML // fx:id="tablecolumncontactno1"
    private TableColumn<AdminPatient,String> tablecolumncontactno1; // Value injected by FXMLLoader

    @FXML // fx:id="tablecolumncontactno2"
    private TableColumn<AdminPatient,String> tablecolumncontactno2; // Value injected by FXMLLoader

    @FXML // fx:id="tablecolumncontactno3"
    private TableColumn<?,?> tablecolumncontactno3; // Value injected by FXMLLoader

    @FXML // fx:id="tablecolumnname"
    private TableColumn<AdminPatient,String> tablecolumnname; // Value injected by FXMLLoader

    @FXML // fx:id="tablecolumnname1"
    private TableColumn<AdminPatient,String> tablecolumnname1; // Value injected by FXMLLoader

    @FXML // fx:id="tableview"
    private TableView<AdminPatient> tableview; // Value injected by FXMLLoader


    @FXML
    private TableColumn<AdminPatient, Void> buttonColumn;

    private Stage stage;
    private Scene scene;

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert anchorpaneP != null : "fx:id=\"anchorpaneP\" was not injected: check your FXML file '6_patientdetails.fxml'.";
        assert anchorpaneSP != null : "fx:id=\"anchorpaneSP\" was not injected: check your FXML file '6_patientdetails.fxml'.";
        assert buttonbloodrequest != null : "fx:id=\"buttonbloodrequest\" was not injected: check your FXML file '6_patientdetails.fxml'.";
        assert buttondonor != null : "fx:id=\"buttondonor\" was not injected: check your FXML file '6_patientdetails.fxml'.";
        assert buttonhome != null : "fx:id=\"buttonhome\" was not injected: check your FXML file '6_patientdetails.fxml'.";
        assert buttonlogout != null : "fx:id=\"buttonlogout\" was not injected: check your FXML file '6_patientdetails.fxml'.";
        assert buttonpatient != null : "fx:id=\"buttonpatient\" was not injected: check your FXML file '6_patientdetails.fxml'.";
        assert iamgebloodrequest != null : "fx:id=\"iamgebloodrequest\" was not injected: check your FXML file '6_patientdetails.fxml'.";
        assert iamgehome != null : "fx:id=\"iamgehome\" was not injected: check your FXML file '6_patientdetails.fxml'.";
        assert iamgepatient != null : "fx:id=\"iamgepatient\" was not injected: check your FXML file '6_patientdetails.fxml'.";
        assert imagedonor != null : "fx:id=\"imagedonor\" was not injected: check your FXML file '6_patientdetails.fxml'.";
        assert labelBG != null : "fx:id=\"labelBG\" was not injected: check your FXML file '6_patientdetails.fxml'.";
        assert refbo != null : "fx:id=\"refbo\" was not injected: check your FXML file '6_patientdetails.fxml'.";
        assert sliderP != null : "fx:id=\"sliderP\" was not injected: check your FXML file '6_patientdetails.fxml'.";
        assert tablecolumnage != null : "fx:id=\"tablecolumnage\" was not injected: check your FXML file '6_patientdetails.fxml'.";
        assert tablecolumnbloodgroup != null : "fx:id=\"tablecolumnbloodgroup\" was not injected: check your FXML file '6_patientdetails.fxml'.";
        assert tablecolumncontactno != null : "fx:id=\"tablecolumncontactno\" was not injected: check your FXML file '6_patientdetails.fxml'.";
        assert tablecolumncontactno1 != null : "fx:id=\"tablecolumncontactno1\" was not injected: check your FXML file '6_patientdetails.fxml'.";
        assert tablecolumncontactno2 != null : "fx:id=\"tablecolumncontactno2\" was not injected: check your FXML file '6_patientdetails.fxml'.";
        assert tablecolumncontactno3 != null : "fx:id=\"tablecolumncontactno3\" was not injected: check your FXML file '6_patientdetails.fxml'.";
        assert tablecolumnname != null : "fx:id=\"tablecolumnname\" was not injected: check your FXML file '6_patientdetails.fxml'.";
        assert tableview != null : "fx:id=\"tableview\" was not injected: check your FXML file '6_patientdetails.fxml'.";

    }

    ObservableList<AdminPatient> AdminPatientObservableList = FXCollections.observableArrayList();



        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
            File backFile1 = new File("im/WhatsApp Image 2023-09-02 at 22.25.59.jpg");
            Image backImage1 = new Image(backFile1.toURI().toString());
            iamgehome.setImage(backImage1);

            File backFile2 = new File("im/WhatsApp Image 2023-09-02 at 22.25.5.jpg");
            Image backImage2 = new Image(backFile2.toURI().toString());
            imagedonor.setImage(backImage2);

            File backFile3 = new File("im/WhatsApp Image 2023-09-02 at 22.25.56.jpg");
            Image backImage3 = new Image(backFile3.toURI().toString());
            iamgepatient.setImage(backImage3);

            // Set the custom cell factory for the button column
            buttonColumn.setCellFactory(param -> new ButtonCell());

                try {
                    display();
                } catch (SQLException e) {
                    e.printStackTrace();
                    // Handle any exceptions here
                }

        }



            public void display() throws SQLException {


                DatabaseConnection connectNow = new DatabaseConnection();
                Connection connectDB = connectNow.getConnection();

                String refreshQuery = "SELECT patient_table.patient_id, users.name, users.email_id, users.phone_number, users.address, users.bloodgroup, users.dob, users.report " +
                        "FROM users " +
                        "INNER JOIN patient_table ON users.user_id = patient_table.user_id";

                try {

                    Statement statement = connectDB.createStatement();
                    ResultSet queryOutput = statement.executeQuery(refreshQuery);

                    while (queryOutput.next()) {

                        int userId = queryOutput.getInt("patient_id");

                        String query_Name = queryOutput.getString("name");

                        String queryBlood_group = queryOutput.getString("bloodgroup");

                        String query_Dob = queryOutput.getString("dob");
                        System.out.println("query_Dob: " + query_Dob);


                        LocalDate dob = LocalDate.parse(query_Dob);
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy-MM-dd");
                        String formatted_Dob = dob.format(formatter);

                        String queryContactno = queryOutput.getString("phone_number");

                        String queryEmail = queryOutput.getString("email_id");

                        String queryAddress = queryOutput.getString("address");

                        byte[] pdfData = queryOutput.getBytes("report");


                        AdminPatientObservableList.add(new AdminPatient(userId, query_Name, formatted_Dob, queryBlood_group, queryContactno, queryEmail, queryAddress, pdfData));
                    }

                    tablecolumnname.setCellValueFactory(new PropertyValueFactory<>("name"));
                    tablecolumnage.setCellValueFactory(new PropertyValueFactory<>("bloodgroup"));
                    tablecolumnbloodgroup.setCellValueFactory(new PropertyValueFactory<>("dob"));
                    tablecolumncontactno.setCellValueFactory(new PropertyValueFactory<>("phone_number"));
                    tablecolumncontactno1.setCellValueFactory(new PropertyValueFactory<>("email_id"));
                    tablecolumncontactno2.setCellValueFactory(new PropertyValueFactory<>("address"));
                    tablecolumncontactno3.setCellValueFactory(new PropertyValueFactory<>("report"));
                    tableview.setItems(AdminPatientObservableList);

                } catch (SQLException e) {
                    Logger.getLogger(RequestHistoryController.class.getName()).log(Level.SEVERE, null, e);
                    e.printStackTrace();
                }

            }


    @FXML
    void PdfopnerOnAction(ActionEvent event) {
        String pdfUrl = "https://drive.google.com/file/d/1hcbjDsPC9p0on8c3C-ZdEoLWclyLzmpt/view?usp=drive_link";
        // Replacing "YOUR_FILE_ID" with the actual ID of your Google Drive file
        try {
            java.awt.Desktop.getDesktop().browse(new URI(pdfUrl));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
            // Handling any exceptions here
        }
    }





    @FXML
    void DonorButtonOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("5_donor details.fxml"));
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
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("4_HOME PAGE ADMIN.fxml"));
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
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("adminlogin.fxml"));
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

//    @FXML
//    void bloodrequestsButtonOnAction(ActionEvent event) {
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("7_bloodrequest.fxml"));
//        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        try {
//            scene = new Scene(fxmlLoader.load());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        stage.setScene(scene);
//        stage.show();
//        stage.setTitle("BloodRequest");
//    }

}


