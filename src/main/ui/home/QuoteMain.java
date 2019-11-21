package ui.home;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class QuoteMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("quotes.fxml"));

        primaryStage.setTitle("Thoughts");
        primaryStage.setScene(new Scene(root, 410, 550));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
