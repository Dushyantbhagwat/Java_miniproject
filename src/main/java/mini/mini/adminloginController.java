/**
 * Sample Skeleton for 'adminlogin.fxml' Controller Class
 */

package mini.mini;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.EventObject;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class adminloginController implements Initializable {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="anchorppanelogin"
    private AnchorPane anchorppanelogin; // Value injected by FXMLLoader

    @FXML // fx:id="backbutton"
    private Button backbutton; // Value injected by FXMLLoader

    @FXML // fx:id="diplaymessage"
    private Label diplaymessage; // Value injected by FXMLLoader

    @FXML // fx:id="iamge_"
    private ImageView iamge_; // Value injected by FXMLLoader

    @FXML // fx:id="loginbuton"
    private Button loginbuton; // Value injected by FXMLLoader

    @FXML // fx:id="passwordtext"
    private PasswordField passwordtext; // Value injected by FXMLLoader

    @FXML // fx:id="textbloodguardians"
    private TextField textbloodguardians; // Value injected by FXMLLoader

    @FXML // fx:id="usernametext"
    private TextField usernametext; // Value injected by FXMLLoader

    private Stage stage;
    private Scene scene;

    @FXML
        // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert anchorppanelogin != null : "fx:id=\"anchorppanelogin\" was not injected: check your FXML file 'adminlogin.fxml'.";
        assert backbutton != null : "fx:id=\"backbutton\" was not injected: check your FXML file 'adminlogin.fxml'.";
        assert diplaymessage != null : "fx:id=\"diplaymessage\" was not injected: check your FXML file 'adminlogin.fxml'.";
        assert iamge_ != null : "fx:id=\"iamge_\" was not injected: check your FXML file 'adminlogin.fxml'.";
        assert loginbuton != null : "fx:id=\"loginbuton\" was not injected: check your FXML file 'adminlogin.fxml'.";
        assert passwordtext != null : "fx:id=\"passwordtext\" was not injected: check your FXML file 'adminlogin.fxml'.";
        assert textbloodguardians != null : "fx:id=\"textbloodguardians\" was not injected: check your FXML file 'adminlogin.fxml'.";
        assert usernametext != null : "fx:id=\"usernametext\" was not injected: check your FXML file 'adminlogin.fxml'.";

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File backFile = new File("im/background.png");
        Image backImage = new Image(backFile.toURI().toString());
        iamge_.setImage(backImage);
    }

    public void loginButtononClick(ActionEvent event) {

        if (usernametext.getText().isBlank() == true && passwordtext.getText().isBlank() == true) {
            diplaymessage.setText("Please enter your email and password!");
        } else if (usernametext.getText() == "") {
            diplaymessage.setText("Please enter your email!");
        } else if (passwordtext.getText() == "") {
            diplaymessage.setText("Please enter your password!");
        } else {
            diplaymessage.setText("");
        }
        setmessage();
    }
    public void setmessage () {

                DatabaseConnection connection = new DatabaseConnection();
                Connection connection1 = connection.getConnection();

                String verifylogin = "select count(1) from blood_guardians where username = '" + usernametext.getText() + "' and password ='" + passwordtext.getText() + "'";

                try {
                    Statement statement = connection1.createStatement();
                    ResultSet queryResult = statement.executeQuery(verifylogin);

                    while (queryResult.next()) {
                        if (queryResult.getInt(1) == 1) {
                            diplaymessage.setText("Congratulations!");


                        } else {
                            diplaymessage.setText("Invalid credentials. Please try again.");
                        }

                    }
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        }









