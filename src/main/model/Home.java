package model;

import model.activities.Activity;

import java.util.ArrayList;
import java.util.List;

public class Home extends Subject {
    protected List<Activity> activities;
    private String name;

    public Home(String name) {
        this.name = name;
        activities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    // MODIFIES: this
    // EFFECTS: adds activity to activities and calls notifies observer that activity has been added
    public void addActivity(Activity a) {
        activities.add(a);
        notifyObserver(a);
    }

}
