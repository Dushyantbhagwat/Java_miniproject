package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {
//    @Override
//    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("2_coommon_login_page.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 642, 301);
//        stage.initStyle(StageStyle.UNDECORATED);
//        stage.setScene(scene);
//        stage.show();
//    }
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

    public static void main(String[] args) {
        launch();
    }
}



