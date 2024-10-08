package appli.todolistfx.controllers;

import appli.todolistfx.SceneController;
import appli.todolistfx.model.User;
import appli.todolistfx.repetoire.UserRepertoire;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.SQLException;

public class InscriptionController {
    @FXML
    private TextField mail;
    @FXML
    private PasswordField motDePasse;

    @FXML
    private TextField nom;

    @FXML
    private TextField prenom;

    @FXML
    private PasswordField motDePasseConfirm;
    @FXML
    public void register(ActionEvent event) throws SQLException, IOException {
        int succes_register = UserRepertoire.register(mail.getText(),motDePasse.getText(),nom.getText(), prenom.getText(),
                motDePasseConfirm.getText());
        User user = UserRepertoire.login(mail.getText(), motDePasse.getText());
        UserRepertoire.userConnected = user;
        if (succes_register == 0)
        {
            SceneController scene = new SceneController();
            scene.switchView("inscription.fxml", event);
        }
        else if (succes_register == 1)
        {
            SceneController scene = new SceneController();
            scene.switchView("accueil.fxml", event);
        }
    }
}
