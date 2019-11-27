package ui.home;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MoodMain extends Application {

    // EFFECTS: loads fxml file and creates scene
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("moods.fxml"));
        primaryStage.setTitle("Thoughts");
        primaryStage.setScene(new Scene(root, 400, 700));
        primaryStage.show();

    }

    // EFFECTS: launches the system
    public static void main(String[] args) {
        launch(args);
    }

}
