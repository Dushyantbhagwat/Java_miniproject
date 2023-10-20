/**
 * Sample Skeleton for '4_HOME PAGE ADMIN.fxml' Controller Class
 */

package mini.mini;

import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.Node;
import javafx.util.StringConverter;

import java.sql.*;

public class BloodGuardiansController implements Initializable {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Abga"
    private Label Abga; // Value injected by FXMLLoader

    @FXML // fx:id="Abgm"
    private Label Abgm; // Value injected by FXMLLoader

    @FXML // fx:id="AnchorPane"
    private AnchorPane AnchorPane; // Value injected by FXMLLoader

    @FXML // fx:id="aapprovedrequest"
    private Label aapprovedrequest; // Value injected by FXMLLoader

    @FXML // fx:id="abbga"
    private Label abbga; // Value injected by FXMLLoader

    @FXML // fx:id="abbgm"
    private Label abbgm; // Value injected by FXMLLoader

    @FXML // fx:id="addbuttton"
    private Button addbuttton; // Value injected by FXMLLoader

    @FXML // fx:id="addstocktectlabel"
    private Label addstocktectlabel; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpaneA"
    private AnchorPane anchorpaneA; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpanesplit"
    private AnchorPane anchorpanesplit; // Value injected by FXMLLoader

    @FXML // fx:id="apprivedrequest1"
    private ImageView apprivedrequest1; // Value injected by FXMLLoader

    @FXML // fx:id="bbga"
    private Label bbga; // Value injected by FXMLLoader

    @FXML // fx:id="bbgm"
    private Label bbgm; // Value injected by FXMLLoader

    @FXML // fx:id="blodrop1"
    private ImageView blodrop1; // Value injected by FXMLLoader

    @FXML // fx:id="blodrop2"
    private ImageView blodrop2; // Value injected by FXMLLoader

    @FXML // fx:id="blodrop3"
    private ImageView blodrop3; // Value injected by FXMLLoader

    @FXML // fx:id="blodrop4"
    private ImageView blodrop4; // Value injected by FXMLLoader

    @FXML // fx:id="blodrop5"
    private ImageView blodrop5; // Value injected by FXMLLoader

    @FXML // fx:id="blodrop6"
    private ImageView blodrop6; // Value injected by FXMLLoader

    @FXML // fx:id="blodrop7"
    private ImageView blodrop7; // Value injected by FXMLLoader

    @FXML // fx:id="blodrop8"
    private ImageView blodrop8; // Value injected by FXMLLoader

    @FXML // fx:id="bloodgroup"
    private ChoiceBox<String> bloodgroup; // Value injected by FXMLLoader

    @FXML // fx:id="buttondonor"
    private Button buttondonor; // Value injected by FXMLLoader

    @FXML // fx:id="buttonhome"
    private Button buttonhome; // Value injected by FXMLLoader

    @FXML // fx:id="buttonlogout"
    private Button buttonlogout; // Value injected by FXMLLoader

    @FXML // fx:id="buttonpatient"
    private Button buttonpatient; // Value injected by FXMLLoader

    @FXML // fx:id="iamgebloodrequest1"
    private ImageView iamgebloodrequest1; // Value injected by FXMLLoader

    @FXML // fx:id="iamgehome"
    private ImageView iamgehome; // Value injected by FXMLLoader

    @FXML // fx:id="iamgepatient"
    private ImageView iamgepatient; // Value injected by FXMLLoader

    @FXML // fx:id="imagedonor"
    private ImageView imagedonor; // Value injected by FXMLLoader

    @FXML // fx:id="imagedonor1"
    private ImageView imagedonor1; // Value injected by FXMLLoader

    @FXML // fx:id="label0"
    private Label label0; // Value injected by FXMLLoader

    @FXML // fx:id="label1"
    private Label label1; // Value injected by FXMLLoader

    @FXML // fx:id="label100"
    private Label label100; // Value injected by FXMLLoader

    @FXML // fx:id="label2"
    private Label label2; // Value injected by FXMLLoader

