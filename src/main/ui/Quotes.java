package ui;

import model.quotes.Collection;


// always going to refer to this ONE collection of quotes!!
// and you basically add quotes or remove.. maintenance is in the Collection class


public class Quotes {


    public static void main(String[] args) {
        Collection quotes = new Collection();
        quotes.displayQuotes();
        quotes.displayAuthors();

    }
}
