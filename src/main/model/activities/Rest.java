package model.activities;

import java.util.ArrayList;

public class Rest implements Activities {
    String name;
    String status;
    ArrayList<Activities> selectiondata;
    ArrayList<Activities> homepagedata;

    public Rest() {
        this.name = "Rest";
        this.status = "today";
        System.out.println("Take a break or a nap- you'll thank yourself later!");
    }

    // getters
    public String getActivityName() {
        return name;
    }

    public String getStatus() {
        return this.status;
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
    // EFFECTS: creates new "rest" activity, adds to list,
    // calls check-in and prints out statement
}