    @FXML // fx:id="label25"
    private Label label25; // Value injected by FXMLLoader

    @FXML // fx:id="label38"
    private Label label38; // Value injected by FXMLLoader

    @FXML // fx:id="label5"
    private Label label5; // Value injected by FXMLLoader

    @FXML // fx:id="label7"
    private Label label7; // Value injected by FXMLLoader

    @FXML // fx:id="label75"
    private Label label75; // Value injected by FXMLLoader

    @FXML // fx:id="label78"
    private Label label78; // Value injected by FXMLLoader

    @FXML // fx:id="label87"
    private Label label87; // Value injected by FXMLLoader

    @FXML // fx:id="label99"
    private Label label99; // Value injected by FXMLLoader

    @FXML // fx:id="labelBG"
    private Label labelBG; // Value injected by FXMLLoader

    @FXML // fx:id="obga"
    private Label obga; // Value injected by FXMLLoader

    @FXML // fx:id="obgm"
    private Label obgm; // Value injected by FXMLLoader

    @FXML // fx:id="qunatitytext"
    private TextField qunatitytext; // Value injected by FXMLLoader

    @FXML // fx:id="splitpaneA"
    private SplitPane splitpaneA; // Value injected by FXMLLoader

    @FXML // fx:id="totaldonors"
    private Label totaldonors; // Value injected by FXMLLoader

    @FXML // fx:id="totalrequest"
    private Label totalrequest; // Value injected by FXMLLoader

    @FXML // fx:id="totalunit"
    private Label totalunit; // Value injected by FXMLLoader

    @FXML // fx:id="totalunit1"
    private ImageView totalunit1; // Value injected by FXMLLoader

    @FXML // fx:id="buttonpatient1"
    private Button buttonpatient1; // Value injected by FXMLLoader

    private Stage stage;
    private Scene scene;



    @FXML
        // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert Abga != null : "fx:id=\"Abga\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert Abgm != null : "fx:id=\"Abgm\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert AnchorPane != null : "fx:id=\"AnchorPane\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert aapprovedrequest != null : "fx:id=\"aapprovedrequest\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert abbga != null : "fx:id=\"abbga\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert abbgm != null : "fx:id=\"abbgm\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert addbuttton != null : "fx:id=\"addbuttton\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert addstocktectlabel != null : "fx:id=\"addstocktectlabel\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert anchorpaneA != null : "fx:id=\"anchorpaneA\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert anchorpanesplit != null : "fx:id=\"anchorpanesplit\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert apprivedrequest1 != null : "fx:id=\"apprivedrequest1\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert bbga != null : "fx:id=\"bbga\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert bbgm != null : "fx:id=\"bbgm\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert blodrop1 != null : "fx:id=\"blodrop1\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert blodrop2 != null : "fx:id=\"blodrop2\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert blodrop3 != null : "fx:id=\"blodrop3\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert blodrop4 != null : "fx:id=\"blodrop4\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert blodrop5 != null : "fx:id=\"blodrop5\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert blodrop6 != null : "fx:id=\"blodrop6\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert blodrop7 != null : "fx:id=\"blodrop7\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert blodrop8 != null : "fx:id=\"blodrop8\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert bloodgroup != null : "fx:id=\"bloodgroup\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert buttondonor != null : "fx:id=\"buttondonor\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert buttonhome != null : "fx:id=\"buttonhome\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert buttonlogout != null : "fx:id=\"buttonlogout\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert buttonpatient != null : "fx:id=\"buttonpatient\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert iamgebloodrequest1 != null : "fx:id=\"iamgebloodrequest1\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert iamgehome != null : "fx:id=\"iamgehome\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert iamgepatient != null : "fx:id=\"iamgepatient\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert imagedonor != null : "fx:id=\"imagedonor\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert imagedonor1 != null : "fx:id=\"imagedonor1\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert label0 != null : "fx:id=\"label0\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert label1 != null : "fx:id=\"label1\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert label100 != null : "fx:id=\"label100\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert label2 != null : "fx:id=\"label2\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert label25 != null : "fx:id=\"label25\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert label38 != null : "fx:id=\"label38\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert label5 != null : "fx:id=\"label5\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert label7 != null : "fx:id=\"label7\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert label75 != null : "fx:id=\"label75\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert label78 != null : "fx:id=\"label78\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert label87 != null : "fx:id=\"label87\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert label99 != null : "fx:id=\"label99\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert labelBG != null : "fx:id=\"labelBG\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert obga != null : "fx:id=\"obga\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert obgm != null : "fx:id=\"obgm\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert qunatitytext != null : "fx:id=\"qunatitytext\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert splitpaneA != null : "fx:id=\"splitpaneA\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert totaldonors != null : "fx:id=\"totaldonors\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert totalrequest != null : "fx:id=\"totalrequest\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert totalunit != null : "fx:id=\"totalunit\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";
        assert totalunit1 != null : "fx:id=\"totalunit1\" was not injected: check your FXML file '4_HOME PAGE ADMIN.fxml'.";

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        File backFile1 = new File("im/WhatsApp Image 2023-09-02 at 22.25.59.jpg");
        Image backImage1 = new Image(backFile1.toURI().toString());
        iamgehome.setImage(backImage1);

