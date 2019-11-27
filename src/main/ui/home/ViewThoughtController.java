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

    // MODIFIES: Curiosity Entry
    // EFFECTS: adds thought to Curiosity Entry and prints statement
    public void submitButtonClicked() {
        writtenText = textBoxInput.getText();
        ce = new CuriosityEntry();
        ce.addThought(writtenText);
        System.out.println(ce.getAllThoughts());

    }


    // EFFECTS: loads add thoughts pane when button is clicked and gets its children
    public void addThoughtClicked() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("addthought.fxml"));
        rootPane.getChildren().setAll(pane);

    }


    public void removeThoughtClicked() {

    }

    // EFFECTS: loads home pane when button is clicked and gets its children
    public void homeButtonClicked() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("home.fxml"));
        rootPane.getChildren().setAll(pane);
    }

}
