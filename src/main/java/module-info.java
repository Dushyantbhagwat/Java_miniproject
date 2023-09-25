module com.example.user {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.user to javafx.fxml;
    exports com.example.user;
}