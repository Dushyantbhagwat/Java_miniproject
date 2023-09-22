package mini.mini;


/**
 * Sample Skeleton for '1_startingpage.fxml' Controller Class
 */

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.StringConverter;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController  implements Initializable {

    @FXML // fx:id="addbloodbankopt"
    private Button addbloodbankopt; // Value injected by FXMLLoader

    @FXML // fx:id="userclickopt"
    private Button userclickopt; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpanescreen"
    private AnchorPane anchorpanescreen; // Value injected by FXMLLoader

    @FXML // fx:id="cbtdi"
    private ImageView cbtdi; // Value injected by FXMLLoader

    @FXML // fx:id="loginmenu"
    private MenuButton loginmenu; // Value injected by FXMLLoader

    @FXML // fx:id="obbcs"
    private ImageView obbcs; // Value injected by FXMLLoader

    @FXML // fx:id="symbol"
    private ImageView symbol; // Value injected by FXMLLoader


    @FXML // fx:id="vboxscreen"
    private VBox vboxscreen; // Value injected by FXMLLoader

    @FXML // fx:id="bglabel"
    private Label bglabel; // Value injected by FXMLLoader

    @FXML // fx:id="login"
    private ChoiceBox<String> login; // Value injected by FXMLLoader
    private Stage stage;
    private String scene;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        File upFile = new File("im/panel.JPG");
        Image upImage = new Image(upFile.toURI().toString());
        symbol.setImage(upImage);

        File leftFile = new File("im/DONATE NW'.JPG");
        Image leftImage = new Image(leftFile.toURI().toString());
        obbcs.setImage(leftImage);

        File rightFile = new File("im/blood info.JPG");
        Image rightImage = new Image(rightFile.toURI().toString());
        cbtdi.setImage(rightImage);


        login.getItems().addAll("Admin", "User");

//        login.setConverter(new StringConverter<String>() {
//            @Override
//            public String toString(String s) {
//                return (s == null) ? "Login" : s;
//            }
//
//            @Override
//            public String fromString(String s) {
//                return null;
//            }
    }

        @FXML
        private void handleSceneChange() {
            String selectedScene = login.getValue();

            try {
                // Load the selected FXML file
                FXMLLoader loader = new FXMLLoader(getClass().getResource(selectedScene + "2_coomon_login_page.fxml"));
                Parent root = loader.load();

                // Set the new scene
                Scene scene = new Scene(root);
                Stage stage = (Stage) login.getScene().getWindow();
                stage.setScene(scene);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }









//    @FXML
//    void () {
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("2_coomon_login_page.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        try {
//            scene = new Scene(fxmlLoader.load());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        stage.setScene(scene);
//        stage.show();
//        stage.setTitle("Login");
//    }
//
//    @FXML
//    public void hometoBloodBanksignup(ActionEvent event){
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("3_blood_bank_sign_up.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        try {
//            scene = new Scene(fxmlLoader.load());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        stage.setScene(scene);
//        stage.show();
//        stage.setTitle("Register");
//    }







