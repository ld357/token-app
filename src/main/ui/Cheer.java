package ui;

import model.ActivityReminder;
import model.CuriosityBoxEntry;
import model.MoodTracker;
import model.MotivationTool;

import java.util.ArrayList;

public class Cheer {

    public Cheer() {
    }

    public static void main(String[] args) {
        new Cheer();

        ActivityReminder activity = new ActivityReminder();
        activity.hydrate();
        activity.inspire();
        activity.interact();
        activity.refresh();
        activity.revitalize();
        activity.rest();
        activity.breathe();
        activity.exercise();
        System.out.println("Which activities would you like to remove?");

        new MotivationTool();

        MoodTracker mood = new MoodTracker();
        mood.amazing();
        mood.content();
        mood.meh();
        mood.terrible();

        new CuriosityBoxEntry();




    }


}


