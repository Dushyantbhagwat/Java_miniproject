package mini.mini;

/**
 * Sample Skeleton for 'patient_details.fxml' Controller Class
 */

import java.io.File;
import java.io.IOException;
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
        private TableColumn<AdminPatient, LocalDate> tablecolumnage; // Value injected by FXMLLoader

        @FXML // fx:id="tablecolumnbloodgroup"
        private TableColumn<AdminPatient,String> tablecolumnbloodgroup; // Value injected by FXMLLoader

        @FXML // fx:id="tablecolumncontactno"
        private TableColumn<AdminPatient,String> tablecolumncontactno; // Value injected by FXMLLoader

    @FXML // fx:id="refbo"
    private Button refbo; // Value injected by FXMLLoader

        @FXML // fx:id="tablecolumnname"
        private TableColumn<AdminPatient,String> tablecolumnname; // Value injected by FXMLLoader

        @FXML // fx:id="tableview"
        private TableView<AdminPatient> tableview; // Value injected by FXMLLoader

    ObservableList<AdminPatient> AdminPatientObservableList = FXCollections.observableArrayList();

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
            assert tablecolumnname != null : "fx:id=\"tablecolumnname\" was not injected: check your FXML file 'patient_details.fxml'.";
            assert tableview != null : "fx:id=\"tableview\" was not injected: check your FXML file 'patient_details.fxml'.";
            assert refbo != null : "fx:id=\"refbo\" was not injected: check your FXML file '6_patientdetails.fxml'.";
        }

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

            File backFile4= new File("im/WhatsApp Image 2023-09-02 at 22.25..jpg");
            Image backImage4 = new Image(backFile4.toURI().toString());
            iamgebloodrequest.setImage(backImage4);
        }

            public void reButtononAction(ActionEvent event) throws SQLException{
                         display();
        }

        public void display() throws SQLException {

        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String refreshQuesry = "SELECT patient_table.name, patient_table.dob, patient_table.bloodgroup, users.phone_number " +
                                        "FROM table1 patient_table " +
                                        "INNER JOIN table2 users ON patient_table.patient_id = users.user_id " +
                                        "WHERE patient_table.patient_id = ?";

        try {

            Statement statement = connectDB.createStatement();
            ResultSet queryOutput = statement.executeQuery(refreshQuesry);

            while (queryOutput.next()) {

                String query_Name = queryOutput.getString("name");

                String queryBlood_group = queryOutput.getString("bloodgroup");

                String query_Dob = queryOutput.getString("dob");

                String queryContactno = queryOutput.getString("phone_number");

                LocalDate dob = LocalDate.parse(query_Dob);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy-MM-dd");
                String formatted_Dob = dob.format(formatter);


                AdminPatientObservableList.add(new AdminPatient(query_Name, queryBlood_group, formatted_Dob, queryContactno));
            }

            tablecolumnname.setCellValueFactory(new PropertyValueFactory<>("name"));
            tablecolumnage.setCellValueFactory(new PropertyValueFactory<>("dob"));
            tablecolumnbloodgroup.setCellValueFactory(new PropertyValueFactory<>("bloodgroup"));
            tablecolumncontactno.setCellValueFactory(new PropertyValueFactory<>("phone_number"));

            tableview.setItems(AdminPatientObservableList);

        } catch (SQLException e) {
            Logger.getLogger(RequestHistoryController.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
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
    @FXML
    void bloodrequestsButtonOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("7_bloodrequest.fxml"));
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


