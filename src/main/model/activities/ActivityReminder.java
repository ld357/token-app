package model.activities;

import java.io.EOFException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class ActivityReminder implements Serializable {
    private String name;
    private String status;
    private ArrayList<Activities> selectiond;
    private Activities actChoice;
    private ArrayList<Activities> homepaged;
    private static final long serialVersionUID = 1L;


    public ActivityReminder() {
        this.name = "";
        this.status = "not yet completed";

        selectiond = new ArrayList<Activities>();
        Activities breathe = new Breathe();
        Activities exercise = new Exercise();
        Activities hydrate = new Hydrate();
        Activities inspire = new Inspire();
        Activities interact = new Interact();
        Activities refresh = new Refresh();
        Activities rest = new Rest();
        Activities revitalize = new Revitalize();


        selectiond.add(breathe);
        selectiond.add(exercise);
        selectiond.add(hydrate);
        selectiond.add(inspire);
        selectiond.add(interact);
        selectiond.add(refresh);
        selectiond.add(rest);
        selectiond.add(revitalize);


        homepaged = new ArrayList<Activities>();
        System.out.println("What would you like to remind yourself to do?");



    }

    // getters

    public Activities getActChoice(Activities actChoice) {
        return actChoice;
    }

    public ArrayList<Activities> getSelectionData() {
        return selectiond;
    }

    public ArrayList<Activities> getHomepageData() {
        return homepaged;
    }


    // MODIFIES: this
    // EFFECTS: changes status of activity to "today"
    public void checkIn(Activities actChoice) {
        this.status = "today";
    }

    // MODIFIES: this (  // modifies the set in which the object is called by the method)
    // EFFECTS: activity is added to the list if it's not
    // already in the list
    public void addActivity(Activities actChoice) throws IOException, EOFException {
        homepaged.add(actChoice);
        ui.SaveAndLoad.saveFile(homepaged);

    }

    // REQUIRES: activity is an element of the list
    // MODIFIES: this
    // EFFECTS: activity is removed from the list
    public void removeActivity(Activities actChoice) {
        homepaged.remove(actChoice);
    }



}
