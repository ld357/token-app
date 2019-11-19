package model;

import model.activities.Activity;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    // EFFECTS: prints out statement declaring that a new acitivty was added to lsit
    @Override
    public void update(Activity activity) {
        System.out.println("You have added " + activity.getActivityName() + " to your list");

    }
}
