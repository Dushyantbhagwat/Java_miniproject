package mini.mini;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
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
import java.sql.*;
import java.util.ResourceBundle;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class UserLoginController implements Initializable {

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

    @FXML
    private Hyperlink forgotpass;
    private Stage stage;
    private Scene scene;

    public int loggedInUserId;

    // This method is called by the FXMLLoader when initialization is complete
    @FXML
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

//    public void loginbuttonOnAction(ActionEvent e) throws SQLException {
//
//        if (username.getText().isBlank() == false && password.getText().isBlank() == false) {
//            setmessage(e);
//        } else {
//            message.setText("Please enter your username and password");
//        }
//    }
//
//    public void setmessage(ActionEvent e) {
//        DatabaseConnection connection = new DatabaseConnection();
//        Connection connection1 = connection.getConnection();
//
//        String verifylogin = "select count(1) from users where email_id = '" + username.getText() + "' and password ='" + password.getText() + "'";
//
//        try {
//            Statement statement = connection1.createStatement();
//            ResultSet queryResult = statement.executeQuery(verifylogin);
//
//            while (queryResult.next()) {
//                int userId = queryResult.getInt("user_id");
//                CurrentUser.setLoggedInUser(userId);
//                if (queryResult.getInt(1) == 1) {
//                    FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("9_patientoverview.fxml"));
//                    stage = (Stage)((Node)e.getSource()).getScene().getWindow();
//                    try {
//                        scene = new Scene(fxmlLoader.load());
//                    } catch (IOException event) {
//                        throw new RuntimeException(String.valueOf(e));
//                    }
//                    stage.setScene(scene);
//                    stage.show();
//                    stage.setTitle("Dashboard");
//
//                } else {
//                    message.setText("Invalid Credentials");
//                }
//            }
//        } catch (Exception ep) {
//            ep.printStackTrace();
//        }
//    }


    public void loginButtonOnAction(ActionEvent e) throws SQLException {
        if (!username.getText().isBlank() && !password.getText().isBlank()) {
            int userId = authenticateUser(username.getText(), password.getText()); // Retrieve user ID
            if (userId != -1) {
                AuthService.getInstance().login(userId);
                changeSceneToDashboard(e);
            }else {
                message.setText("Invalid username or password");
            }

        } else {
            message.setText("Please enter your username and password");
        }
    }

    public int authenticateUser(String username, String password) {
        int userId=-1;
        DatabaseConnection connection = new DatabaseConnection();
        Connection connection1 = connection.getConnection();




        String verifyLogin = "SELECT user_id FROM users WHERE email_id = ? AND password = ?";

        try {
            PreparedStatement preparedStatement = connection1.prepareStatement(verifyLogin);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet queryResult = preparedStatement.executeQuery();

            if (queryResult.next()) {

                // Store the user ID in CurrentUser or another appropriate location
//                userId = queryResult.getInt("user_id");
                return queryResult.getInt("user_id");
//                FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("9_patientoverview.fxml"));
//                stage = (Stage)((Node)e.getSource()).getScene().getWindow();
//                try {
//                    scene = new Scene(fxmlLoader.load());
//                } catch (IOException event) {
//                    throw new RuntimeException(String.valueOf(e));
//                }
//                stage.setScene(scene);
//                stage.show();
//                stage.setTitle("Dashboard");
            } else {
                return -1;
//                message.setText("Invalid Credentials");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return -1;
        }
//        return userId;
    }

    private void changeSceneToDashboard(ActionEvent e) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("9_patientoverview.fxml"));
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();

        try {
                scene = new Scene(fxmlLoader.load());
        } catch (IOException event) {
            throw new RuntimeException(String.valueOf(e));
        }
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Dashboard");
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
    void forgOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ForgotPassword.fxml"));
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

