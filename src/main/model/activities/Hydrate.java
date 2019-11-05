package model.activities;

public class Hydrate implements Activity {
    String name;
    String status;

    public Hydrate() {
        this.name = "Hydrate";
        this.status = "today";
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
}
