package com.example.user;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;


public class main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
            Object root = FXMLLoader.load(getClass().getResource("9_patientoverview.fxml")); //pass scene name here
            Scene scene = new Scene((Parent) root);
            stage.setScene(scene);
            stage.show();
            stage.setResizable(false);
            stage.setTitle("patient"); // set title of app

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}