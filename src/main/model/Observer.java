package model;

import model.activities.Activity;

public interface Observer {

    // MODIFIES: Observer and User
    // EFFECTS: updates observers with added activity
    void update(Activity activity);
}