        File backFile2 = new File("im/WhatsApp Image 2023-09-02 at 22.25.5.jpg");
        Image backImage2 = new Image(backFile2.toURI().toString());
        imagedonor.setImage(backImage2);

        File backFile3 = new File("im/WhatsApp Image 2023-09-02 at 22.25.56.jpg");
        Image backImage3 = new Image(backFile3.toURI().toString());
        iamgepatient.setImage(backImage3);

        File backFile5 = new File("im/WhatsApp Image 2023-09-02 at 22.26.00.jpg");
        Image backImage5 = new Image(backFile5.toURI().toString());
        blodrop1.setImage(backImage5);

        File backFile6 = new File("im/WhatsApp Image 2023-09-02 at 22.26.00.jpg");
        Image backImage6 = new Image(backFile6.toURI().toString());
        blodrop5.setImage(backImage6);

        File backFile7 = new File("im/WhatsApp Image 2023-09-02 at 22.26.00.jpg");
        Image backImage7 = new Image(backFile7.toURI().toString());
        blodrop7.setImage(backImage7);

        File backFile8 = new File("im/WhatsApp Image 2023-09-02 at 22.26.00.jpg");
        Image backImage8 = new Image(backFile8.toURI().toString());
        blodrop2.setImage(backImage8);

        File backFile9 = new File("im/WhatsApp Image 2023-09-02 at 22.26.00.jpg");
        Image backImage9 = new Image(backFile9.toURI().toString());
        blodrop3.setImage(backImage9);

        File backFile10 = new File("im/WhatsApp Image 2023-09-02 at 22.26.00.jpg");
        Image backImage10 = new Image(backFile10.toURI().toString());
        blodrop4.setImage(backImage10);

        File backFile11 = new File("im/WhatsApp Image 2023-09-02 at 22.26.00.jpg");
        Image backImage11 = new Image(backFile11.toURI().toString());
        blodrop6.setImage(backImage11);

        File backFile12 = new File("im/WhatsApp Image 2023-09-02 at 22.26.00.jpg");
        Image backImage12 = new Image(backFile12.toURI().toString());
        blodrop8.setImage(backImage12);

        File backFile13 = new File("im/WhatsApp Image 2023-09-02 at 22.25.5.jpg");
        Image backImage13 = new Image(backFile13.toURI().toString());
        imagedonor1.setImage(backImage13);

        File backFile14 = new File("im/WhatsApp Image 2023-09-02 at 22.25..jpg");
        Image backImage14 = new Image(backFile14.toURI().toString());
        iamgebloodrequest1.setImage(backImage14);

