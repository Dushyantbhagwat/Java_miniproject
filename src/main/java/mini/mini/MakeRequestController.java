package mini.mini;

/**
 * Sample Skeleton for '10_Patient Requesting for blood.fxml' Controller Class
 */

import java.io.File;
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
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

    public class MakeRequestController implements Initializable {

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

        @FXML // fx:id="BloodGroupMenuButton"
        private SplitMenuButton BloodGroupMenuButton; // Value injected by FXMLLoader

        @FXML // fx:id="BloodRequestButton"
        private Button BloodRequestButton; // Value injected by FXMLLoader

        @FXML // fx:id="DonateButton"
        private Button DonateButton; // Value injected by FXMLLoader

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

        @FXML // fx:id="specifyreasonTextField"
        private TextField specifyreasonTextField; // Value injected by FXMLLoader

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
            assert DonateButton != null : "fx:id=\"DonateButton\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";
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
            assert specifyreasonTextField != null : "fx:id=\"specifyreasonTextField\" was not injected: check your FXML file '10_Patient Requesting for blood.fxml'.";

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

        }
    }
