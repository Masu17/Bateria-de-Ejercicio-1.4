module com.example.bateriaejercicioscuatro {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires java.desktop;


    opens com.example.bateriaejercicioscuatro to javafx.fxml;
    exports com.example.bateriaejercicioscuatro;
    exports com.example.bateriaejercicioscuatro.controllers;
    opens com.example.bateriaejercicioscuatro.controllers to javafx.fxml;
}