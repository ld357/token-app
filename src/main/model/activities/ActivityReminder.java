package model.activities;

import java.util.HashSet;

public class ActivityReminder {
    private String name;
    private String status;
    private HashSet<Activities> selectiondata;
    private Activities actChoice;
    private HashSet<Activities> homepagedata;

    public ActivityReminder() {
        this.name = "";
        this.status = "not yet completed";

        selectiondata = new HashSet<Activities>();
        Activities breathe = new Breathe();
        Activities exercise = new Exercise();
        Activities hydrate = new Hydrate();
        Activities inspire = new Inspire();
        Activities interact = new Interact();
        Activities refresh = new Refresh();
        Activities rest = new Rest();
        Activities revitalize = new Revitalize();

        selectiondata.add(breathe);
        selectiondata.add(exercise);
        selectiondata.add(hydrate);
        selectiondata.add(inspire);
        selectiondata.add(interact);
        selectiondata.add(refresh);
        selectiondata.add(rest);
        selectiondata.add(revitalize);



        homepagedata = new HashSet<Activities>();
        System.out.println("What would you like to remind yourself to do?");

    }

    // getters

    public Activities getActChoice(Activities actChoice) {
        return actChoice;
    }

    public HashSet<Activities> getSelectionData() {
        return selectiondata;
    }

    public  HashSet<Activities> getHomepageData() {
        return homepagedata;
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
        homepagedata.add(actChoice);
    }

    // REQUIRES: activity is an element of the list
    // MODIFIES: this
    // EFFECTS: activity is removed from the list
    public void removeActivity(Activities actChoice) {
        homepagedata.remove(actChoice);
    }


    public void saveData() {


    }


}
