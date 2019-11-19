package model.quotes;

import java.util.ArrayList;

public class Quote {
    private Author author;
    public String name;


    public Quote(String name) {
        this.name = name;
    }

    // MODIFIES: this, Author
    // EFFECTS: if author is null, set author to the author and add quote for author for this quote
    public void addAuthor(Author a) {
        if (author == null) {
            this.author = a;
            a.addQuote(this);
        }
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }


    // MODIFIES: this, Author
    // EFFECTS: if author is equal to a, then set author to null and remove this quote from author
    public void removeAuthor(Author a) {
        if (this.author == a) {
            this.author = null;
            a.removeQuote(this);
        }
    }

}

