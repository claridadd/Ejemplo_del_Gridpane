module com.example.ejemplo_gridpane {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.ejemplo_gridpane to javafx.fxml;
    exports com.example.ejemplo_gridpane;
}