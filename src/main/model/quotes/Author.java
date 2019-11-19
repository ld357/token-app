package model.quotes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Author {
    private ArrayList<Quote> quotes;
    private String name;
    private int age;

    public Author(String name, int age) {
        this.name = name;
        this.age = age;
        quotes = new ArrayList<Quote>();
    }

    public ArrayList<Quote> getQuotes() {
        return quotes;
    }

    public String getName() {
        return name;
    }

    //  MODIFIES: this, Quote
    // EFFECTS: verifies quote, if quote list doesn't contain quote then add quote and set author to this
    public void addQuote(Quote q) {
        quoteVerification(q);

        if (!quotes.contains(q)) {
            quotes.add(q);
            q.addAuthor(this);
        }
    }

    // EFFECTS: checks if quote name is empty, prints out statement if true
    private void quoteVerification(Quote q) {
        if (q.name.equals("")) {
            System.out.println("This is not a quote!");
        }
    }

    //  MODIFIES: this, Quote
    // EFFECTS: verifies quote, if quote list contains quote then remove quote and remove this author from quote
    public void removeQuote(Quote q) {
        quoteVerification(q);

        if (quotes.contains(q)) {
            quotes.remove(q);
            q.removeAuthor(this);
        }
    }

}
