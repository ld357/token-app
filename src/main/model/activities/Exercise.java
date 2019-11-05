package model.activities;

public class Exercise implements Activity {
    String name;
    String status;

    public Exercise() {
        this.name = "Exercise";
        this.status = "today";
        System.out.println("Getting exercise will help you relax and ease your mind!");

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
