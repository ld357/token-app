package model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CuriosityBox {
    private List<String> data;
    private String operation;
    private ArrayList<String> operands;
    private String result;

    // EFFECTS: set is empty
    public CuriosityBox() {
        data = new ArrayList<>();
        operation = "";
        operands = new ArrayList<>();
        result = "";

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
    private boolean contains(String s) {
        return data.contains(s);
    }


    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void addOperand(String operand) {
        operands.add(operand);
    }

    public void setResult(String result) {
        this.result = result;
    }

}
