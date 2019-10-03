package model.activities;

import java.util.HashSet;

public class Refresh implements Activities {
    String name;
    String status;
    HashSet<Activities> selectiondata;
    HashSet<Activities> homepagedata;
    String subject;
    String socialable;
    Boolean requiresobject;

    public Refresh() {
        this.name = "Refresh";
        this.status = "today";
        this.subject = "active";
        this.socialable = "individual";
        this.requiresobject = false;
        System.out.println("Take a quick shower and relieve your muscles!");

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
    // EFFECTS: creates new "refresh" activity, adds to list,
    // calls check-in and prints out statement

}
