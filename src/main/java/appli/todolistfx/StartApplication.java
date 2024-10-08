package appli.todolistfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("connexion.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 700);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        System.out.println();
    }

    public static void main(String[] args) {
        launch();
    }


}