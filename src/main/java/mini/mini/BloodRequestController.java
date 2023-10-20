/**
 * Sample Skeleton for '7_bloodrequest.fxml' Controller Class
 */

package mini.mini;

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
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class BloodRequestController implements Initializable {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="anchorpaneP"
    private AnchorPane anchorpaneP; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpaneSP"
    private AnchorPane anchorpaneSP; // Value injected by FXMLLoader

    @FXML // fx:id="buttonColumn"
    private TableColumn<AdminPatientHistory, String> buttonColumn; // Value injected by FXMLLoader

    @FXML // fx:id="buttonColumn1"
    private TableColumn<AdminPatientHistory, String> buttonColumn1; // Value injected by FXMLLoader

    @FXML // fx:id="buttondonor"
    private Button buttondonor; // Value injected by FXMLLoader

    @FXML // fx:id="buttonhome"
    private Button buttonhome; // Value injected by FXMLLoader

    @FXML // fx:id="buttonlogout"
    private Button buttonlogout; // Value injected by FXMLLoader

    @FXML // fx:id="buttonpatient"
    private Button buttonpatient; // Value injected by FXMLLoader

    @FXML // fx:id="buttonpatient1"
    private Button buttonpatient1; // Value injected by FXMLLoader

    @FXML // fx:id="iamgehome"
    private ImageView iamgehome; // Value injected by FXMLLoader

    @FXML // fx:id="iamgepatient"
    private ImageView iamgepatient; // Value injected by FXMLLoader

    @FXML // fx:id="imagedonor"
    private ImageView imagedonor; // Value injected by FXMLLoader

    @FXML // fx:id="labelBG"
    private Label labelBG; // Value injected by FXMLLoader

    @FXML // fx:id="tablecolumnage"
    private TableColumn<AdminPatientHistory, String > tablecolumnage; // Value injected by FXMLLoader

    @FXML // fx:id="tablecolumnbloodgroup"
    private TableColumn<AdminPatientHistory, LocalDate> tablecolumnbloodgroup; // Value injected by FXMLLoader

    @FXML // fx:id="tablecolumncontactno"
    private TableColumn<AdminPatientHistory, String> tablecolumncontactno; // Value injected by FXMLLoader

    @FXML // fx:id="tablecolumncontactno1"
    private TableColumn<AdminPatientHistory, String> tablecolumncontactno1; // Value injected by FXMLLoader

    @FXML // fx:id="tablecolumncontactno2"
    private TableColumn<AdminPatientHistory, String> tablecolumncontactno2; // Value injected by FXMLLoader

    @FXML // fx:id="tablecolumncontactno3"
    private TableColumn<AdminPatientHistory, String> tablecolumncontactno3; // Value injected by FXMLLoader

    @FXML // fx:id="tablecolumnname"
    private TableColumn<AdminPatientHistory, String> tablecolumnname; // Value injected by FXMLLoader

    @FXML // fx:id="tableview"
    private TableView<AdminPatientHistory> tableview; // Value injected by FXMLLoader


    @FXML // fx:id="searching"
    private TextField searching; // Value injected by FXMLLoader

    private Stage stage;
    private Scene scene;

    @FXML
    void PatientButtonOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("6_patientdetails.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        try {
            scene = new Scene(fxmlLoader.load());
            // Load the CSS for the new scene
            String cssPath = getClass().getResource("style.css").toExternalForm();
            scene.getStylesheets().add(cssPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Patient");
    }



    @FXML
    void DonorButtonOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("5_donor details.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        try {
            scene = new Scene(fxmlLoader.load());
            // Load the CSS for the new scene
            String cssPath = getClass().getResource("style.css").toExternalForm();
            scene.getStylesheets().add(cssPath);
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
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("2_coomon_login_page.fxml"));
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
    void PdfopnerOnAction(ActionEvent event) {
        String pdfUrl = "https://drive.google.com/file/d/1hcbjDsPC9p0on8c3C-ZdEoLWclyLzmpt/view?usp=drive_link";
        // Replacing "YOUR_FILE_ID" with thstyle.csse actual ID of your Google Drive file
        try {
            java.awt.Desktop.getDesktop().browse(new URI(pdfUrl));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
            // Handling any exceptions here
        }
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert anchorpaneP != null : "fx:id=\"anchorpaneP\" was not injected: check your FXML file '7_bloodrequest.fxml'.";
        assert anchorpaneSP != null : "fx:id=\"anchorpaneSP\" was not injected: check your FXML file '7_bloodrequest.fxml'.";
        assert buttonColumn != null : "fx:id=\"buttonColumn\" was not injected: check your FXML file '7_bloodrequest.fxml'.";
        assert buttonColumn1 != null : "fx:id=\"buttonColumn1\" was not injected: check your FXML file '7_bloodrequest.fxml'.";
        assert buttondonor != null : "fx:id=\"buttondonor\" was not injected: check your FXML file '7_bloodrequest.fxml'.";
        assert buttonhome != null : "fx:id=\"buttonhome\" was not injected: check your FXML file '7_bloodrequest.fxml'.";
        assert buttonlogout != null : "fx:id=\"buttonlogout\" was not injected: check your FXML file '7_bloodrequest.fxml'.";
        assert buttonpatient != null : "fx:id=\"buttonpatient\" was not injected: check your FXML file '7_bloodrequest.fxml'.";
        assert buttonpatient1 != null : "fx:id=\"buttonpatient1\" was not injected: check your FXML file '7_bloodrequest.fxml'.";
        assert iamgehome != null : "fx:id=\"iamgehome\" was not injected: check your FXML file '7_bloodrequest.fxml'.";
        assert iamgepatient != null : "fx:id=\"iamgepatient\" was not injected: check your FXML file '7_bloodrequest.fxml'.";
        assert imagedonor != null : "fx:id=\"imagedonor\" was not injected: check your FXML file '7_bloodrequest.fxml'.";
        assert labelBG != null : "fx:id=\"labelBG\" was not injected: check your FXML file '7_bloodrequest.fxml'.";
        assert tablecolumnage != null : "fx:id=\"tablecolumnage\" was not injected: check your FXML file '7_bloodrequest.fxml'.";
        assert tablecolumnbloodgroup != null : "fx:id=\"tablecolumnbloodgroup\" was not injected: check your FXML file '7_bloodrequest.fxml'.";
        assert tablecolumncontactno != null : "fx:id=\"tablecolumncontactno\" was not injected: check your FXML file '7_bloodrequest.fxml'.";
        assert tablecolumncontactno1 != null : "fx:id=\"tablecolumncontactno1\" was not injected: check your FXML file '7_bloodrequest.fxml'.";
        assert tablecolumncontactno2 != null : "fx:id=\"tablecolumncontactno2\" was not injected: check your FXML file '7_bloodrequest.fxml'.";
        assert tablecolumncontactno3 != null : "fx:id=\"tablecolumncontactno3\" was not injected: check your FXML file '7_bloodrequest.fxml'.";
        assert tablecolumnname != null : "fx:id=\"tablecolumnname\" was not injected: check your FXML file '7_bloodrequest.fxml'.";
        assert tableview != null : "fx:id=\"tableview\" was not injected: check your FXML file '7_bloodrequest.fxml'.";

    }


    ObservableList<AdminPatientHistory> AdminPatientHistoryObservableList = FXCollections.observableArrayList();



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


        try {
            display2();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle any exceptions here
        }
    }





    public void display2() throws SQLException {


        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String refreshQuery = "SELECT patient_table.patient_id, patient_table.action, patient_table.request_date, users.name, users.dob, users.email_id, users.phone_number, users.address, users.bloodgroup, users.report " +
                "FROM users " +
                "INNER JOIN patient_table ON users.user_id = patient_table.user_id " +
                "WHERE action != 'Request is in Progress......'";


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



                String query_Dob1 = queryOutput.getString("request_date");

                LocalDate request_date = LocalDate.parse(query_Dob1);
                DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyy-MM-dd");
                String formatted_Dob1 = request_date.format(formatter1);



                String queryContactno = queryOutput.getString("phone_number");

                String queryEmail = queryOutput.getString("email_id");

                String queryAddress = queryOutput.getString("address");

                byte[] pdfData = queryOutput.getBytes("report");

                String queryAction = queryOutput.getString("action");

                AdminPatientHistoryObservableList.add(new AdminPatientHistory(userId, query_Name, formatted_Dob, queryBlood_group, queryContactno, queryEmail, queryAddress, pdfData, queryAction, formatted_Dob1));
            }

            tablecolumnname.setCellValueFactory(new PropertyValueFactory<>("name"));
            tablecolumnage.setCellValueFactory(new PropertyValueFactory<>("bloodgroup"));
            tablecolumnbloodgroup.setCellValueFactory(new PropertyValueFactory<>("dob"));
            tablecolumncontactno.setCellValueFactory(new PropertyValueFactory<>("phone_number"));
            tablecolumncontactno1.setCellValueFactory(new PropertyValueFactory<>("email_id"));
            tablecolumncontactno2.setCellValueFactory(new PropertyValueFactory<>("address"));
            tablecolumncontactno3.setCellValueFactory(new PropertyValueFactory<>("report"));
            buttonColumn.setCellValueFactory(new PropertyValueFactory<>("action"));
            buttonColumn1.setCellValueFactory(new PropertyValueFactory<>("request_date"));
            tableview.setItems(AdminPatientHistoryObservableList);

            FilteredList<AdminPatientHistory> filteredData = new FilteredList<>(AdminPatientHistoryObservableList, b -> true);

            searching.textProperty().addListener((observable, oldValue, newValue) -> {
                filteredData.setPredicate(adminPatientHistory -> {
                    if (newValue == null || newValue.trim().isEmpty()) {
                        return true; // No filter, show all items
                    }

                    String lowerCaseKeyword = newValue.toLowerCase();

                    return adminPatientHistory.getName().toLowerCase().contains(lowerCaseKeyword) ||
                            adminPatientHistory.getBloodgroup().toLowerCase().contains(lowerCaseKeyword) ||
                            adminPatientHistory.getDob().toString().contains(lowerCaseKeyword) ||
                            adminPatientHistory.getAction().toLowerCase().contains(lowerCaseKeyword) ||
                            adminPatientHistory.getAddress().toLowerCase().contains(lowerCaseKeyword) ||
                            adminPatientHistory.getEmail_id().toLowerCase().contains(lowerCaseKeyword) ||
                            adminPatientHistory.getPhone_number().toLowerCase().contains(lowerCaseKeyword) ||
                            adminPatientHistory.getReport().toString().contains(lowerCaseKeyword) ||
                            adminPatientHistory.getRequest_date().toString().contains(lowerCaseKeyword);
                });
            });

            SortedList<AdminPatientHistory> sortedData = new SortedList<>(filteredData);

            sortedData.comparatorProperty().bind(tableview.comparatorProperty());

            tableview.setItems(sortedData);


        } catch (SQLException e) {
            Logger.getLogger(BloodRequestController.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        }

    }



}
