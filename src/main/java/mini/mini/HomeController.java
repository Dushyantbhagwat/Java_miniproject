package mini.mini;


/**
 * Sample Skeleton for '1_startingpage.fxml' Controller Class
 */

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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController  implements Initializable {

    @FXML
    private Button admin;

    @FXML
    private Button user;
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

    private Stage stage;
    private Scene scene;

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
    }

    @FXML
    void userLoginOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("2_coomon_login_page.fxml"));
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
    void adminloginOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("adminlogin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Login");
    }

}






