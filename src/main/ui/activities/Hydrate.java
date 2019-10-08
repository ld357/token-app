package ui.activities;

import ui.activities.Activities;

import java.util.ArrayList;

public class Hydrate implements Activities {
    String name;
    String status;
    ArrayList<Activities> selectiondata;
    ArrayList<Activities> homepagedata;


    public Hydrate() {
        this.name = "Hydrate";
        this.status = "today";
        System.out.println("Your body needs to be hydrated!");
    }

    // getters
    public String getActivityName() {
        return this.name;
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
    // EFFECTS: creates new "hydrate" activity, adds to list,
    // calls check-in and prints out statement

}
