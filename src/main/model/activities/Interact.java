package model.activities;

public class Interact implements Activity {
    String name;
    String status;

    public Interact() {
        this.name = "Interact";
        this.status = "today";
        System.out.println("Have you had a genuine conversation today?");

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
