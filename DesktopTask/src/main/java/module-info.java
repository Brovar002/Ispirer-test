module by.goncharov.desktoptask {
    requires javafx.controls;
    requires javafx.fxml;


    opens by.goncharov.desktoptask to javafx.fxml;
    exports by.goncharov.desktoptask;
}