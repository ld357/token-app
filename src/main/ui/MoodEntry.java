package ui;

import java.util.ArrayList;


public class MoodEntry {
    private String operation;
    private ArrayList<String> allmoods;
    private ArrayList<String> removedmoods;
    private String result;

    public MoodEntry() {
        operation = "";
        allmoods = new ArrayList<>();
        result = "";

    }

    public void addThought(String thought) {
        allmoods.add(thought);
    }

    public void removeThought(String thought) {
        allmoods.remove(thought);
        removedmoods.add(thought);
    }

    public ArrayList<String> getAllThoughts() {
        return allmoods;
    }
}

