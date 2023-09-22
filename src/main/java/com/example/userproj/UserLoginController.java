package com.example.userproj;

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

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class UserLoginController implements Initializable {

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

    @FXML

    private Stage stage;
    private Scene scene;

    @FXML
        // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert anchorppanelogin != null : "fx:id=\"anchorppanelogin\" was not injected: check your FXML file '2_coomon login page.fxml'.";
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file '2_coomon login page.fxml'.";
        assert buttonlogin != null : "fx:id=\"buttonlogin\" was not injected: check your FXML file '2_coomon login page.fxml'.";
        assert hyperlinkdonthaveacc != null : "fx:id=\"hyperlinkdonthaveacc\" was not injected: check your FXML file '2_coomon login page.fxml'.";
        assert iamge_ != null : "fx:id=\"iamge_\" was not injected: check your FXML file '2_coomon login page.fxml'.";
        assert message != null : "fx:id=\"message\" was not injected: check your FXML file '2_coomon login page.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file '2_coomon login page.fxml'.";
        assert textbloodguardians != null : "fx:id=\"textbloodguardians\" was not injected: check your FXML file '2_coomon login page.fxml'.";
        assert username != null : "fx:id=\"username\" was not injected: check your FXML file '2_coomon login page.fxml'.";

    }


    public void initialize(URL location, ResourceBundle resources) {
        File backFile = new File("im/background.png");
        Image backImage = new Image(backFile.toURI().toString());
        iamge_.setImage(backImage);
    }

    public void loginbuttonOnAction(ActionEvent event) {

        if (username.getText().isBlank() == false && password.getText().isBlank() == false) {
            setmessage();
        } else {
            message.setText("Please enter your username and password");
        }
    }

    public void setmessage() {
        UserDBConnection connection = new UserDBConnection();
        Connection connection1 = connection.getConnection();

        String verifylogin = "select count(1) from users where emailid = '" + username.getText() + "' and password ='" + password.getText() + "'";

        try {
            Statement statement = connection1.createStatement();
            ResultSet queryResult = statement.executeQuery(verifylogin);

            while (queryResult.next()) {
                if (queryResult.getInt(1) == 1) {
                    message.setText("      Congratulations!   ");
                } else {
                    message.setText("Invalid credentials. Please try again.");
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

    @FXML
    void backTohomeOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("1_startingpage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Home");
    }

    @FXML
    void hyperlinkdonthaveaccOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("8_user sign up.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Register");

    }
}




