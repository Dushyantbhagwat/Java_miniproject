package mini.mini;


import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import javax.swing.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



// Value injected by FXMLLoader

public class ButtonCell extends TableCell<AdminPatient, Void> {
    private static TableColumn<AdminPatient, String> tablecolumnname1;
    private JColorChooser tableview;

    public Button getAcceptButton() {
        return acceptButton;
    }

    public Button getRejectButton() {
        return rejectButton;
    }

    private final Button acceptButton;
    private final Button rejectButton;


    public ButtonCell() {


        this.acceptButton = new Button("ACCEPT");
        this.rejectButton = new Button("REJECT");

//        // Initially, disable the buttons
//        acceptButton.setDisable(true);
//        rejectButton.setDisable(true);

        acceptButton.setOnAction(event -> handleButtonAction("YES", acceptButton, rejectButton));
        rejectButton.setOnAction(event -> handleButtonAction("NO", rejectButton, acceptButton));
    }






    @Override
    protected void updateItem(Void item, boolean empty) {
        super.updateItem(item, empty);
        if (empty) {
            setGraphic(null);
        } else {
            AdminPatient patient = getTableView().getItems().get(getIndex());
            if (isReportOpened(patient)) {
                setGraphic(new Label("Report opened")); // Display a label indicating the report is opened
            } else {
                HBox buttonBox = new HBox(acceptButton, rejectButton);
                buttonBox.setSpacing(5);
                setGraphic(buttonBox);
            }
        }
    }





    private void handleButtonAction (String action, Button clickedButton, Button otherButton){


            AdminPatient patient = getTableView().getItems().get(getIndex());
            if (isReportOpened(patient)) {
                showAlert("Report is opened", "Action is not allowed when the report is opened.");
            } else if (showConfirmationDialog(action)) {
                updateDatabase(patient.getId(), action);
                clickedButton.setDisable(true);
                otherButton.setDisable(true);
            }
        }

        private boolean isReportOpened (AdminPatient patient){
            // Add your logic here to check if the report is opened for the patient
            // Return true if the report is opened, false if not
            return patient.isReportOpened();
        }

        private void showAlert (String title, String content){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle(title);
            alert.setHeaderText(null);
            alert.setContentText(content);
            alert.showAndWait();
        }

        private boolean showConfirmationDialog (String action){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Dialog");
            alert.setHeaderText("Confirm Action");
            alert.setContentText("Are you sure you want to " + action + " this patient's report?");

            if (alert.showAndWait().get() == ButtonType.OK) {
                return true; // User confirmed the action
            }
            return false; // User canceled the action
        }




        private void updateDatabase ( int uniqueIdentifier, String action){
            try {
                // Initialize your database connection here (e.g., JDBC connection)
                String url = "jdbc:mysql://localhost:3306/mini_project";
                String username = "root";
                String password = "haunting363@";
                Connection connection = DriverManager.getConnection(url, username, password);

                // Prepare an SQL update statement
                String updateQuery = "UPDATE patient_table SET action = ? WHERE patient_id = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

                // Set the values for the SQL statement
                preparedStatement.setString(1, action); // Set the action to "YES" or "NO"
                preparedStatement.setInt(2, uniqueIdentifier);

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


}











