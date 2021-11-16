package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage stage) {
        try {
            Parent par = FXMLLoader.load(getClass().getResource("/main/resources/mainwin.fxml"));
            Scene scene = new Scene(par);
            scene.getStylesheets().add(getClass().getResource("mainwin.css").toExternalForm());
            stage.setScene(scene);
            stage.setTitle("Abdulaiz's Text Editor");
            stage.setResizable(true);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
