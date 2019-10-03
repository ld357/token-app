package model.activities;

import java.util.HashSet;

public class Inspire implements Activities {
    String name;
    String status;
    HashSet<Activities> selectiondata;
    HashSet<Activities> homepagedata;
    String subject;
    String socialable;
    Boolean requiresobject;


    public Inspire() {
        this.name = "Inspire";
        this.status = "today";
        this.subject = "not active";
        this.socialable = "both";
        this.requiresobject = true;
        System.out.println("Look for opportunities for growth and see where you end up!");

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
    // EFFECTS: creates new "inspire" activity, adds to list,
    // calls check-in and prints out statement

}
