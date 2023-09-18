package com.example.demo1;

/**
 * Sample Skeleton for '1_startingpage.fxml' Controller Class
 */

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
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

    public void homeTologin(){
        try {
            Object root = FXMLLoader.load(getClass().getResource("2coomon_login_page.fxml")); //pass scene name here
            Scene scene = new Scene((Parent) root);
            Stage registerstage = new Stage();
            registerstage.setScene(scene);
            registerstage.show();
            registerstage.setResizable(false);
            registerstage.setTitle("Login"); // set title of app

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void homeTobloodBanksignup(){
        try {
            Object root = FXMLLoader.load(getClass().getResource("3_blood_bank_sign_up.fxml")); //pass scene name here
            Scene scene = new Scene((Parent) root);
            Stage registerstage = new Stage();
            registerstage.setScene(scene);
            registerstage.show();
            registerstage.setResizable(false);
            registerstage.setTitle("Register"); // set title of app

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}





