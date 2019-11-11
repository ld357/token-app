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


    @Override
    public void update(Activity activity) {
        System.out.println("You have added " + activity.getActivityName() + " to your list");

    }
}
