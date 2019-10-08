package ui.activities;

import java.util.ArrayList;

public class Interact implements Activities {
    String name;
    String status;
    ArrayList<Activities> selectiondata;
    ArrayList<Activities> homepagedata;


    public Interact() {
        this.name = "Interact";
        this.status = "today";
        System.out.println("Have you had a genuine conversation yet today?");

    }


    // getters
    public String getActivityName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public ArrayList<Activities> getSelectionData() {
        return selectiondata;
    }

    public ArrayList<Activities> getHomepageData() {
        return homepagedata;
    }

    @Override
    public void addActivity() {

    }

    @Override
    public void checkIn() {

    }

    // REQUIRES: method has not been called yet today
    // MODIFIES: this
    // EFFECTS: creates new "interact" activity, adds to list,
    // calls check-in and prints out statement

}
