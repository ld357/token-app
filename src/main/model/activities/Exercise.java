package model.activities;

public class Exercise implements Activity {
    String name;
    String status;

    public Exercise() {
        this.name = "Exercise";
        this.status = "not yet completed";
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

    @Override
    public void setStatus() {
        this.status = "today";
    }

}
