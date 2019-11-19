package ui.moods;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.shape.Rectangle;
import model.moods.*;
import ui.CuriosityEntry;

public class Controller {

    @FXML Rectangle amazingRectangle;
    @FXML Rectangle contentRectangle;
    @FXML Rectangle mehRectangle;
    @FXML Rectangle badRectangle;
    @FXML Rectangle terribleRectangle;

    public void amazingRectangleClicked() {
        MoodTracker moods = new MoodTracker();
        Mood amazing = new Amazing();
        moods.addMood(amazing);
        System.out.println(amazing.getMoodName() + " has been selected");
    }

    public void contentRectangleClicked() {
        MoodTracker moods = new MoodTracker();
        Mood content = new Content();
        moods.addMood(content);
        System.out.println(content.getMoodName() + " has been selected");
    }

    public void mehRectangleClicked() {
        MoodTracker moods = new MoodTracker();
        Mood meh = new Meh();
        moods.addMood(meh);
        System.out.println(meh.getMoodName() + " has been selected");
    }

    public void badRectangleClicked() {
        MoodTracker moods = new MoodTracker();
        Mood bad = new Bad();
        moods.addMood(bad);
        System.out.println(bad.getMoodName() + " has been selected");
    }

    public void terribleRectangleClicked() {
        MoodTracker moods = new MoodTracker();
        Mood terrible = new Terrible();
        moods.addMood(terrible);
        System.out.println(terrible.getMoodName() + " has been selected");
    }

    public void homeButtonClicked() {

    }

}
