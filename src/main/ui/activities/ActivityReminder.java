package ui.activities;

import java.io.Serializable;
import java.util.ArrayList;

public class ActivityReminder implements Serializable {
    private String name;
    private String status;
    private ArrayList<Activities> selectionD;
    private Activities actChoice;
    private ArrayList<Activities> homepageD;


    public ActivityReminder() {
        this.name = "";
        this.status = "not yet completed";

        selectionD = new ArrayList<>();
        Activities breathe = new Breathe();
        Activities exercise = new Exercise();
        Activities hydrate = new Hydrate();
        Activities inspire = new Inspire();
        Activities interact = new Interact();
        Activities refresh = new Refresh();
        Activities rest = new Rest();
        Activities revitalize = new Revitalize();


        selectionD.add(breathe);
        selectionD.add(exercise);
        selectionD.add(hydrate);
        selectionD.add(inspire);
        selectionD.add(interact);
        selectionD.add(refresh);
        selectionD.add(rest);
        selectionD.add(revitalize);


        homepageD = new ArrayList<Activities>();
        System.out.println("What would you like to remind yourself to do?");



    }

    // getters

    public Activities getActChoice(Activities actChoice) {
        return actChoice;
    }

    public ArrayList<Activities> getSelectionData() {
        return selectionD;
    }

    public ArrayList<Activities> getHomepageData() {
        return homepageD;
    }


    // MODIFIES: this
    // EFFECTS: changes status of activity to "today"
    public void checkIn(Activities actChoice) {
        this.status = "today";
    }

    // MODIFIES: this (  // modifies the set in which the object is called by the method)
    // EFFECTS: activity is added to the list if it's not
    // already in the list
    public void addActivity(Activities actChoice) {
        homepageD.add(actChoice);

    }

    // REQUIRES: activity is an element of the list
    // MODIFIES: this
    // EFFECTS: activity is removed from the list
    public void removeActivity(Activities actChoice) {
        homepageD.remove(actChoice);
    }



}
