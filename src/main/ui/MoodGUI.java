package ui;

import model.moods.MoodTracker;
import model.moods.Moods;
import model.exceptions.MoodWasNotAdded;
import model.exceptions.NoMoodChoiceSelected;

public class MoodGUI {
    // private static final String STATUS_OK = "System OK";
    // private JLabel statusLabel;


    public void setMood(MoodTracker mt, Moods moodChoice) {
        try {
            mt.changeMood(moodChoice);
            // drawMood();
            // statusLabel.setText(STATUS_OK);
        } catch (NoMoodChoiceSelected noMoodChoiceSelected) {
            // statusLabel.setText("System error: can't change to " + e.getMessage());
        } finally {
            // drawMood();
            System.out.println("That is your mood!");
        }

    }

    public void removeMood(MoodTracker mt, Moods moodChoice) {
        try {
            mt.removeMood(moodChoice);
            // drawMood();
            // statusLabel.setText(STATUS_OK);
        } catch (MoodWasNotAdded moodWasNotAdded) {
            // statusLabel.setText("System error: can't remove " + e.getMessage());
        } finally {
            // drawMood();
            System.out.println("That is your mood!!");
        }
    }



}
