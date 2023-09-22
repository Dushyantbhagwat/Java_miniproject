package com.example.userproj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class main extends Application {





    @Override
    public void start(Stage stage) throws IOException {
        try {
            Object root = FXMLLoader.load(getClass().getResource("2_coomon_login_page.fxml")); //pass scene name here
            Scene scene = new Scene((Parent) root);
            stage.setScene(scene);
            stage.show();
            stage.setResizable(false);
            stage.setTitle("login"); // set title of app

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
