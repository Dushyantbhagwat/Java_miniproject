package com.example.demo7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;


public class main extends Application{
    @Override
    public void start(Stage stage) throws IOException {
        try {
            Object root = FXMLLoader.load(getClass().getResource("4_HOME PAGE ADMIN.fxml")); //pass scene name here
            Scene scene = new Scene((Parent) root);
            stage.setScene(scene);
            stage.show();
            stage.setResizable(false);
            stage.setTitle("HOME"); // set title of app

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
