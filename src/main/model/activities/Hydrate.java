package model.activities;

public class Hydrate implements Activity {
    String name;
    String status;

    public Hydrate() {
        this.name = "Hydrate";
        this.status = "not yet completed";
        System.out.println("Your body needs to be hydrated!");

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
