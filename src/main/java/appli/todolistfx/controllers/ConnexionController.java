package appli.todolistfx.controllers;

import appli.todolistfx.SceneController;
import appli.todolistfx.model.User;
import appli.todolistfx.repetoire.UserRepertoire;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.SQLException;

public class ConnexionController {
    @FXML
    private TextField mail;
    @FXML
    private TextField motDePasse;



    @FXML
    public void login(ActionEvent event) throws SQLException, IOException{
        User user = UserRepertoire.login(mail.getText(), motDePasse.getText());
        if(user != null){
            UserRepertoire.userConnected = user;
            SceneController scene = new SceneController();
            scene.switchView("accueil.fxml", event);
        }
    }

    @FXML
    public void RegisterButtonAction(ActionEvent event) throws IOException{
        SceneController scence = new SceneController();
        scence.switchView("inscription.fxml", event);
    }

    @FXML
    public void MotDePasseOublie(){
        System.out.println("Votre mot de passe est oubliée");

    }



}