/**
 * Sample Skeleton for '10_Patient Requesting for blood.fxml' Controller Class
 */

package mini.mini;

import java.io.*;
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
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
//import org.w3c.dom.Node;
import javafx.scene.image.Image;
import javafx.scene.Node;
import javafx.util.StringConverter;


public class MakeRequestController  implements Initializable {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="AnchorPaneButtons"
    private AnchorPane AnchorPaneButtons; // Value injected by FXMLLoader

    @FXML // fx:id="AnchorPaneFull"
    private AnchorPane AnchorPaneFull; // Value injected by FXMLLoader

    @FXML // fx:id="BloodGauridansLabel"
    private Label BloodGauridansLabel; // Value injected by FXMLLoader

    @FXML // fx:id="BloodRequestButton"
    private Button BloodRequestButton; // Value injected by FXMLLoader

    @FXML // fx:id="HomeButton"
    private Button HomeButton; // Value injected by FXMLLoader

    @FXML // fx:id="HomeButton1"
    private Button HomeButton1; // Value injected by FXMLLoader

    @FXML // fx:id="LogOutButton"
    private Button LogOutButton; // Value injected by FXMLLoader

    @FXML // fx:id="PatientNameTextField"
    private TextField PatientNameTextField; // Value injected by FXMLLoader

    @FXML // fx:id="RequestHistoryButton"
    private Button RequestHistoryButton; // Value injected by FXMLLoader

    @FXML // fx:id="bloodrequestsymbol"
    private ImageView bloodrequestsymbol; // Value injected by FXMLLoader

    @FXML // fx:id="dobid"
    private DatePicker dobid; // Value injected by FXMLLoader

    @FXML // fx:id="donatesymbol"
    private ImageView donatesymbol; // Value injected by FXMLLoader


    @FXML // fx:id="homesymbol"
    private ImageView homesymbol; // Value injected by FXMLLoader

    @FXML // fx:id="imagefull"
    private ImageView imagefull; // Value injected by FXMLLoader


    @FXML // fx:id="message"
    private Label message; // Value injected by FXMLLoader

    @FXML // fx:id="requestButton"
    private Button requestButton; // Value injected by FXMLLoader

    @FXML // fx:id="requesthistorysybol"
    private ImageView requesthistorysybol; // Value injected by FXMLLoader


    @FXML // fx:id="medical"
    private Button medical; // Value injected by FXMLLoader


    @FXML
    private ChoiceBox<String > bloodgroupchoice;
    private Stage stage;
    private Scene scene;

    @FXML  // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert AnchorPaneButtons != null : "fx:id=\"AnchorPaneButtons\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
        assert AnchorPaneFull != null : "fx:id=\"AnchorPaneFull\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
        assert BloodGauridansLabel != null : "fx:id=\"BloodGauridansLabel\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
        assert BloodRequestButton != null : "fx:id=\"BloodRequestButton\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
        assert HomeButton != null : "fx:id=\"HomeButton\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
        assert HomeButton1 != null : "fx:id=\"HomeButton1\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
        assert LogOutButton != null : "fx:id=\"LogOutButton\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
        assert PatientNameTextField != null : "fx:id=\"PatientNameTextField\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
        assert RequestHistoryButton != null : "fx:id=\"RequestHistoryButton\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
        assert bloodrequestsymbol != null : "fx:id=\"bloodrequestsymbol\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
        assert dobid != null : "fx:id=\"dobid\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
        assert donatesymbol != null : "fx:id=\"donatesymbol\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
        assert homesymbol != null : "fx:id=\"homesymbol\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
        assert imagefull != null : "fx:id=\"imagefull\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
        assert message != null : "fx:id=\"message\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
        assert requestButton != null : "fx:id=\"requestButton\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
        assert requesthistorysybol != null : "fx:id=\"requesthistorysybol\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
        assert bloodgroupchoice != null : "fx:id=\"bloodgroupchoice\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
        assert medical != null : "fx:id=\"medical\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
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


        bloodgroupchoice.getItems().addAll("A+", "B+", "O+", "AB+", "A-", "B-", "O-", "AB-");
        bloodgroupchoice.setConverter(new StringConverter<String>() {
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
        File file = fileChooser.showOpenDialog(medical.getScene().getWindow());
        String filename = file.getAbsolutePath();
        medical.setText(filename);
    }

    public void requestButtonOnAction(ActionEvent actionEventevent) throws SQLException, FileNotFoundException {
        if (PatientNameTextField != null && dobid != null && bloodgroupchoice != null) {
            makingrequest();
        } else {
            message.setText("enter all above asked information");

        }
    }
        public void makingrequest () throws SQLException, FileNotFoundException {

            LocalDate localDate = dobid.getValue();
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String dob = localDate.format(dateTimeFormatter);

            DatabaseConnection connectNow = new DatabaseConnection();
            Connection connectDB = connectNow.getConnection();

            String name = PatientNameTextField.getText();
            String bloodgroup = bloodgroupchoice.getValue();
            InputStream report = new FileInputStream(medical.getText());

            try {

                String insertFields = "insert into patient(name, dob, bloodgroup, report) values ('";
                String inserValues = name + "','" + dob + "','" + bloodgroup + "','" + report + "')";
                String insertToRegister4 = insertFields + inserValues;

                Statement statement = connectDB.createStatement();
                statement.executeUpdate(insertToRegister4);
                message.setText("You  request for blood has been made!");

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }



    @FXML
    void requestOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("10_Patient Requesting for blood.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Request");

    }

        @FXML
        void donatebuttonOnAction(ActionEvent event) {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("12_DONOR PAGE.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
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
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
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
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
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
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
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
