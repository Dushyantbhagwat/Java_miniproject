package mini.mini;

/**
 * Sample Skeleton for '7_bloodrequest.fxml' Controller Class
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

public class BloodRequestController implements Initializable {
    private Stage stage;

    private Scene scene;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="anchorpaneA"
    private AnchorPane anchorpaneA; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpanesplit1"
    private AnchorPane anchorpanesplit1; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpanesplit2"
    private AnchorPane anchorpanesplit2; // Value injected by FXMLLoader

    @FXML // fx:id="bloodgropucolumn"
    private TableColumn<?, ?> bloodgropucolumn; // Value injected by FXMLLoader

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

    @FXML // fx:id="dobcolumn"
    private TableColumn<?, ?> dobcolumn; // Value injected by FXMLLoader

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

    @FXML // fx:id="namecoulmn"
    private TableColumn<?, ?> namecoulmn; // Value injected by FXMLLoader

    @FXML // fx:id="reportcolumn"
    private TableColumn<?, ?> reportcolumn; // Value injected by FXMLLoader

    @FXML // fx:id="splitpaneA"
    private SplitPane splitpaneA; // Value injected by FXMLLoader

    @FXML // fx:id="tableto"
    private TableView<?> tableto; // Value injected by FXMLLoader


    @FXML
        // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert anchorpaneA != null : "fx:id=\"anchorpaneA\" was not injected: check your FXML file 'Blood_request.fxml'.";
        assert anchorpanesplit1 != null : "fx:id=\"anchorpanesplit1\" was not injected: check your FXML file 'Blood_request.fxml'.";
        assert anchorpanesplit2 != null : "fx:id=\"anchorpanesplit2\" was not injected: check your FXML file 'Blood_request.fxml'.";
        assert bloodgropucolumn != null : "fx:id=\"bloodgropucolumn\" was not injected: check your FXML file 'Blood_request.fxml'.";
        assert buttonbloodrequest != null : "fx:id=\"buttonbloodrequest\" was not injected: check your FXML file 'Blood_request.fxml'.";
        assert buttondonor != null : "fx:id=\"buttondonor\" was not injected: check your FXML file 'Blood_request.fxml'.";
        assert buttonhome != null : "fx:id=\"buttonhome\" was not injected: check your FXML file 'Blood_request.fxml'.";
        assert buttonlogout != null : "fx:id=\"buttonlogout\" was not injected: check your FXML file 'Blood_request.fxml'.";
        assert buttonpatient != null : "fx:id=\"buttonpatient\" was not injected: check your FXML file 'Blood_request.fxml'.";
        assert dobcolumn != null : "fx:id=\"dobcolumn\" was not injected: check your FXML file 'Blood_request.fxml'.";
        assert iamgebloodrequest != null : "fx:id=\"iamgebloodrequest\" was not injected: check your FXML file 'Blood_request.fxml'.";
        assert iamgehome != null : "fx:id=\"iamgehome\" was not injected: check your FXML file 'Blood_request.fxml'.";
        assert iamgepatient != null : "fx:id=\"iamgepatient\" was not injected: check your FXML file 'Blood_request.fxml'.";
        assert imagedonor != null : "fx:id=\"imagedonor\" was not injected: check your FXML file 'Blood_request.fxml'.";
        assert labelBG != null : "fx:id=\"labelBG\" was not injected: check your FXML file 'Blood_request.fxml'.";
        assert namecoulmn != null : "fx:id=\"namecoulmn\" was not injected: check your FXML file 'Blood_request.fxml'.";
        assert reportcolumn != null : "fx:id=\"reportcolumn\" was not injected: check your FXML file 'Blood_request.fxml'.";
        assert splitpaneA != null : "fx:id=\"splitpaneA\" was not injected: check your FXML file 'Blood_request.fxml'.";
        assert tableto != null : "fx:id=\"tableto\" was not injected: check your FXML file 'Blood_request.fxml'.";

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

        File backFile4 = new File("im/WhatsApp Image 2023-09-02 at 22.25..jpg");
        Image backImage4 = new Image(backFile4.toURI().toString());
        iamgebloodrequest.setImage(backImage4);

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


}


