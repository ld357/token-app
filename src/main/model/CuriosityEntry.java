package model;

import java.util.ArrayList;


public class CuriosityEntry {
    private String operation;
    private ArrayList<String> allthoughts;
    private ArrayList<String> removedthoughts;
    private String result;

    public CuriosityEntry() {
        operation = "";
        allthoughts = new ArrayList<>();
        result = "";

    }

    public void addThought(String thought) {
        allthoughts.add(thought);
    }

    public void removeThought(String thought) {
        allthoughts.remove(thought);
        removedthoughts.add(thought);
    }

    public ArrayList<String> getAllThoughts() {
        return allthoughts;
    }
}
