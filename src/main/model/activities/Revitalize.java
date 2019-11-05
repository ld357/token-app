package model.activities;

public class Revitalize implements Activity {
    String name;
    String status;

    public Revitalize() {
        this.name = "Revitalize";
        this.status = "today";
        System.out.println("Boost your energy with some fruits and snacks!");

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
