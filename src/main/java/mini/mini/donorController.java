package mini.mini;
/**
 * Sample Skeleton for 'donor_details.fxml' Controller Class
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
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class donorController implements Initializable {
    private Stage stage;

    private Scene scene;

        @FXML // ResourceBundle that was given to the FXMLLoader
        private ResourceBundle resources;

        @FXML // URL location of the FXML file that was given to the FXMLLoader
        private URL location;

        @FXML // fx:id="anchorpanelARH"
        private AnchorPane anchorpanelARH; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanelAV"
        private AnchorPane anchorpanelAV; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanelAVE"
        private AnchorPane anchorpanelAVE; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanelBG"
        private Label anchorpanelBG; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanelBR"
        private Button anchorpanelBR; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanelD"
        private Button anchorpanelD; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanelDD"
        private Label anchorpanelDD; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanelH"
        private Button anchorpanelH; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanelIV"
        private ImageView anchorpanelIV; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanelP"
        private Button anchorpanelP; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanelSP"
        private SplitPane anchorpanelSP; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanelTCA"
        private TableColumn<?, ?> anchorpanelTCA; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanelTCA1"
        private TableColumn<?, ?> anchorpanelTCA1; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanelTCBG"
        private TableColumn<?, ?> anchorpanelTCBG; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanelTCM"
        private TableColumn<?, ?> anchorpanelTCM; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanelTCN"
        private TableColumn<?, ?> anchorpanelTCN; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanelTCP"
        private TableColumn<?, ?> anchorpanelTCP; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanelTV"
        private TableView<?> anchorpanelTV; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanello"
        private Button anchorpanello; // Value injected by FXMLLoader

        @FXML // fx:id="iamgebloodrequest"
        private ImageView iamgebloodrequest; // Value injected by FXMLLoader

        @FXML // fx:id="iamgehome"
        private ImageView iamgehome; // Value injected by FXMLLoader

        @FXML // fx:id="iamgepatient"
        private ImageView iamgepatient; // Value injected by FXMLLoader

        @FXML // fx:id="imagedonor"
        private ImageView imagedonor; // Value injected by FXMLLoader

        @FXML // This method is called by the FXMLLoader when initialization is complete
        void initialize() {
            assert anchorpanelARH != null : "fx:id=\"anchorpanelARH\" was not injected: check your FXML file 'donor_details.fxml'.";
            assert anchorpanelAV != null : "fx:id=\"anchorpanelAV\" was not injected: check your FXML file 'donor_details.fxml'.";
            assert anchorpanelAVE != null : "fx:id=\"anchorpanelAVE\" was not injected: check your FXML file 'donor_details.fxml'.";
            assert anchorpanelBG != null : "fx:id=\"anchorpanelBG\" was not injected: check your FXML file 'donor_details.fxml'.";
            assert anchorpanelBR != null : "fx:id=\"anchorpanelBR\" was not injected: check your FXML file 'donor_details.fxml'.";
            assert anchorpanelD != null : "fx:id=\"anchorpanelD\" was not injected: check your FXML file 'donor_details.fxml'.";
            assert anchorpanelDD != null : "fx:id=\"anchorpanelDD\" was not injected: check your FXML file 'donor_details.fxml'.";
            assert anchorpanelH != null : "fx:id=\"anchorpanelH\" was not injected: check your FXML file 'donor_details.fxml'.";
            assert anchorpanelIV != null : "fx:id=\"anchorpanelIV\" was not injected: check your FXML file 'donor_details.fxml'.";
            assert anchorpanelP != null : "fx:id=\"anchorpanelP\" was not injected: check your FXML file 'donor_details.fxml'.";
            assert anchorpanelSP != null : "fx:id=\"anchorpanelSP\" was not injected: check your FXML file 'donor_details.fxml'.";
            assert anchorpanelTCA != null : "fx:id=\"anchorpanelTCA\" was not injected: check your FXML file 'donor_details.fxml'.";
            assert anchorpanelTCA1 != null : "fx:id=\"anchorpanelTCA1\" was not injected: check your FXML file 'donor_details.fxml'.";
            assert anchorpanelTCBG != null : "fx:id=\"anchorpanelTCBG\" was not injected: check your FXML file 'donor_details.fxml'.";
            assert anchorpanelTCM != null : "fx:id=\"anchorpanelTCM\" was not injected: check your FXML file 'donor_details.fxml'.";
            assert anchorpanelTCN != null : "fx:id=\"anchorpanelTCN\" was not injected: check your FXML file 'donor_details.fxml'.";
            assert anchorpanelTCP != null : "fx:id=\"anchorpanelTCP\" was not injected: check your FXML file 'donor_details.fxml'.";
            assert anchorpanelTV != null : "fx:id=\"anchorpanelTV\" was not injected: check your FXML file 'donor_details.fxml'.";
            assert anchorpanello != null : "fx:id=\"anchorpanello\" was not injected: check your FXML file 'donor_details.fxml'.";
            assert iamgebloodrequest != null : "fx:id=\"iamgebloodrequest\" was not injected: check your FXML file 'donor_details.fxml'.";
            assert iamgehome != null : "fx:id=\"iamgehome\" was not injected: check your FXML file 'donor_details.fxml'.";
            assert iamgepatient != null : "fx:id=\"iamgepatient\" was not injected: check your FXML file 'donor_details.fxml'.";
            assert imagedonor != null : "fx:id=\"imagedonor\" was not injected: check your FXML file 'donor_details.fxml'.";

        }

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
            File backFile1 = new File("im/WhatsApp Image 2023-09-02 at 22.26.00.jpg");
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
        stage.setTitle("Logout");
    }

    @FXML
    void PatientButtonOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("6_patientdetails.fxml"));
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


