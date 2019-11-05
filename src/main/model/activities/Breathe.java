package model.activities;

import java.util.ArrayList;

public class Breathe implements Activities {
    String name;
    String status;
    ArrayList<Activities> selectiondata;
    ArrayList<Activities> homepagedata;

    public Breathe() {
        this.name = "Breathe";
        this.status = "today";
        System.out.println("Just take a breath of fresh air, everything will be okay!");

    }


    public ArrayList<Activities> getSelectionData() {
        return selectiondata;
    }

    public ArrayList<Activities> getHomepageData() {
        return homepagedata;
    }

    @Override
    public void addActivity() {

    }

    @Override
    public void checkIn() {

    }

    @Override
    public String getActivityName() {
        return name;
    }

    @Override
    public String getStatus() {
        return status;
    }
}
