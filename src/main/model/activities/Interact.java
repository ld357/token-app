package model.activities;

import java.util.HashSet;

public class Interact implements Activities {
    String name;
    String status;
    HashSet<Activities> selectiondata;
    HashSet<Activities> homepagedata;
    String subject;
    String socialable;
    Boolean requiresobject;


    public Interact() {
        this.name = "Interact";
        this.status = "today";
        this.subject = "active";
        this.socialable = "group";
        this.requiresobject = false;
        System.out.println("Have you had a genuine conversation yet today?");

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
    // EFFECTS: creates new "interact" activity, adds to list,
    // calls check-in and prints out statement

}
