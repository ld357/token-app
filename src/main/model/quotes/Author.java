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

    public void addQuote(Quote q) {
        if (!quotes.contains(q)) {
            quotes.add(q);
            q.addAuthor(this);
        }
    }

    public void removeQuote(Quote q) {
        if (quotes.contains(q)) {
            quotes.remove(q);
            q.removeAuthor(this);
        }
    }

}
