package model;

import java.util.HashSet;

public class ActivityReminder {
    private String name;
    private String status;
    private HashSet<ActivityReminder> selectiondata;
    private ActivityReminder act;
    private HashSet<ActivityReminder> homepagedata;

    public ActivityReminder() {
        this.name = "";
        this.status = "not yet completed";
        homepagedata = new HashSet<ActivityReminder>();

    }

    // getters
    public String getActivityName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public HashSet<ActivityReminder> getSelectiondata() {
        return selectiondata;
    }

    public  HashSet<ActivityReminder> getHomepagedata() {
        return homepagedata;
    }



    // REQUIRES: method has not been called yet today
    // MODIFIES: this
    // EFFECTS: creates new "hydrate" activity, adds to list,
    // calls check-in and prints out statement
    public void hydrate() {
        ActivityReminder hydrate = new ActivityReminder();
        this.name = "Hydrate";
        addActivity(hydrate);
        checkIn(hydrate);
        System.out.println("Your body needs to be hydrated!");
    }

    // REQUIRES: method has not been called yet today
    // MODIFIES: this
    // EFFECTS: creates new "exercise" activity, adds to list,
    // calls check-in and prints out statement
    public void exercise() {
        ActivityReminder exercise = new ActivityReminder();
        this.name = "Exercise";
        addActivity(exercise);
        checkIn(exercise);
        System.out.println("Getting exercise will help you relax and ease your mind!");

    }

    // REQUIRES: method has not been called yet today
    // MODIFIES: this
    // EFFECTS: creates new "breathe" activity, adds to list,
    // calls check-in and prints out statement
    public void breathe() {
        ActivityReminder breathe = new ActivityReminder();
        this.name = "Breathe";
        addActivity(breathe);
        checkIn(breathe);
        System.out.println("Just take a breath of fresh air, everything will be okay!");

    }

    // REQUIRES: method has not been called yet today
    // MODIFIES: this
    // EFFECTS: creates new "rest" activity, adds to list,
    // calls check-in and prints out statement
    public void rest() {
        ActivityReminder rest = new ActivityReminder();
        this.name = "Rest";
        addActivity(rest);
        checkIn(rest);
        System.out.println("Take a break or a nap- you'll thank yourself later!");

    }

    // REQUIRES: method has not been called yet today
    // MODIFIES: this
    // EFFECTS: creates new "revitalize" activity, adds to list,
    // calls check-in and prints out statement
    public void revitalize() {
        ActivityReminder revitalize = new ActivityReminder();
        this.name = "Revitalize";
        addActivity(revitalize);
        checkIn(revitalize);
        System.out.println("Boost your energy with some fruits and snacks!");

    }

    // REQUIRES: method has not been called yet today
    // MODIFIES: this
    // EFFECTS: creates new "refresh" activity, adds to list,
    // calls check-in and prints out statement
    public void refresh() {
        ActivityReminder refresh = new ActivityReminder();
        this.name = "Refresh";
        addActivity(refresh);
        checkIn(refresh);
        System.out.println("Take a quick shower and relieve your muscles!");

    }

    // REQUIRES: method has not been called yet today
    // MODIFIES: this
    // EFFECTS: creates new "interact" activity, adds to list,
    // calls check-in and prints out statement
    public void interact() {
        ActivityReminder interact = new ActivityReminder();
        this.name = "Interact";
        addActivity(interact);
        checkIn(interact);
        System.out.println("Have you had a genuine conversation yet today?");

    }

    // REQUIRES: method has not been called yet today
    // MODIFIES: this
    // EFFECTS: creates new "inspire" activity, adds to list,
    // calls check-in and prints out statement
    public void inspire() {
        ActivityReminder inspire = new ActivityReminder();
        this.name = "Inspire";
        addActivity(inspire);
        checkIn(inspire);
        System.out.println("Look for opportunities for growth and see where you end up!");

    }

    // MODIFIES: this
    // EFFECTS: changes status of activity to "today"
    public void checkIn(ActivityReminder act) {
        this.status = "today";
    }

    // MODIFIES: this (  // modifies the set in which the object is called by the method)
    // EFFECTS: activity is added to the list if it's not
    // already in the list
    public void addActivity(ActivityReminder act) {
        homepagedata.add(act);
    }

    // REQUIRES: activity is an element of the list
    // MODIFIES: this
    // EFFECTS: activity is removed from the list
    public void removeActivity(ActivityReminder act) {
        homepagedata.remove(act);
    }




}
