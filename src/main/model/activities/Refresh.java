package model.activities;

public class Refresh implements Activity {
    String name;
    String status;

    public Refresh() {
        this.name = "Refresh";
        this.status = "not yet completed";
        System.out.println("Take a quick shower and relieve your muscles!");

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
