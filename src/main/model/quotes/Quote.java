package model.quotes;

import java.util.ArrayList;

public class Quote {
    private Author author;
    private String name;


    public Quote(String name) {
        this.name = name;
    }

    public void addAuthor(Author a) {
        if (author == null) {
            this.author = a;
            a.addQuote(this);
        }
    }

    public Author getAuthor() {
        return this.author;
    }

    public void removeAuthor(Author a) {
        if (this.author == a) {
            this.author = null;
            a.removeQuote(this);
        }
    }

}
