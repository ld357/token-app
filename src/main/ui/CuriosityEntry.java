package ui;

import java.util.ArrayList;


public class CuriosityEntry {
    private String operation;
    protected ArrayList<String> allthoughts;
    protected ArrayList<String> removedthoughts;
    private String result;

    public CuriosityEntry() {
        operation = "";
        allthoughts = new ArrayList<>();
        removedthoughts = new ArrayList<>();
        result = "";

    }

    public void addThought(String thought) {
        if (!allthoughts.contains(thought)) {
            allthoughts.add(thought);
        }
    }

    public void removeThought(String thought) {
        if (!allthoughts.equals(null)) {
            allthoughts.remove(thought);
            removedthoughts.add(thought);
        }
    }

    public ArrayList<String> getAllThoughts() {
        return allthoughts;
    }
}
