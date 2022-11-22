module com.example.casino {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.casino to javafx.fxml;
    exports com.casino;
}