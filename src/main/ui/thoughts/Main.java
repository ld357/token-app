package ui.thoughts;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("thoughts.fxml"));

        //    URL url = Paths.get("src/sample/sample.fxml").toUri().toURL();
        //  Parent root = FXMLLoader.load(url);
        primaryStage.setTitle("Thoughts");
        primaryStage.setScene(new Scene(root, 400, 700));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
