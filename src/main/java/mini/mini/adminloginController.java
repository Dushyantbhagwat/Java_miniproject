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
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
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

    @FXML // fx:id="anchorppanelogin1"
    private AnchorPane anchorppanelogin1; // Value injected by FXMLLoader

    @FXML // fx:id="back"
    private Button back; // Value injected by FXMLLoader

    @FXML // fx:id="backimage"
    private ImageView backimage; // Value injected by FXMLLoader

    @FXML // fx:id="diplaymessage"
    private Label diplaymessage; // Value injected by FXMLLoader

    @FXML // fx:id="extbloodguardians"
    private TextField extbloodguardians; // Value injected by FXMLLoader

    @FXML // fx:id="loginbuton"
    private Button loginbuton; // Value injected by FXMLLoader

    @FXML // fx:id="passwordtext"
    private PasswordField passwordtext; // Value injected by FXMLLoader

    @FXML // fx:id="usernametext"
    private TextField usernametext; // Value injected by FXMLLoader
    private Stage stage;
    private Scene scene;

    private ActionEvent e;

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert anchorppanelogin1 != null : "fx:id=\"anchorppanelogin1\" was not injected: check your FXML file 'adminlogin.fxml'.";
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'adminlogin.fxml'.";
        assert backimage != null : "fx:id=\"backimage\" was not injected: check your FXML file 'adminlogin.fxml'.";
        assert diplaymessage != null : "fx:id=\"diplaymessage\" was not injected: check your FXML file 'adminlogin.fxml'.";
        assert extbloodguardians != null : "fx:id=\"extbloodguardians\" was not injected: check your FXML file 'adminlogin.fxml'.";
        assert loginbuton != null : "fx:id=\"loginbuton\" was not injected: check your FXML file 'adminlogin.fxml'.";
        assert passwordtext != null : "fx:id=\"passwordtext\" was not injected: check your FXML file 'adminlogin.fxml'.";
        assert usernametext != null : "fx:id=\"usernametext\" was not injected: check your FXML file 'adminlogin.fxml'.";

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File backFile = new File("im/background.png");
        Image backImage = new Image(backFile.toURI().toString());
        backimage.setImage(backImage);

    }

    public void loginOnAction(ActionEvent e) throws SQLException {
        if (usernametext.getText().isBlank() == false && passwordtext.getText().isBlank() == false) {
            validatelogin(e);
        } else {
            diplaymessage.setText("Please enter your username and password");
        }
    }


    public void validatelogin(ActionEvent e) throws RuntimeException {

        DatabaseConnection connection = new DatabaseConnection();
        Connection connection1 = connection.getConnection();


        String verifylogin = "select count(1) from blood_guardians where username='" + usernametext.getText() + "' and password='" + passwordtext.getText() + "'";

        try {
            Statement statement = connection1.createStatement();
            ResultSet queryResult = statement.executeQuery(verifylogin);
                while (queryResult.next()) {
                    if (queryResult.getInt(1) == 1) {
                        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("4_HOME PAGE ADMIN.fxml"));
                        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
                        try {
                            scene = new Scene(fxmlLoader.load());
                        } catch (IOException event) {
                            throw new RuntimeException(String.valueOf(e));
                        }
                        stage.setScene(scene);
                        stage.show();
                        stage.setTitle("Dashboard");

                    } else {
                        diplaymessage.setText("Invalid Credentials");
                    }
                }
        }catch (Exception ep) {
            ep.printStackTrace();
        }
    }
    @FXML
    void backTohomeOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("1_startingpage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
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












//    public void registerbuttonOnAction(ActionEvent event) throws IOException {
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/demo/fxml/register.fxml"));
//            ((Node) (event.getSource())).getScene().getWindow().hide();
//            Parent root1 = fxmlLoader.load();
//            Stage stage = new Stage();
//            stage.setScene(new Scene(root1));
//            stage.show();
//        } catch (Exception ep) {
//            ep.printStackTrace();
//        }
//    }
//}


//    @FXML
//    void onLoginClick(ActionEvent event) throws IOException {
//        loginbuton.setOnAction(e -> {
//            // getting values
//            usernamec = usernametext.getText();
//            passwordc = passwordtext.getText();
//            // validation
//            if(usernamec == "" && passwordc == "") {
//                diplaymessage.setText("please enter password!");
//            } else if(usernamec == ""){
//                diplaymessage.setText("please enter username!");
//
//            } else if(passwordc == "") {
//                diplaymessage.setText("please enter password!");
//
//            } else {
//                diplaymessage.setText("");
//
//                // Check if username is in database
//                // if username is there then check for password match
//                // if password matches then allow access to dashboard
//
//                try {
//                    if(DatabaseConnection.validateuser(usernamec) == 1) {
//                        diplaymessage.setText("user not found!");
//                    } else {
//                        if(DatabaseConnection.validatePassword(usernamec, passwordc) == 1) {
//                            diplaymessage.setText("invalid username or password!");
//                        } else {
//                            System.out.println("Access Granted!");
//
//                            // loads dashboard scene
//                            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("adminlogin.fxml"));
//                            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//                            scene = new Scene(fxmlLoader.load());
//                            stage.setScene(scene);
//                            stage.show();
//                        }
//                    }
//                } catch (Exception ex) {
//                    System.out.println(ex);
//                }
//            }
//        });
//    }

//
//
//    @FXML
//    void backTohomeOnAction(ActionEvent event) {
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("1_startingpage.fxml"));
//        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        try {
//            scene = new Scene(fxmlLoader.load());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        stage.setScene(scene);
//        stage.show();
//        stage.setTitle("Home");
//    }
//}