package model.activities;

import java.util.ArrayList;

public class Refresh implements Activities {
    String name;
    String status;
    ArrayList<Activities> selectiondata;
    ArrayList<Activities> homepagedata;

    public Refresh() {
        this.name = "Refresh";
        this.status = "today";
        System.out.println("Take a quick shower and relieve your muscles!");

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
    // EFFECTS: creates new "refresh" activity, adds to list,
    // calls check-in and prints out statement

}
