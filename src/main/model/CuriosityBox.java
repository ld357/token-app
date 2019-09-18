package model;

import java.util.ArrayList;
import java.util.List;

public class CuriosityBox {
    private List<String> data;
    private String operation;
    private String result;

    // EFFECTS: set is empty
    public CuriosityBox() {
        data = new ArrayList<>();
    }

    // MODIFIES: this
    // EFFECTS: String s is added to the QuoteSet if it's not
    // already in the QuoteSet
    public void insert(String s) {
        if (!contains(s)) {
            data.add(s);
        }
    }

    // REQUIRES: String s is an element of the CuriosityBox
    // MODIFIES: this
    // EFFECTS: String s is removed from the CuriosityBox
    public void remove(String s) {
        data.remove(s);
    }

    // EFFECTS: Returns true if String s is in the QuoteSet
    // and false otherwise
    public boolean contains(String s) {
        return data.contains(s);
    }


    public static void setOperation(String operation) {
        this.operation = operation;
    }

    public static void setResult(String result) {
        this.result = result;
    }

}
