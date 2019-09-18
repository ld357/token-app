package model;

public class GoalSetter {
    public GoalSetter() {

    }

    public void drinkWater() {
        System.out.println("Drink more water!");
        getBottle();
        drinkWater();
    }

    public void getBottle() {
        System.out.println("Get your water bottle");
    }

    public void deepBreath() {
        System.out.println("Just relax, take a deep breath");
    }

    public void findMotivation() {
        System.out.println("What gives you energy?");
    }

    public void printGoals(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println("This is goal number" + (i));
        }
    }



}
