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

    public void addQuote(Quote q) {
        quoteVerification(q);

        if (!quotes.contains(q)) {
            quotes.add(q);
            q.addAuthor(this);
        }
    }

    private void quoteVerification(Quote q) {
        if (q.name.equals("")) {
            System.out.println("This is not a quote!");
        }
    }

    public void removeQuote(Quote q) {
        quoteVerification(q);

        if (quotes.contains(q)) {
            quotes.remove(q);
            q.removeAuthor(this);
        }
    }

}
