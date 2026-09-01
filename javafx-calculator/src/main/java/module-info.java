module com.example.calpro {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.calpro to javafx.fxml;
    exports com.example.calpro;
}