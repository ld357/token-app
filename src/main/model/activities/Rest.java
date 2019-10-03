package model.activities;

import java.util.HashSet;

public class Rest implements Activities {
    String name;
    String status;
    HashSet<Activities> selectiondata;
    HashSet<Activities> homepagedata;
    String subject;
    String socialable;
    Boolean requiresobject;

    public Rest() {
        this.name = "Rest";
        this.status = "today";
        this.subject = "not active";
        this.socialable = "individual";
        this.requiresobject = false;
        System.out.println("Take a break or a nap- you'll thank yourself later!");
    }

    // getters
    public String getActivityName() {
        return name;
    }

    public String getStatus() {
        return this.status;
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
    // EFFECTS: creates new "rest" activity, adds to list,
    // calls check-in and prints out statement
}
