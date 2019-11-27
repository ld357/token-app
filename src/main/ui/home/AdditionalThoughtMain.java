package ui.home;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdditionalThoughtMain extends Application {

    // EFFECTS: launches the system
    public static void main(String[] args) {
        launch(args);
    }

    // EFFECTS: loads fxml file and creates scene
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("addthought.fxml"));

        primaryStage.setTitle("Thoughts");
        primaryStage.setScene(new Scene(root, 400, 700));
        primaryStage.show();


    }
}
