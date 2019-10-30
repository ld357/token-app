package model.activities;

import java.util.ArrayList;

public class Inspire implements Activities {
    String name;
    String status;
    ArrayList<Activities> selectiondata;
    ArrayList<Activities> homepagedata;


    public Inspire() {
        this.name = "Inspire";
        this.status = "today";
        System.out.println("Look for opportunities for growth and see where you end up!");

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
    // EFFECTS: creates new "inspire" activity, adds to list,
    // calls check-in and prints out statement

}
