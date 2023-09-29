package mini.mini;

import javafx.event.ActionEvent;
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
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class ForgotPasswordController implements Initializable {

    @FXML
    private TextField email;

    @FXML
    private Label error;

    @FXML
    private Label errorEmail;

    @FXML
    private Label errorFavAnimal;

    @FXML
    private Label errorMobNo;

    @FXML
    private Label errorPassword;

    @FXML
    private Label errorUsername;

    @FXML
    private TextField favanimal;

    @FXML
    private TextField mobno;

    @FXML
    private TextField new_password;

    @FXML
    private PasswordField new_password1;

    @FXML
    private TextField username;
    @FXML
    private Button subitid;

    @FXML
    private ImageView forimage;


    public void onSubmitButtonClick(ActionEvent event){
        System.out.println("Button clicked!");
        if (!email.getText().isBlank() && !mobno.getText().isBlank()
                 && !new_password.getText().isBlank() && !new_password1.getText().isBlank()){
            forgotPassword(event);
        }
        else {
            errorPassword.setText(null);
            new_password.setStyle(null);
            new_password1.setStyle(null);
        }
        if(email.getText().isBlank()){
            errorEmail.setText("⚠ Please enter email-id!");
            email.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
        }
        else {
            errorEmail.setText(null);
            email.setStyle(null);
        }
        if(mobno.getText().isBlank()){
            errorMobNo.setText("⚠ Please enter your mobile no!");
            mobno.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
        }
        else {
            errorMobNo.setText(null);
            mobno.setStyle(null);
        }



    }

    public void forgotPassword(ActionEvent event) {
        System.out.println(new_password1.getText());
        System.out.println(new_password.getText());
        String l = new_password.getText();
        String m = new_password1.getText();
        if (l.equals(m)){

            DatabaseConnection connection = new DatabaseConnection();
            Connection connection1 = connection.getConnection();

            System.out.println("inside if");
            String verifylogin = "select count(1) from users where  emailid  = '" + email.getText() + "' and phonenumber = '" + mobno.getText() + "'";
            Statement statement = null;
            try {
                statement = connection1.createStatement();
                ResultSet queryResult = statement.executeQuery(verifylogin);
                while(queryResult.next()){
                    System.out.println("inside while");
                    if (queryResult.getInt(1)==1) {
                        System.out.println("inside if");
                        try {
                            System.out.println("Inside try");
                            String insertUserDetails = "UPDATE `miniproject`.`users` SET `password` = '" + new_password.getText() + "' WHERE (`emailid` = '" + email.getText() + "')\n";
                            statement = connection1.createStatement();
                            int b = statement.executeUpdate(insertUserDetails);
                            if (b == 1) {
                                System.out.println("Inserted data!");
                            } else {
                                System.out.println("Failed to insert data");
                            }
                            root = FXMLLoader.load(getClass().getResource("2_coomon_login_page.fxml")); //pass scene name here
                            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            scene = new Scene(root);
                            stage.setScene(scene);
                            stage.show();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                      else {
                            error.setText("⚠ Invalid User!");

                            errorPassword.setText(null);
                            errorEmail.setText(null);
                            errorMobNo.setText(null);
                            email.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
                            email.setText("");
                            mobno.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
                            mobno.setText("");
                            new_password.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
                            new_password.setText("");
                            new_password1.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
                            new_password1.setText("");

                        }

                    }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else {
            errorPassword.setText("⚠ Both password fields should have same value");
            new_password.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
            new_password1.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
        }
    }

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToHome(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("2_coomon_login_page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Login");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File backFile75 = new File("im/password-reset-service-2023-01-04 00-00-00-2023-06-17 02-19-41.png");
        Image backImage75 = new Image(backFile75.toURI().toString());
        forimage.setImage(backImage75);
    }
}

