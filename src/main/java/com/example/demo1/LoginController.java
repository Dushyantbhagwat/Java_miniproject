package com.example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.event.ActionEvent;

/**
 * Sample Skeleton for '2_coomon login page.fxml' Controller Class
 */

import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LoginController implements Initializable {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="anchorppanelogin"
    private AnchorPane anchorppanelogin; // Value injected by FXMLLoader

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
    private DatabaseConnection connectNow;

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert anchorppanelogin != null : "fx:id=\"anchorppanelogin\" was not injected: check your FXML file '2_coomon login page.fxml'.";
        assert buttonlogin != null : "fx:id=\"buttonlogin\" was not injected: check your FXML file '2_coomon login page.fxml'.";
        assert hyperlinkdonthaveacc != null : "fx:id=\"hyperlinkdonthaveacc\" was not injected: check your FXML file '2_coomon login page.fxml'.";
        assert iamge_ != null : "fx:id=\"iamge_\" was not injected: check your FXML file '2_coomon login page.fxml'.";
        assert message != null : "fx:id=\"message\" was not injected: check your FXML file '2_coomon login page.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file '2_coomon login page.fxml'.";
        assert textbloodguardians != null : "fx:id=\"textbloodguardians\" was not injected: check your FXML file '2_coomon login page.fxml'.";
        assert username != null : "fx:id=\"username\" was not injected: check your FXML file '2_coomon login page.fxml'.";

    }

    public void initialize(URL url, ResourceBundle resourceBundle){
        File backFile = new File("im/background.png");
        Image backImage = new Image(backFile.toURI().toString());
        iamge_.setImage(backImage);
    }

    public void loginButtonOnAction(ActionEvent event){

        if (username.getText().isBlank() == false && password.getText().isBlank() == false){
           setmessage();
        }else {
            message.setText("Please enter your username and password");
        }
    }

    public void setmessage(){
        DatabaseConnection connection = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String verifylogin = "select count(1) from admin_1 where email_id = ' " + username.getText() + " ' and password = ' " + password.getText() + " ' ";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifylogin);

            while (queryResult.next()){
                if (queryResult.getInt(1)== 1){
                    message.setText("Congratulations!");
                }else {
                    message.setText("Invalid credentials. Please try again.");
                }

            }

        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }

    }

    public void createaccount(){
        try{
            Object root = FXMLLoader.load(getClass().getResource("3_blood_bank_sign_up.fxml")); //pass scene name here
            Scene scene = new Scene((Parent) root);
            Stage registerstage = new Stage();
            registerstage.setScene(scene);
            registerstage.show();
            registerstage.setResizable(false);
            registerstage.setTitle("account"); // set title of app

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}



