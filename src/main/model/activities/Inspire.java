package model.activities;

public class Inspire implements Activity {
    String name;
    String status;

    public Inspire() {
        this.name = "Inspire";
        this.status = "today";
        System.out.println("Look for opportunities for growth and see where you end up!");

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
