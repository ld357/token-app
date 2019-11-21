package ui.home;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import ui.CuriosityEntry;

import java.io.IOException;

public class ViewThoughtController {
    String writtenText;
    CuriosityEntry ce;

    @FXML TextArea textBoxInput;
    @FXML AnchorPane rootPane;

    // TODO: Figure out how to put in remove button function too

    public void submitButtonClicked() {
        writtenText = textBoxInput.getText();
        ce = new CuriosityEntry();
        ce.addThought(writtenText);
        System.out.println(ce.getAllThoughts());

    }


    public void addThoughtClicked() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("addthought.fxml"));
        rootPane.getChildren().setAll(pane);

    }


    public void removeThoughtClicked() {

    }

    public void homeButtonClicked() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("home.fxml"));
        rootPane.getChildren().setAll(pane);
    }

}
