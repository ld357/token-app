package model.activities;

import java.util.ArrayList;

public class Breathe implements Activities {
    String name;
    String status;
    ArrayList<Activities> selectiondata;
    ArrayList<Activities> homepagedata;


    public Breathe() {
        this.name = "Breathe";
        this.status = "today";
        System.out.println("Just take a breath of fresh air, everything will be okay!");

    }

    @Override
    public void addActivity() {

    }

    @Override
    public void checkIn() {

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


    // REQUIRES: method has not been called yet today
    // MODIFIES: this
    // EFFECTS: creates new "breathe" activity, adds to list,
    // calls check-in and prints out statement
}
