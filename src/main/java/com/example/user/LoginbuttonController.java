package com.example.user;

/**
 * Sample Skeleton for '2_coomon_login_page.fxml' Controller Class
 */



import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginbuttonController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="anchorppanelogin"
    private AnchorPane anchorppanelogin; // Value injected by FXMLLoader

    @FXML // fx:id="back"
    private Button back; // Value injected by FXMLLoader

    @FXML // fx:id="buttonlogin"
    private Button buttonlogin; // Value injected by FXMLLoader

    @FXML // fx:id="hyperlinkdonthaveacc"
    private Hyperlink hyperlinkdonthaveacc; // Value injected by FXMLLoader

    @FXML // fx:id="iamge_"
    private ImageView iamge_; // Value injected by FXMLLoader

    @FXML // fx:id="message"
    private Label message; // Value injected by FXMLLoader

    @FXML // fx:id="password"
    private PasswordField password; // Value injected by FXMLLoader

    @FXML // fx:id="textbloodguardians"
    private TextField textbloodguardians; // Value injected by FXMLLoader

    @FXML // fx:id="username"
    private TextField username; // Value injected by FXMLLoader

    private Scene scene;

    @FXML
    void backTohomeOnAction(ActionEvent event) {

    }

    @FXML
    void hyperlinkdonthaveaccOnAction(ActionEvent event) {

    }

    @FXML
    void loginbuttonOnAction(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert anchorppanelogin != null : "fx:id=\"anchorppanelogin\" was not injected: check your FXML file '2_coomon_login_page.fxml'.";
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file '2_coomon_login_page.fxml'.";
        assert buttonlogin != null : "fx:id=\"buttonlogin\" was not injected: check your FXML file '2_coomon_login_page.fxml'.";
        assert hyperlinkdonthaveacc != null : "fx:id=\"hyperlinkdonthaveacc\" was not injected: check your FXML file '2_coomon_login_page.fxml'.";
        assert iamge_ != null : "fx:id=\"iamge_\" was not injected: check your FXML file '2_coomon_login_page.fxml'.";
        assert message != null : "fx:id=\"message\" was not injected: check your FXML file '2_coomon_login_page.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file '2_coomon_login_page.fxml'.";
        assert textbloodguardians != null : "fx:id=\"textbloodguardians\" was not injected: check your FXML file '2_coomon_login_page.fxml'.";
        assert username != null : "fx:id=\"username\" was not injected: check your FXML file '2_coomon_login_page.fxml'.";

    }

}

