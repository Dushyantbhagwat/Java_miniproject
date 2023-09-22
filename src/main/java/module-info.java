module com.example.userproj {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.userproj to javafx.fxml;
    exports com.example.userproj;
}