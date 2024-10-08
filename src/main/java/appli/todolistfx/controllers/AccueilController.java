package appli.todolistfx.controllers;

import appli.todolistfx.model.User;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class AccueilController implements Initializable {
    private static User token;

    @FXML
    private Label label;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
    }

}
