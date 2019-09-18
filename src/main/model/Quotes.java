package model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// Represents a set of strings
public class Quotes {
    private List<String> data;

    // EFFECTS: set is empty
    public Quotes() {
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

    // REQUIRES: String s is an element of the QuoteSet
    // MODIFIES: this
    // EFFECTS: String s is removed from the QuoteSet
    public void remove(String s) {
        data.remove(s);
    }

    // EFFECTS: Returns true if String s is in the QuoteSet
    // and false otherwise
    public boolean contains(String s) {
        return data.contains(s);
    }

    // EFFECTS: Returns the number of items in the set
    public int size() {
        return data.size();
    }





}