        File backFile15 = new File("im/WhatsApp Image 2023-09-02 at 22.25.57.jpg");
        Image backImage15 = new Image(backFile15.toURI().toString());
        apprivedrequest1.setImage(backImage15);

        File backFile16 = new File("im/WhatsApp Image 2023-09-02 .jpg");
        Image backImage16 = new Image(backFile16.toURI().toString());
        totalunit1.setImage(backImage16);

        bloodgroup.getItems().addAll("A+", "B+", "O+", "AB+", "A-", "B-", "O-", "AB-");
        bloodgroup.setConverter(new StringConverter<String>() {
            @Override
            public String toString(String s) {
                return (s == null) ? "select blood group" : s;
            }

            @Override
            public String fromString(String s) {
                return null;
            }

        });


        int tr1 = updateLabelsFromDatabase("A+");
        label75.setText(String.valueOf(tr1));

        int tr2 = updateLabelsFromDatabase("B+");
        label0.setText(String.valueOf(tr2));

        int tr3 = updateLabelsFromDatabase("O+");
        label5.setText(String.valueOf(tr3));

        int tr4 = updateLabelsFromDatabase("AB+");
        label7.setText(String.valueOf(tr4));

        int tr5 = updateLabelsFromDatabase("A-");
        label78.setText(String.valueOf(tr5));

        int tr6 = updateLabelsFromDatabase("B-");
        label87.setText(String.valueOf(tr6));

        int tr7 = updateLabelsFromDatabase("O-");
        label2.setText(String.valueOf(tr7));

        int tr8 = updateLabelsFromDatabase("AB-");
        label1.setText(String.valueOf(tr8));


        int tr9 = TotalDatabase();
        label100.setText(String.valueOf(tr9));


        int rowCount1 = countRowsInDatabase1();
        label25.setText( "" + rowCount1);

        int rowCount2 = countRowsInDatabase2();
        label99.setText( "" + rowCount2);


    }
    private int updateLabelsFromDatabase(String bloodGroup) {
        // Replace with your database connection details
        String url = "jdbc:mysql://localhost:3306/mini_project";
        String username = "root";
        String password = "haunting363@";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT SUM(quantity) FROM blood_quantities WHERE blood_group = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // Set the parameter for the WHERE clause
            preparedStatement.setString(1, bloodGroup);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private int TotalDatabase() {
        // Replace with your database connection details
        String url = "jdbc:mysql://localhost:3306/mini_project";
        String username = "root";
        String password = "haunting363@";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT SUM(quantity) FROM blood_quantities";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getInt(1); // Get the count from the first column
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0; // Return 0 if there's an error
    }



    private int countRowsInDatabase1() {
        // Replace with your database connection details
        String url = "jdbc:mysql://localhost:3306/mini_project";
        String username = "root";
        String password = "haunting363@";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT COUNT(donor_id) FROM donor";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getInt(1); // Get the count from the first column
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0; // Return 0 if there's an error
    }


    private int countRowsInDatabase2() {
        // Replace with your database connection details
        String url = "jdbc:mysql://localhost:3306/mini_project";
        String username = "root";
        String password = "haunting363@";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT COUNT(patient_id) FROM patient_table";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getInt(1); // Get the count from the first column
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0; // Return 0 if there's an error
    }



    @FXML
    void addButtonOnAction(ActionEvent event) {
        try {
            // Get the selected item from the choice box
            String selectedOption = bloodgroup.getValue();

            if (selectedOption != null) {
                int increaseAmount = Integer.parseInt(qunatitytext.getText());

                // Update the quantity in the database for the selected blood group
                updateQuantityInDatabase(selectedOption, increaseAmount);

                // Update the UI labels and clear input fields
                updateUI(selectedOption, increaseAmount);

                bloodgroup.getSelectionModel().clearSelection();
                qunatitytext.clear();
            } else {
                System.out.println("Please select an option from the ChoiceBox.");
            }
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input");
        }
    }

    void updateQuantityInDatabase(String bloodGroup, int increaseAmount) {
        try {
            // Initialize your database connection here
            String url = "jdbc:mysql://localhost:3306/mini_project";
            String username = "root";
            String password = "haunting363@";
            Connection connection = DriverManager.getConnection(url, username, password);

            connection.setAutoCommit(true);

            // Prepare the SQL update statement
            String updateQuery = "UPDATE blood_quantities SET quantity = quantity + ? WHERE blood_group = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

            // Set the values for the SQL statement
            preparedStatement.setInt(1, increaseAmount);
            preparedStatement.setString(2, bloodGroup);

            // Execute the update statement
            int rowsUpdated = preparedStatement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Database updated successfully.");
            } else {
                System.out.println("No records were updated.");
            }

            // Close the resources (statement and connection)
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error updating the database.");
        }
    }



