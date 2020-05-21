module layouts {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.weymanator.layouts to javafx.fxml;
    exports com.weymanator.layouts;
}