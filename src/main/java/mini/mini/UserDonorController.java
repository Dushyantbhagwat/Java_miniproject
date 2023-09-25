package mini.mini;

/**
 * Sample Skeleton for '12_DONOR PAGE (1).fxml' Controller Class
 */

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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

    public class UserDonorController implements Initializable {

        @FXML // ResourceBundle that was given to the FXMLLoader
        private ResourceBundle resources;

        @FXML // URL location of the FXML file that was given to the FXMLLoader
        private URL location;

        @FXML // fx:id="Checkbox1"
        private CheckBox Checkbox1; // Value injected by FXMLLoader

        @FXML // fx:id="Checkbox2"
        private CheckBox Checkbox2; // Value injected by FXMLLoader

        @FXML // fx:id="DonateButton"
        private Button DonateButton; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanelBG"
        private Label anchorpanelBG; // Value injected by FXMLLoader

        @FXML // fx:id="anchorpanello"
        private Button anchorpanello; // Value injected by FXMLLoader

        @FXML
        void Checkbox1OnAction(ActionEvent event) {

        }

        @FXML
        void Checkbox2OnAction(ActionEvent event) {

        }

        @FXML
        void DonateButtonOnAction(ActionEvent event) {

            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("(9_patientoverview.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            Scene scene;
            try {
                scene = new Scene(fxmlLoader.load());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Donor");

        }
        @FXML
        void loginbuttonOnAction(ActionEvent event) {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("2_coomon_login_page.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            Scene scene;
            try {
                scene = new Scene(fxmlLoader.load());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Donor");

        }

        @FXML
        void HomeButtonOnAction(ActionEvent event) {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("9_patientoverview.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            Scene scene;
            try {
                scene = new Scene(fxmlLoader.load());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Donor");


        }

        @FXML // This method is called by the FXMLLoader when initialization is complete
        void initialize() {
            assert Checkbox1 != null : "fx:id=\"Checkbox1\" was not injected: check your FXML file '12_DONOR PAGE (1).fxml'.";
            assert Checkbox2 != null : "fx:id=\"Checkbox2\" was not injected: check your FXML file '12_DONOR PAGE (1).fxml'.";
            assert DonateButton != null : "fx:id=\"DonateButton\" was not injected: check your FXML file '12_DONOR PAGE (1).fxml'.";
            assert anchorpanelBG != null : "fx:id=\"anchorpanelBG\" was not injected: check your FXML file '12_DONOR PAGE (1).fxml'.";
            assert anchorpanello != null : "fx:id=\"anchorpanello\" was not injected: check your FXML file '12_DONOR PAGE (1).fxml'.";

        }

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {

        }
    }
