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
import org.mindrot.jbcrypt.BCrypt;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class ForgotPasswordController implements Initializable {

    @FXML // fx:id="background"
    private ImageView background; // Value injected by FXMLLoader

    @FXML // fx:id="forimage"
    private ImageView forimage; // Value injected by FXMLLoader
    @FXML
    private TextField email;

    @FXML
    private Label error;

    @FXML
    private Label errorEmail;


    @FXML
    private Label errorMobNo;

    @FXML
    private Label errorPassword;

    @FXML
    private TextField mobno;

    @FXML
    private TextField new_password;

    @FXML
    private PasswordField new_password1;

    private Stage stage;
    private Scene scene;
    private Parent root;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File backFile75 = new File("im/password-reset-service-2023-01-04 00-00-00-2023-06-17 02-19-41.png");
        Image backImage75 = new Image(backFile75.toURI().toString());
        forimage.setImage(backImage75);

        File backFile10 = new File("im/background.png");
        Image backImage10 = new Image(backFile10.toURI().toString());
        background.setImage(backImage10);


    }


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
        String newPassword = new_password.getText();
        String confirmPassword = new_password1.getText();

        if (newPassword.equals(confirmPassword)) {
            String emailText = email.getText();
            String mobNoText = mobno.getText();

            DatabaseConnection connection = new DatabaseConnection();
            Connection connection1 = connection.getConnection();

            String verifyLogin = "SELECT user_id FROM users WHERE email_id = ? AND phone_number = ?";
            try {
                PreparedStatement preparedStatement = connection1.prepareStatement(verifyLogin);
                preparedStatement.setString(1, emailText);
                preparedStatement.setString(2, mobNoText);

                ResultSet queryResult = preparedStatement.executeQuery();

                if (queryResult.next()) {
                    // Valid user, so update the password
                    String hashedPassword = BCrypt.hashpw(newPassword, BCrypt.gensalt()); // Hash the new password

                    String updatePasswordQuery = "UPDATE users SET password = ? WHERE email_id = ?";
                    PreparedStatement updateStatement = connection1.prepareStatement(updatePasswordQuery);
                    updateStatement.setString(1, hashedPassword);
                    updateStatement.setString(2, emailText);

                    int rowsUpdated = updateStatement.executeUpdate();

                    if (rowsUpdated == 1) {
                        // Password updated successfully
                        root = FXMLLoader.load(getClass().getResource("2_coomon_login_page.fxml"));
                        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    } else {
                        // Failed to update password
                        System.out.println("Failed to update password");
                    }
                } else {
                    // Invalid user
                    // Handle invalid user here (e.g., show an error message)
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
            } catch (SQLException | IOException e) {
                e.printStackTrace();
            }
        } else {
            errorPassword.setText("⚠ Both password fields should have the same value");
            new_password.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
            new_password1.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
        }
    }

//    public void forgotPassword(ActionEvent event) {
//        System.out.println(new_password1.getText());
//        System.out.println(new_password.getText());
//        String l = new_password.getText();
//        String m = new_password1.getText();
//        if (l.equals(m)){
//
//            DatabaseConnection connection = new DatabaseConnection();
//            Connection connection1 = connection.getConnection();
//
//            System.out.println("inside if");
//            String verifylogin = "select count(1) from users where  email_id  = '" + email.getText() + "' and phone_number = '" + mobno.getText() + "'";
//            Statement statement = null;
//            try {
//                statement = connection1.createStatement();
//                ResultSet queryResult = statement.executeQuery(verifylogin);
//                while(queryResult.next()){
//                    System.out.println("inside while");
//                    if (queryResult.getInt(1)==1) {
//                        System.out.println("inside if");
//                        try {
//                            System.out.println("Inside try");
//                            String insertUserDetails = "UPDATE `mini_project`.`users` SET `password` = '" + new_password.getText() + "' WHERE (`email_id` = '" + email.getText() + "')\n";
//                            statement = connection1.createStatement();
//                            int b = statement.executeUpdate(insertUserDetails);
//                            if (b == 1) {
//                                System.out.println("Inserted data!");
//                            } else {
//                                System.out.println("Failed to insert data");
//                            }
//                            root = FXMLLoader.load(getClass().getResource("2_coomon_login_page.fxml")); //pass scene name here
//                            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//                            scene = new Scene(root);
//                            stage.setScene(scene);
//                            stage.show();
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }
//                    }
//
//                      else {
//                            error.setText("⚠ Invalid User!");
//
//                            errorPassword.setText(null);
//                            errorEmail.setText(null);
//                            errorMobNo.setText(null);
//                            email.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
//                            email.setText("");
//                            mobno.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
//                            mobno.setText("");
//                            new_password.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
//                            new_password.setText("");
//                            new_password1.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
//                            new_password1.setText("");
//
//                        }
//
//                    }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        else {
//            errorPassword.setText("⚠ Both password fields should have same value");
//            new_password.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
//            new_password1.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
//        }
//    }


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


}

