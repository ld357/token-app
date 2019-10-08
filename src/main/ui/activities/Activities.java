package ui.activities;


import java.io.Serializable;

public interface Activities extends Serializable {

    void addActivity();

    void checkIn();

    String getActivityName();

    String getStatus();



}
