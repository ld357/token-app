package ui.home;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        primaryStage.setTitle("Home");
        primaryStage.setScene(new Scene(root, 411, 553));
        primaryStage.show();

//        Stage thoughtStage = new Stage();
//        Parent root1 = FXMLLoader.load(getClass().getResource("thoughts.fxml"));
//        thoughtStage.setTitle("Thoughts");
//        thoughtStage.setScene(new Scene(root1, 411, 553));
//        thoughtStage.show();

    }


}
