package mini.mini;

/**
 * Sample Skeleton for '10_Patient Requesting for blood.fxml' Controller Class
 */

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import javafx.stage.Window;
import javafx.util.StringConverter;


public class MakeRequestController implements Initializable {


        @FXML // ResourceBundle that was given to the FXMLLoader
        private ResourceBundle resources;

        @FXML // fx:id="AnchorPaneButtons"
        private AnchorPane AnchorPaneButtons; // Value injected by FXMLLoader

        @FXML // fx:id="AnchorPaneFull"
        private AnchorPane AnchorPaneFull; // Value injected by FXMLLoader

        @FXML // fx:id="BloodGauridansLabel"
        private Label BloodGauridansLabel; // Value injected by FXMLLoader

        @FXML // fx:id="BloodGroupMenuButton"
        private SplitMenuButton BloodGroupMenuButton; // Value injected by FXMLLoader

        @FXML // fx:id="BloodRequestButton"
        private Button BloodRequestButton; // Value injected by FXMLLoader


        @FXML // fx:id="HomeButton"
        private Button HomeButton; // Value injected by FXMLLoader

        @FXML // fx:id="LogOutButton"
        private Button LogOutButton; // Value injected by FXMLLoader

        @FXML // fx:id="PatientNameTextField"
        private TextField PatientNameTextField; // Value injected by FXMLLoader

        @FXML // fx:id="RequestHistoryButton"
        private Button RequestHistoryButton; // Value injected by FXMLLoader

        @FXML // fx:id="bloodrequestsymbol"
        private ImageView bloodrequestsymbol; // Value injected by FXMLLoader

        @FXML // fx:id="donatesymbol"
        private ImageView donatesymbol; // Value injected by FXMLLoader

        @FXML // fx:id="homesymbol"
        private ImageView homesymbol; // Value injected by FXMLLoader

        @FXML // fx:id="imagefull"
        private ImageView imagefull; // Value injected by FXMLLoader

        @FXML // fx:id="requestButton"
        private Button requestButton; // Value injected by FXMLLoader

        @FXML // fx:id="requesthistorysybol"
        private ImageView requesthistorysybol; // Value injected by FXMLLoader

    @FXML
    private Hyperlink filess;
    @FXML
    private ChoiceBox<String> BloodGroupchoice;

    @FXML
    private DatePicker dobid;

    @FXML
    private Label labelfile;
    private Object primaryStage;


    @FXML
    private Label message;
    private javafx.stage.Window Window;

    @FXML
        void makerequestbuttonOnAction(ActionEvent event) {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("10_Patient Requesting for blood.fxml"));
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
        void donatebuttonOnAction(ActionEvent event) {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("12_DONOR PAGE.fxml"));
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
        void homebuttonOnAction(ActionEvent event) {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("9_patientoverview.fxml"));
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
        void requesthistoryOnAction(ActionEvent event) {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("11_My Blood Request History.fxml"));
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
        void loginbuttonOnAction(ActionEvent event) {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("2_coomon_login_page.fxml"));
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
            assert AnchorPaneButtons != null : "fx:id=\"AnchorPaneButtons\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
            assert AnchorPaneFull != null : "fx:id=\"AnchorPaneFull\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
            assert BloodGauridansLabel != null : "fx:id=\"BloodGauridansLabel\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
            assert BloodGroupMenuButton != null : "fx:id=\"BloodGroupMenuButton\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
            assert BloodRequestButton != null : "fx:id=\"BloodRequestButton\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
            assert HomeButton != null : "fx:id=\"HomeButton\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
            assert LogOutButton != null : "fx:id=\"LogOutButton\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
            assert PatientNameTextField != null : "fx:id=\"PatientNameTextField\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
            assert RequestHistoryButton != null : "fx:id=\"RequestHistoryButton\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
            assert bloodrequestsymbol != null : "fx:id=\"bloodrequestsymbol\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
            assert donatesymbol != null : "fx:id=\"donatesymbol\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
            assert homesymbol != null : "fx:id=\"homesymbol\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
            assert imagefull != null : "fx:id=\"imagefull\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
            assert requestButton != null : "fx:id=\"requestButton\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
            assert requesthistorysybol != null : "fx:id=\"requesthistorysybol\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";

        }

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {


            File backFile1 = new File("im/WhatsApp Image 2023-09-02 at 22.25.59.jpg");
            Image backImage1 = new Image(backFile1.toURI().toString());
            homesymbol.setImage(backImage1);

            File backFile2 = new File("im/WhatsApp Image 2023-09-02 at 22.25.5.jpg");
            Image backImage2 = new Image(backFile2.toURI().toString());
            donatesymbol.setImage(backImage2);

            File backFile4 = new File("im/WhatsApp Image 2023-09-02 at 22.25.58.jpg");
            Image backImage4 = new Image(backFile4.toURI().toString());
            bloodrequestsymbol.setImage(backImage4);

            File backFile5 = new File("im/WhatsApp Image 2023-09-02 at 22.25..jpg");
            Image backImage5 = new Image(backFile5.toURI().toString());
            requesthistorysybol.setImage(backImage5);

            BloodGroupchoice.getItems().addAll("A+", "B+", "O+", "AB+", "A-", "B-", "O-", "AB-");
            BloodGroupchoice.setConverter(new StringConverter<String>() {
                @Override
                public String toString(String s) {
                    return (s == null) ? "select blood group" : s;
                }

                @Override
                public String fromString(String s) {
                    return null;
                }
            });

        }




@FXML
        void filesetOnAction(ActionEvent event){
             FileChooser fileChooser = new FileChooser();
                 fileChooser.setTitle("Open File");

            // Show the FileChooser dialog
            File selectedFile = fileChooser.showOpenDialog((Window)primaryStage);

            if (selectedFile != null) {
                // Process the selected file here
                labelfile.setText("report added");
                System.out.println("Selected File: " + selectedFile.getAbsolutePath());
            } else {
                // User canceled the operation
                System.out.println("File selection canceled.");
            }
        }


    public void requestButtonOnAction(ActionEvent actionEventevent) throws SQLException {
        if (PatientNameTextField.getText()!=null && dobid.getValue()!=null)
        {
            request();
        }
        else {
            message.setText("please provide the above asked information!");
        }
    }

    public void request() throws SQLException
    {
        LocalDate localDate = dobid.getValue();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dob = localDate.format(dateTimeFormatter);


        ActionEvent ActionEvent = null;
        filesetOnAction(ActionEvent);

        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String name= PatientNameTextField.getText();
        String blood_group = BloodGroupchoice.getValue();
        try {
            String insertFields = "insert into patient (name, dob, blood_group, report) values ('";
            String insertValues = name + "','" + dob + "','" + blood_group + "','" + report + "')";
            String insertToRegister = insertFields + insertValues;

            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertToRegister);
            message.setText("Request has been successfully made");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    }
