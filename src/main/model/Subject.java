package model;

import model.activities.Activity;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    // MODIFIES: this
    // EFFECTS: if observer is not in observers list, then add observer to list
    public void addObserver(Observer o) {
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    // MODIFIES: this
    // EFFECTS: if observer is in list, then remove observer from list
    public void removeObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }


    // EFFECTS: calls update method on all observers in observers list
    public void notifyObserver(Activity activity) {
        for (Observer o: observers) {
            o.update(activity);
        }
    }

}
