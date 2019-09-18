package people;

import model.ActivityReminder;
import model.GoalSetter;

public class Person {
    private String name;
    GoalSetter goalCreator;
    ActivityReminder remindAlert;
    int actnum;
    int age;


    public Person() {
        this.name = name;
        this.actnum = 0;
        this.age = 0;

    }

    public void stayHydrated() {
        setGoal();
        goalCreator.drinkWater();
    }

    public void doBetter() {
        setGoal();
        goalCreator.findMotivation();
    }

    public void findPeace() {
        setGoal();
        goalCreator.deepBreath();
    }

    private void setGoal() {
        System.out.print("I want to ....");
    }



}

