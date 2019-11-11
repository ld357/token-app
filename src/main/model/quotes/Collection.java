package model.quotes;

import java.util.ArrayList;

public class Collection {
    ArrayList<Quote> quotes;
    ArrayList<Author> authors;

    public Collection() {

        quotes = new ArrayList<>();
        authors = new ArrayList<>();

        Author author1 = new Author("Andrew Carnegie",0);
        authors.add(author1);
        Quote quote1 = new Quote("If you want to be happy, set a goal that commands your thoughts, "
                + "liberates your energy, and inspires your hopes.");
        quote1.addAuthor(author1);
        quotes.add(quote1);


        Author author2 = new Author("Confucius",0);
        authors.add(author2);
        Quote quote2 = new Quote("The more one meditates upon good thoughts, the better will be one's"
                + " world and the world at large.");
        quotes.add(quote2);

        Quote quote3 = new Quote("It does not matter how slowly you go so long as you do not stop.");
        quotes.add(quote3);
        author2.addQuote(quote2);
        author2.addQuote(quote3);


    }

    public ArrayList<String> displayQuotes() {
        ArrayList<String> names;
        names = new ArrayList<>();
        for (Quote q: quotes) {
            names.add(q.getName());
        }
        return names;
    }

    public ArrayList<String> displayAuthors() {
        ArrayList<String> authorNames;
        authorNames = new ArrayList<String>();
        for (Author a: authors) {
            authorNames.add(a.getName());
        }
        return authorNames;
    }

}
