package ui;

import model.MoodTracker;
import model.Moods;
import model.exceptions.NoMoodChoiceSelected;

public class MoodGUI {


    public void setMood(MoodTracker mt, Moods moodChoice) {
        try {
            mt.changeMood(moodChoice);
            // drawMood();
        } catch (NoMoodChoiceSelected noMoodChoiceSelected) {
            // statusLabel.setText("System error: can't change to " + e.getMessage());
        }
    }



}
