package model;

import java.util.ArrayList;


public class CuriosityBoxEntry {
    private String operation;
    private ArrayList<String> allthoughts;
    private String result;

    public CuriosityBoxEntry() {
        operation = "";
        allthoughts = new ArrayList<>();
        result = "";

    }

    public void addThought(String thought) {
        allthoughts.add(thought);
    }



}
