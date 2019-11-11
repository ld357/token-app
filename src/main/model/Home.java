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


    public void addActivity(Activity a) {
        activities.add(a);
        notifyObserver(a);
    }

}
