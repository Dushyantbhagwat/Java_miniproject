package mini.mini;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;
public class AdminPatient {


    String name;
    String dob;

    String bloodgroup;
    String phone_number;

    String email_id;

    String address;

    byte[] report;

//    private String options;

    public AdminPatient(String name, String dob, String bloodgroup, String phone_number, String email_id, String address, byte[] report) {
        this.name = name;
        this.dob = dob;
        this.bloodgroup = bloodgroup;
        this.phone_number = phone_number;
        this.email_id = email_id;
        this.address = address;
        this.report = report;
//        this.options = options;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getReport() {
        return report;
    }

    public void setReport(byte[] report) {
        this.report = report;
    }


//    public static class Options {
//        private Button editButton;
//        private Button deleteButton;
//
//        public Options() {
//            editButton = new Button("Edit");
//            deleteButton = new Button("Delete");
//
//            // Add action handlers for the buttons here
//            editButton.setOnAction(event -> handleEdit());
//            deleteButton.setOnAction(event -> handleDelete());
//        }
//
//        // Define actions for the Edit and Delete buttons
//        private void handleEdit() {
//            // Implement the edit logic here
//        }
//
//        private void handleDelete() {
//            // Implement the delete logic here
//        }
//
//        // Create a TableCell for the Options column
//        public static class TableCellFactory implements Callback<TableColumn<AdminPatient, Options>, TableCell<AdminPatient, Options>> {
//            @Override
//            public TableCell<AdminPatient, Options> call(TableColumn<AdminPatient, Options> param) {
//                return new TableCell<AdminPatient, Options>() {
//                    @Override
//                    protected void updateItem(Options item, boolean empty) {
//                        super.updateItem(item, empty);
//                        if (empty || item == null) {
//                            setGraphic(null);
//                        } else {
//                            setGraphic(item.getEditButton());
//                        }
//                    }
//                };
//            }
//        }
//
//        public Button getEditButton() {
//            return editButton;
//        }
//
//        public Button getDeleteButton() {
//            return deleteButton;
//        }
//    }
}



