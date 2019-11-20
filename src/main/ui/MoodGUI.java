package ui;

import model.moods.MoodTracker;
import model.moods.Mood;
import model.exceptions.MoodWasNotAdded;
import model.exceptions.NoMoodChoiceSelected;

public class MoodGUI {
    // private static final String STATUS_OK = "System OK";
    // private JLabel statusLabel;


    // EFFECTS: tries to set mood, then catches noMoodChoiceSelection if thrown, prints out "This is your mood"
    public void setMood(MoodTracker mt, Mood moodChoice) {
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

    // EFFECTS: tries to remove mood, catches moodWasNotAddedException if thrown, prints "This is your mood!"
    public void removeMood(MoodTracker mt, Mood moodChoice) {
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

    public static void main(String[] args) {
        MoodTracker moods = new MoodTracker();
    }

}
