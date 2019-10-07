package model.activities;

import model.activities.Activities;

import java.util.HashSet;

public class Breathe implements Activities {
    String name;
    String status;
    HashSet<Activities> selectiondata;
    HashSet<Activities> homepagedata;


    public Breathe() {
        this.name = "Breathe";
        this.status = "today";
        System.out.println("Just take a breath of fresh air, everything will be okay!");

    }

    // getters
    public String getActivityName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public HashSet<Activities> getSelectionData() {
        return selectiondata;
    }

    public  HashSet<Activities> getHomepageData() {
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
    // EFFECTS: creates new "breathe" activity, adds to list,
    // calls check-in and prints out statement
}
