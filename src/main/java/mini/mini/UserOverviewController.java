package mini.mini;

import java.io.File;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;



public class UserOverviewController implements Initializable{

        private Scene scene;
        private Stage stage;
        @FXML // ResourceBundle that was given to the FXMLLoader
        private ResourceBundle resources;

        @FXML // URL location of the FXML file that was given to the FXMLLoader
        private URL location;

        @FXML // fx:id="anchorpanel2AA"
        private AnchorPane anchorpanel2AA; // Value injected by FXMLLoader

        @FXML // fx:id="Hlabel"
        private Label Hlabel; // Value injected by FXMLLoader
        @FXML // fx:id="anchorpanel2AR"
        private Label anchorpanel2AR; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanel2ARNO"
        private Label anchorpanel2ARNO; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanel2BG"
        private AnchorPane anchorpanel2BG; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanel2BGB"
        private Label anchorpanel2BGB; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanel2L"
        private AnchorPane anchorpanel2L; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanel2PR"
        private Label anchorpanel2PR; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanel2PRNO"
        private Label anchorpanel2PRNO; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanel2RM"
        private Label anchorpanel2RM; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanel2RMNO"
        private Label anchorpanel2RMNO; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanel2RR"
        private Label anchorpanel2RR; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanel2RRNO"
        private Label anchorpanel2RRNO; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanel2SP"
        private SplitPane anchorpanel2SP; // Value injected by FXMLLoader

        @FXML // fx:id="bloodrequestsymbol"
        private ImageView bloodrequestsymbol; // Value injected by FXMLLoader

        @FXML // fx:id="donatesymbol"
        private ImageView donatesymbol; // Value injected by FXMLLoader

        @FXML // fx:id="dontebutton"
        private Button dontebutton; // Value injected by FXMLLoader

        @FXML // fx:id="homebutton"
        private Button homebutton; // Value injected by FXMLLoader

        @FXML // fx:id="homesymbol"
        private ImageView homesymbol; // Value injected by FXMLLoader

        @FXML // fx:id="imagefull"
        private ImageView imagefull; // Value injected by FXMLLoader

        @FXML // fx:id="loginbutton"
        private Button loginbutton; // Value injected by FXMLLoader

        @FXML // fx:id="makerequestbutton"
        private Button makerequestbutton; // Value injected by FXMLLoader

        @FXML // fx:id="requesthistory"
        private Button requesthistory; // Value injected by FXMLLoader

        @FXML // fx:id="requesthistorysybol"
        private ImageView requesthistorysybol; // Value injected by FXMLLoader

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



//    @FXML
//    void requestOnAction(ActionEvent event) {
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("10_Patient Requesting for blood.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        try {
//            scene = new Scene(fxmlLoader.load());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        stage.setScene(scene);
//        stage.show();
//        stage.setTitle("Request");
//
//    }
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
            // This method is called by the FXMLLoader when initialization is complete
        void initialize() {
            assert anchorpanel2AA != null : "fx:id=\"anchorpanel2AA\" was not injected: check your FXML file '9_patientoverview.fxml'.";
            assert anchorpanel2AR != null : "fx:id=\"anchorpanel2AR\" was not injected: check your FXML file '9_patientoverview.fxml'.";
            assert anchorpanel2ARNO != null : "fx:id=\"anchorpanel2ARNO\" was not injected: check your FXML file '9_patientoverview.fxml'.";
            assert anchorpanel2BG != null : "fx:id=\"anchorpanel2BG\" was not injected: check your FXML file '9_patientoverview.fxml'.";
            assert anchorpanel2BGB != null : "fx:id=\"anchorpanel2BGB\" was not injected: check your FXML file '9_patientoverview.fxml'.";
            assert anchorpanel2L != null : "fx:id=\"anchorpanel2L\" was not injected: check your FXML file '9_patientoverview.fxml'.";
            assert anchorpanel2PR != null : "fx:id=\"anchorpanel2PR\" was not injected: check your FXML file '9_patientoverview.fxml'.";
            assert anchorpanel2PRNO != null : "fx:id=\"anchorpanel2PRNO\" was not injected: check your FXML file '9_patientoverview.fxml'.";
            assert anchorpanel2RM != null : "fx:id=\"anchorpanel2RM\" was not injected: check your FXML file '9_patientoverview.fxml'.";
            assert anchorpanel2RMNO != null : "fx:id=\"anchorpanel2RMNO\" was not injected: check your FXML file '9_patientoverview.fxml'.";
            assert anchorpanel2RR != null : "fx:id=\"anchorpanel2RR\" was not injected: check your FXML file '9_patientoverview.fxml'.";
            assert anchorpanel2RRNO != null : "fx:id=\"anchorpanel2RRNO\" was not injected: check your FXML file '9_patientoverview.fxml'.";
            assert anchorpanel2SP != null : "fx:id=\"anchorpanel2SP\" was not injected: check your FXML file '9_patientoverview.fxml'.";
            assert bloodrequestsymbol != null : "fx:id=\"bloodrequestsymbol\" was not injected: check your FXML file '9_patientoverview.fxml'.";
            assert donatesymbol != null : "fx:id=\"donatesymbol\" was not injected: check your FXML file '9_patientoverview.fxml'.";
            assert dontebutton != null : "fx:id=\"dontebutton\" was not injected: check your FXML file '9_patientoverview.fxml'.";
            assert homebutton != null : "fx:id=\"homebutton\" was not injected: check your FXML file '9_patientoverview.fxml'.";
            assert homesymbol != null : "fx:id=\"homesymbol\" was not injected: check your FXML file '9_patientoverview.fxml'.";
            assert imagefull != null : "fx:id=\"imagefull\" was not injected: check your FXML file '9_patientoverview.fxml'.";
            assert loginbutton != null : "fx:id=\"loginbutton\" was not injected: check your FXML file '9_patientoverview.fxml'.";
            assert makerequestbutton != null : "fx:id=\"makerequestbutton\" was not injected: check your FXML file '9_patientoverview.fxml'.";
            assert requesthistory != null : "fx:id=\"requesthistory\" was not injected: check your FXML file '9_patientoverview.fxml'.";
            assert requesthistorysybol != null : "fx:id=\"requesthistorysybol\" was not injected: check your FXML file '9_patientoverview.fxml'.";
            assert imagefull != null : "fx:id=\"imagefull\" was not injected: check your FXML file '9_patientoverview.fxml'.";
        }

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {

            File backFile6 = new File("im/Your paragraph text (1).png");
            Image backImage6 = new Image(backFile6.toURI().toString());
            imagefull.setImage(backImage6);

            File backFile1 = new File("im/WhatsApp Image 2023-09-02 at 22.25.59.jpg");
            Image backImage1 = new Image(backFile1.toURI().toString());
            homesymbol.setImage(backImage1);

            File backFile2 = new File("im/WhatsApp Image 2023-09-02 at 22.25.5.jpg");
            Image backImage2 = new Image(backFile2.toURI().toString());
            donatesymbol.setImage(backImage2);

//            File backFile4 = new File("im/WhatsApp Image 2023-09-02 at 22.25.58.jpg");
//            Image backImage4 = new Image(backFile4.toURI().toString());
//            bloodrequestsymbol.setImage(backImage4);

            File backFile5 = new File("im/WhatsApp Image 2023-09-02 at 22.25..jpg");
            Image backImage5 = new Image(backFile5.toURI().toString());
            requesthistorysybol.setImage(backImage5);

        }
    }

