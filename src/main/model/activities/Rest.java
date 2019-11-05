package model.activities;

public class Rest implements Activity {
    String name;
    String status;

    public Rest() {
        this.name = "Rest";
        this.status = "today";
        System.out.println("Take a break or a nap- you'll thank yourself later!");

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
