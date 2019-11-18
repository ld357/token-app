package ui.sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import ui.CuriosityEntry;

public class Controller {
    String writtenText;
    CuriosityEntry ce;

    @FXML
    TextArea textBoxInput;

    public void submitButtonClicked() {
        System.out.println("its been clicked");
        writtenText = textBoxInput.getText();
        ce = new CuriosityEntry();
        ce.addThought(writtenText);
        System.out.println(ce.getAllThoughts());

    }

    public void doneWritingThought() {
        System.out.println("done");
    }
}
