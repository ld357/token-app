package model.activities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ActivityReminder implements Activity {
    protected String name;
    protected String status;
    protected ArrayList<Activity> selectionD;
    protected Activity actChoice;
    protected ArrayList<Activity> homepageD;
    protected ArrayList<Activity> savedActivities;
    Tag tag = new Tag();
    Activity breathe;
    Activity exercise;
    Activity hydrate;
    Activity inspire;
    Activity interact;
    Activity rest;
    Activity revitalize;
    Activity refresh;


    public ActivityReminder() {
        this.name = "";
        this.status = "not yet completed";

        selectionD = new ArrayList<>();
        breathe = new Breathe();
        exercise = new Exercise();
        hydrate = new Hydrate();
        inspire = new Inspire();
        interact = new Interact();
        rest = new Rest();
        revitalize  = new Revitalize();
        refresh = new Refresh();


        selectionD.add(breathe);
        selectionD.add(exercise);
        selectionD.add(hydrate);
        selectionD.add(inspire);
        selectionD.add(interact);
        selectionD.add(rest);
        selectionD.add(revitalize);
        selectionD.add(refresh);

        homepageD = new ArrayList<Activity>();
        savedActivities = new ArrayList<Activity>();
        System.out.println("What would you like to remind yourself to do?");

    }

    // MODIFIES: this
    // EFFECTS: changes status of activity to "today"
    public void checkIn(Activity actChoice) {
        this.status = "today";
    }


    // MODIFIES: this (  // modifies the set in which the object is called by the method)
    // EFFECTS: activity is added to the list if it's not
    // already in the list
    public void addActivity(Activity actChoice) throws FileNotFoundException, UnsupportedEncodingException {
        if (!homepageD.contains(actChoice)) {
            homepageD.add(actChoice);
            actChoice.setStatus();
            saveActivity(homepageD);
        }
    }

    public void addSavedActivity(Activity act) {
        if (!savedActivities.contains(act)) {
            savedActivities.add(actChoice);

        }
    }


    // REQUIRES: activity is an element of the list
    // MODIFIES: this
    // EFFECTS: activity is removed from the list
    public void removeActivity(Activity actChoice) {
        if (homepageD.contains(actChoice)) {
            homepageD.remove(actChoice);
        }
    }

    public void provideTags(Category category) {
        tag.provideTags(category);
    }

    public void addCategory(Category category) {
        tag.addCategory(category);
    }

    public void addTag(Category c, String label) {
        tag.addTag(c, label);
    }


    @Override
    public String getActivityName() {
        return this.name;
    }

    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public void setStatus() {
        for (Activity activity: selectionD) {
            activity.setStatus();
        }

    }



    public void saveActivity(ArrayList<Activity> act) throws FileNotFoundException, UnsupportedEncodingException {
        List<String> lines = new ArrayList<>();
        PrintWriter writer = new PrintWriter("saveInput.txt","UTF-8");
        for (Activity a: homepageD) {
            lines.add(a.getClass().toString().substring(23));
        }

        for (String line : lines) {
            writer.println(line);
        }
        writer.close();
    }

    public void loadActivities() throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("saveInput.txt"));

        for (String line : lines) {
            if (line.equals("Breathe")) { // repeating because adding to homepage data twice...
                addSavedActivity(breathe);
            } else if (line.equals("Exercise")) {
                addSavedActivity(exercise);
            } else if (line.equals("Hydrate")) {
                addSavedActivity(hydrate);
            } else if (line.equals("Inspire")) {
                addSavedActivity(inspire);
            } else if (line.equals("Interact")) {
                addSavedActivity(interact);
            } else if (line.equals("Refresh")) {
                addSavedActivity(refresh);
            }
            checkRestOrRevitalize(line);

        }

    }

    private void checkRestOrRevitalize(String line) throws FileNotFoundException, UnsupportedEncodingException {
        if (line.equals("Rest")) {
            addSavedActivity(rest);
        } else if (line.equals("Revitalize")) {
            addSavedActivity(revitalize);
        }
    }




}
