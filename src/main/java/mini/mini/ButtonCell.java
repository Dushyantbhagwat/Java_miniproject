package mini.mini;




import javafx.scene.control.Button;
import javafx.scene.control.TableCell;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ButtonCell extends TableCell<AdminPatient, Void> {
    private final Button button;

    public ButtonCell() {
        this.button = new Button("ACCEPT");

        // Define the button action here
        button.setOnAction(event -> {
            AdminPatient patient = getTableView().getItems().get(getIndex());
            // Implement your button action here, using the patient object if needed
        });
    }

    @Override
    protected void updateItem(Void item, boolean empty) {
        super.updateItem(item, empty);
        if (empty) {
            setGraphic(null);
        } else {
            setGraphic(button);
        }
    }
}



//    private final Connection connectDB; // Pass the database connection here

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
//}