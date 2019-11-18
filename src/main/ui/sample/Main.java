package ui.sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

    //    URL url = Paths.get("src/sample/sample.fxml").toUri().toURL();
      //  Parent root = FXMLLoader.load(url);
        primaryStage.setTitle("Thoughts");
        primaryStage.setScene(new Scene(root, 400, 700));
        primaryStage.show();


    }
}
