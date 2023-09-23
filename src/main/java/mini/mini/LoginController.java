package mini.mini;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.event.ActionEvent;
import javafx.scene.Node;

/**
 * Sample Skeleton for '2_coomon login page.fxml' Controller Class
 */

import java.io.File;
import java.io.IOException;
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

    @FXML
    private AnchorPane anchorppanelogin;

    @FXML
    private Button back;

    @FXML
    private Button buttonlogin;

    @FXML
    private Hyperlink hyperlinkdonthaveacc;

    @FXML
    private ImageView iamge_;

    @FXML
    private Label message;

    @FXML
    private PasswordField password;

    @FXML
    private TextField textbloodguardians;

    @FXML
    private TextField username;
    private Stage stage;
    private Scene scene;


    @FXML
        // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert anchorppanelogin != null : "fx:id=\"anchorppanelogin\" was not injected: check your FXML file '2_coomon_login_page.fxml'.";
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file '2_coomon_login_page.fxml'.";
        assert buttonlogin != null : "fx:id=\"buttonlogin\" was not injected: check your FXML file '2_coomon_login_page.fxml'.";
        assert hyperlinkdonthaveacc != null : "fx:id=\"hyperlinkdonthaveacc\" was not injected: check your FXML file '2_coomon_login_page.fxml'.";
        assert iamge_ != null : "fx:id=\"iamge_\" was not injected: check your FXML file '2_coomon_login_page.fxml'.";
        assert message != null : "fx:id=\"message\" was not injected: check your FXML file '2_coomon_login_page.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file '2_coomon_login_page.fxml'.";
        assert textbloodguardians != null : "fx:id=\"textbloodguardians\" was not injected: check your FXML file '2_coomon_login_page.fxml'.";
        assert username != null : "fx:id=\"username\" was not injected: check your FXML file '2_coomon_login_page.fxml'.";

    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
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
        DatabaseConnection connection = new DatabaseConnection();
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
    void hyperlinkdonthaveaccOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("8_user sign up.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Register");
    }

    @FXML
    void backTohomeOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("1_startingpage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Home");
    }
}

