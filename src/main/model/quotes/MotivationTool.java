package model.quotes;

import java.util.HashSet;

// quotes button is displayed when homepage is launched
// box appears with the quote
// different quote is called each time app opens... is this possible?

// Represents a series of quotes
public class MotivationTool {
    private String quote;
    private String author;
    private Boolean status;
    private HashSet<Quotes> selectiondata;
    private Quotes quoteChoice;
    private HashSet<Quotes> favouritelist;

    public MotivationTool() {
        selectiondata = new HashSet<Quotes>();
        Quotes quote1 = new Quote1();
        Quotes quote2 = new Quote2();
        Quotes quote3 = new Quote3();
        Quotes quote4 = new Quote4();
        Quotes quote5 = new Quote5();

        selectiondata.add(quote1);
        selectiondata.add(quote2);
        selectiondata.add(quote3);
        selectiondata.add(quote4);
        selectiondata.add(quote5);

        favouritelist = new HashSet<Quotes>();


    }

    // getters
    public String getQuote(Quotes quoteChoice) {
        return quote;
    }

    public String getAuthor(Authors quoteChoice) {
        return author;
    }

    public boolean getStatus(Quotes quoteChoice) {
        return status;
    }

    public  HashSet<Quotes> getFavouriteList() {
        return favouritelist;
    }



    // MODIFIES: this (  // modifies the set in which the object is called by the method)
    // EFFECTS: activity is added to the list if it's not
    // already in the list
    public void addFavourite(Quotes quoteChoice) {
        favouritelist.add(quoteChoice);
    }

    // REQUIRES: activity is an element of the list
    // MODIFIES: this
    // EFFECTS: activity is removed from the list
    public void removeFavourite(Quotes quoteChoice) {
        favouritelist.remove(quoteChoice);
    }

}
