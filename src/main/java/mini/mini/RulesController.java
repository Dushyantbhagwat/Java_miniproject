package mini.mini;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * Sample Skeleton for '13_rules for donation.fxml' Controller Class
 */

public class RulesController implements Initializable {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="closebutton"
    private Button closebutton; // Value injected by FXMLLoader

    @FXML // fx:id="rules"
    private ImageView rules; // Value injected by FXMLLoader

    @FXML // fx:id="rules1"
    private ImageView rules1; // Value injected by FXMLLoader


    private Stage stage;

    private Scene scene;
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert closebutton != null : "fx:id=\"closebutton\" was not injected: check your FXML file '13_rules for donation.fxml'.";
        assert rules != null : "fx:id=\"rules\" was not injected: check your FXML file '13_rules for donation.fxml'.";
        assert rules1 != null : "fx:id=\"rules1\" was not injected: check your FXML file '13_rules for donation.fxml'.";

    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File backFile1 = new File("im/Screenshot 2023-09-02 195811.jpg");
        Image backImage1 = new Image(backFile1.toURI().toString());
        rules.setImage(backImage1);

        File backFile2= new File("im/Screenshot 2023-09-02 201914.jpg");
        Image backImage2 = new Image(backFile2.toURI().toString());
        rules1.setImage(backImage2);


    }

    @FXML
    void closeOnAction(ActionEvent event) {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("9_patientoverview.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Rules");

    }
}
