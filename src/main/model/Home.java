package model;

import model.activities.ActivityReminder;
import model.CuriosityEntry;
import model.moods.MoodTracker;
import model.quotes.MotivationTool;
import model.activities.Activities;
import ui.SaveAndLoad.*;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;

public class Home {

    public Home() throws IOException, ClassNotFoundException {

        ArrayList<Activities> aa = ui.SaveAndLoad.loadFile();

        MoodTracker mt = new MoodTracker();

        ActivityReminder ar = new ActivityReminder();

        MotivationTool mtool = new MotivationTool();

        CuriosityEntry ce = new CuriosityEntry();

    }
}
