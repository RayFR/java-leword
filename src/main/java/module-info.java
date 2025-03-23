module com.rayfrc.leword {
    requires javafx.controls;  // Required for JavaFX UI components
    requires javafx.fxml;      // Required for FXML-based UI

    opens com.rayfrc.leword to javafx.fxml;
}
