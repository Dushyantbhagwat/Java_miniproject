module mini.mini {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;

    opens mini.mini to javafx.fxml;
    exports mini.mini;
}