void updateUI(String selectedOption, int increaseAmount) {
    int currentTotal = Integer.parseInt(label100.getText());
    int updatedTotal = currentTotal + increaseAmount;

    // Check if any of the labels have a value of zero
    if (Integer.parseInt(label75.getText()) == 0 ||
            Integer.parseInt(label0.getText()) == 0 ||
            Integer.parseInt(label5.getText()) == 0 ||
            Integer.parseInt(label7.getText()) == 0 ||
            Integer.parseInt(label78.getText()) == 0 ||
            Integer.parseInt(label87.getText()) == 0 ||
            Integer.parseInt(label2.getText()) == 0 ||
            Integer.parseInt(label1.getText()) == 0) {
    }

    // Check if the updated total becomes negative
    if (updatedTotal < 0) {
        System.out.println("Invalid input: Total quantity can't be negative.");
        return; // Don't update the labels or total
    }

    // Now, update the corresponding UI labels
    switch (selectedOption) {
        case "A+":
            label75.setText(String.valueOf(Integer.parseInt(label75.getText()) + increaseAmount));
            break;
        case "B+":
            label0.setText(String.valueOf(Integer.parseInt(label0.getText()) + increaseAmount));
            break;
        case "O+":
            label5.setText(String.valueOf(Integer.parseInt(label5.getText()) + increaseAmount));
            break;
        case "AB+":
            label7.setText(String.valueOf(Integer.parseInt(label7.getText()) + increaseAmount));
            break;
        case "A-":
            label78.setText(String.valueOf(Integer.parseInt(label78.getText()) + increaseAmount));
            break;
        case "B-":
            label87.setText(String.valueOf(Integer.parseInt(label87.getText()) + increaseAmount));
            break;
        case "O-":
            label2.setText(String.valueOf(Integer.parseInt(label2.getText()) + increaseAmount));
            break;
        case "AB-":
            label1.setText(String.valueOf(Integer.parseInt(label1.getText()) + increaseAmount));
            break;
    }

    // Update the total label
    label100.setText(String.valueOf(updatedTotal));
}


    @FXML
    void DonorButtonOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("5_donor details.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        try {
            scene = new Scene(fxmlLoader.load());
            // Load the CSS for the new scene
            String cssPath = getClass().getResource("style.css").toExternalForm();
            scene.getStylesheets().add(cssPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Donor");
    }

    @FXML
    void LogoutButtonOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("2_coomon_login_page.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Logout");
    }

    @FXML
    void PatientButtonOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("6_patientdetails.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        try {
            scene = new Scene(fxmlLoader.load());
            // Load the CSS for the new scene
            String cssPath = getClass().getResource("style.css").toExternalForm();
            scene.getStylesheets().add(cssPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Patient");
    }

    @FXML
    void RequestHistoryButtonOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("7_bloodrequest.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        try {
            scene = new Scene(fxmlLoader.load());
            // Load the CSS for the new scene
            String cssPath = getClass().getResource("style.css").toExternalForm();
            scene.getStylesheets().add(cssPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Request History");
    }

}





