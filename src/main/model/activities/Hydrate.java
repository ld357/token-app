package model.activities;

import model.activities.Activities;

import java.util.HashSet;

public class Hydrate implements Activities {
    String name;
    String status;
    HashSet<Activities> selectiondata;
    HashSet<Activities> homepagedata;
    String subject;
    String socialable;
    Boolean requiresobject;


    public Hydrate() {
        this.name = "Hydrate";
        this.status = "today";
        this.subject = "not active";
        this.socialable = "individual";
        requiresobject = false;
        System.out.println("Your body needs to be hydrated!");
    }

    // getters
    public String getActivityName() {
        return this.name;
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
    // EFFECTS: creates new "hydrate" activity, adds to list,
    // calls check-in and prints out statement

}
