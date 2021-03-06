package ui.home;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import ui.CuriosityEntry;

import java.io.IOException;

@SuppressWarnings("checkstyle:TypeName")
public class AdditionalThought {
    String writtenText;
    CuriosityEntry ce;

    @FXML TextArea textBoxInput;
    @FXML AnchorPane rootPane;

    // MODIFIES: CuriosityEntry
    // EFFECTS: when submit button is clicked,
    //          gets text from text box, adds thought to curiosityEntry, then prints out all thoughts
    public void submitButtonClicked() {
        writtenText = textBoxInput.getText();
        ce = new CuriosityEntry();
        ce.addThought(writtenText);
        System.out.println(ce.getAllThoughts());

    }

    // EFFECTS: loads home pane when home button is clicked and gets its children
    public void homeButtonClicked() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("home.fxml"));
        rootPane.getChildren().setAll(pane);
    }

}
