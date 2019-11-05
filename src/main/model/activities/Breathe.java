package model.activities;

public class Breathe implements Activity {
    String name;
    String status;

    public Breathe() {
        this.name = "Breathe";
        this.status = "today";
        System.out.println("Just take a breath of fresh air, everything will be okay!");

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
