package mini.mini;


import javafx.scene.control.*;
import javafx.scene.layout.HBox;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Optional;


public class ButtonCell extends TableCell<AdminPatient, Void> {
    private final Button acceptButton;
    private final Button rejectButton;

    public ButtonCell() {
        this.acceptButton = new Button("ACCEPT");
        this.rejectButton = new Button("REJECT");

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

    private void handleButtonAction(String action, Button clickedButton, Button otherButton) {
        AdminPatient patient = getTableView().getItems().get(getIndex());
        if (isReportOpened(patient)) {
            showAlert("Report is opened", "Action is not allowed when the report is opened.");
        } else if (showConfirmationDialog(action)) {
            updateDatabase(patient.getId(), action);
            clickedButton.setDisable(true);
            otherButton.setDisable(true);
        }
    }

    private boolean isReportOpened(AdminPatient patient) {
        // Add your logic here to check if the report is opened for the patient
        // Return true if the report is opened, false if not
        return patient.isReportOpened();
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    private boolean showConfirmationDialog(String action) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Dialog");
        alert.setHeaderText("Confirm Action");
        alert.setContentText("Are you sure you want to " + action + " this patient's report?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            return true; // User confirmed the action
        }
        return false; // User canceled the action
    }























//public class ButtonCell extends TableCell<AdminPatient, Void> {
//    private final Button acceptButton;
//    private final Button rejectButton;
//
//    public ButtonCell() {
//        this.acceptButton = new Button("ACCEPT");
//        this.rejectButton = new Button("REJECT");
//
//        acceptButton.setOnAction(event -> handleButtonAction("YES"));
//        rejectButton.setOnAction(event -> handleButtonAction("NO"));
//    }
//
//    private boolean isReportOpened(AdminPatient patient) {
//        return patient.isReportOpened();
//    }
//
//
//
//
//    @Override
//    protected void updateItem(Void item, boolean empty) {
//        super.updateItem(item, empty);
//        if (empty) {
//            setGraphic(null);
//        } else {
//            HBox buttonBox = new HBox(acceptButton, rejectButton);
//            buttonBox.setSpacing(5);
//            setGraphic(buttonBox);
//
//            if (isDisabled()) {
//                // Disable both buttons if the cell is disabled
//                acceptButton.setDisable(true);
//                rejectButton.setDisable(true);
//            } else {
//                // Enable both buttons by default
//                acceptButton.setDisable(false);
//                rejectButton.setDisable(false);
//            }
//        }
//    }
//    private void handleButtonAction(String action) {
//        AdminPatient patient = getTableView().getItems().get(getIndex());
//        int uniqueIdentifier = patient.getId();
//
//        if (showConfirmationDialog(action)) {
//            updateDatabase(uniqueIdentifier, action);
//            setGraphic(null); // Disable the entire cell
//        }
//    }

    private void updateDatabase(int uniqueIdentifier, String action) {
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


//    private boolean showConfirmationDialog(String action) {
//        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//        alert.setTitle("Confirmation");
//        alert.setHeaderText("Confirm Action");
//        alert.setContentText("Are you sure you want to perform this action?\nThis action cannot be undone.");
//
//        ButtonType yesButton = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
//        ButtonType noButton = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);
//
//        alert.getButtonTypes().setAll(yesButton, noButton);
//
//        Optional<ButtonType> result = alert.showAndWait();
//        return ((Optional<?>) result).isPresent() && result.get() == yesButton;
//    }
}













//public class ButtonCell extends TableCell<AdminPatient, Void> {
//    private final Button button;
//
//    public ButtonCell() {
//        this.button = new Button("ACCEPT");
//
//        // Define the button action here
//        button.setOnAction(event -> {
//            AdminPatient patient = getTableView().getItems().get(getIndex());
//            // Implement your button action here, using the patient object if needed
//        });
//    }
//
//    @Override
//    protected void updateItem(Void item, boolean empty) {
//        super.updateItem(item, empty);
//        if (empty) {
//            setGraphic(null);
//        } else {
//            setGraphic(button);
//        }
//    }

//public class ButtonCell extends TableCell<AdminPatient, Void> {
//    private final Button button;
//    private final Button button1;
//
//    public ButtonCell() {
//        this.button = new Button("ACCEPT");
//        this.button1 = new Button("REJECT");
////        button.setOnAction(event -> {
////            AdminPatient patient = getTableView().getItems().get(getIndex());
////            // Get the unique identifier from the patient object (e.g., patient.getId())
////            int uniqueIdentifier = patient.getId();
////
////            // Call a method to update the database with the unique identifier
////            updateDatabase(uniqueIdentifier);
////
////            // You can also update the UI as needed
////            // ...
////        });
////        button1.setOnAction(event -> {
////            AdminPatient patient = getTableView().getItems().get(getIndex());
////            // Get the unique identifier from the patient object (e.g., patient.getId())
////            int uniqueIdentifier = patient.getId();
////
////            // Call a method to update the database with the unique identifier
////            updateDatabase(uniqueIdentifier);
////
////            // You can also update the UI as needed
////            // ...
////        });
//
//    }
//
//
////    @Override
////    protected void updateItem(Void item, boolean empty) {
////        super.updateItem(item, empty);
////        if (empty) {
////            setGraphic(null);
////        } else {
////            setGraphic(button);
////        }
////    }
//
//    @Override
//    protected void updateItem(Void item, boolean empty) {
//        super.updateItem(item, empty);
//        if (empty) {
//            setGraphic(null);
//        } else {
//            HBox buttonBox = new HBox(button, button1);
//            buttonBox.setSpacing(5); // Adjust the spacing between buttons
//            setGraphic(buttonBox);
//        }
//    }
//
//    private void updateDatabase(int uniqueIdentifier) {
//        try {
//            // Initialize your database connection here (e.g., JDBC connection)
//            String url = "jdbc:mysql://localhost:3306/mini_project";
//            String username = "root";
//            String password = "haunting363@";
//            Connection connection = DriverManager.getConnection(url, username, password);
//
//            // Prepare an SQL update statement
//            String updateQuery = "UPDATE patient_table SET action = ? WHERE user_id = ?";
//            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
//
//            // Set the values for the SQL statement
//            preparedStatement.setString(1, "Yes"); // Set the action to "Yes"
//            preparedStatement.setInt(2, uniqueIdentifier); // Set the ID to update
//
//            // Execute the update statement
//            int rowsUpdated = preparedStatement.executeUpdate();
//
//            if (rowsUpdated > 0) {
//                System.out.println("Database updated successfully.");
//            } else {
//                System.out.println("No records were updated.");
//            }
//
//            // Close the resources (statement and connection)
//            preparedStatement.close();
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.err.println("Error updating the database.");
//        }
//    }
//}
////    private final Connection connectDB; // Pass the database connection here
//
//    public ButtonCell(Connection connectDB) {
//        this.button = new Button("Click Me");
//        this.connectDB = connectDB;
//
//        // Define the button action here
//        button.setOnAction(event -> {
//            AdminPatient patient = getTableView().getItems().get(getIndex());
//            // Implement your button action here, using the patient object if needed
//
//            // Update the database with the action
//            updateDatabaseAction(patient.getId()); // Replace getId() with the appropriate method to get the patient ID
//        });
//    }
//
//    private void updateDatabaseAction(int patientId) {
//        // Update the 'action' column in the 'users' table with the action
//        String updateQuery = "UPDATE users SET action = ? WHERE id = ?";
//        try (PreparedStatement preparedStatement = connectDB.prepareStatement(updateQuery)) {
//            preparedStatement.setString(1, "Click Me Button Clicked"); // Change this to your desired action description
//            preparedStatement.setInt(2, patientId);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    protected void updateItem(Void item, boolean empty) {
//        super.updateItem(item, empty);
//        if (empty) {
//            setGraphic(null);
//        } else {
//            setGraphic(button);
//        }
//    }
