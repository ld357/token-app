package ui.home;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import ui.CuriosityEntry;

import java.io.IOException;

public class ThoughtsController {
    String writtenText;
    CuriosityEntry ce;

    // TODO: button reactions from everything!!!

    @FXML AnchorPane rootPane;

    public void addButtonClicked() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("addthought.fxml"));
        rootPane.getChildren().setAll(pane);

    }

    public void removeButtonClicked() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("seethoughts.fxml"));
        rootPane.getChildren().setAll(pane);

    }

    public void seeThoughtsButtonClicked() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("seethoughts.fxml"));
        rootPane.getChildren().setAll(pane);

    }

    public void homeButtonClicked() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("home.fxml"));
        rootPane.getChildren().setAll(pane);

    }


}
