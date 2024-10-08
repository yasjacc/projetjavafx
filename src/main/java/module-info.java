module appli.todolistfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    //requires eu.hansolo.tilesfx;
    requires java.sql;
    requires jbcrypt;


    opens appli.todolistfx to javafx.fxml;
    exports appli.todolistfx;
    exports appli.todolistfx.controllers;
    opens appli.todolistfx.controllers to javafx.fxml;

    opens appli.todolistfx.model to javafx.base;
    exports appli.todolistfx.repetoire;
    opens appli.todolistfx.repetoire to javafx.fxml; // Ajoute cette ligne
}