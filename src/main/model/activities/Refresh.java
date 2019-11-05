package model.activities;

public class Refresh implements Activity {
    String name;
    String status;

    public Refresh() {
        this.name = "Refresh";
        this.status = "today";
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
}
