module mini.mini {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens mini.mini to javafx.fxml;
    exports mini.mini;
}