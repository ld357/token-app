package model.activities;

public class Interact implements Activity {
    String name;
    String status;

    public Interact() {
        this.name = "Interact";
        this.status = "not yet completed";
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

    @Override
    public void setStatus() {
        this.status = "today";
    }
}
