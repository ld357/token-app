package ui.activities;

import ui.activities.Activities;

import java.util.ArrayList;

public class Exercise implements Activities {
    String name;
    String status;
    String subject;
    ArrayList<Activities> selectiondata;
    ArrayList<Activities> homepagedata;


    public Exercise() {
        this.name = "Exercise";
        this.status = "today";
        this.subject = "active";
        System.out.println("Getting exercise will help you relax and ease your mind!");

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
    // EFFECTS: creates new "exercise" activity, adds to list,
    // calls check-in and prints out statement

}
