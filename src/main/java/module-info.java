module com.example.casino {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.casino to javafx.fxml;
    exports com.casino;
    exports com.controllers;
    opens com.controllers to javafx.fxml;
}