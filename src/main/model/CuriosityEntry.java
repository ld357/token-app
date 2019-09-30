package model;

import java.util.ArrayList;


public class CuriosityEntry {
    private String operation;
    private ArrayList<String> allthoughts;
    private String result;

    public CuriosityEntry() {
        operation = "";
        allthoughts = new ArrayList<>();
        result = "";

    }

    public void addThought(String thought) {
        allthoughts.add(thought);
    }



}
