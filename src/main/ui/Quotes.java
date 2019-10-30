package ui;

import model.quotes.Author;
import model.quotes.Quote;

public class Quotes {

    public static void main(String[] args) {
        // passed away already = age is 0

        Author author1 = new Author("Andrew Carnegie",0);
        Quote quote1 = new Quote("“If you want to be happy, set a goal that commands your thoughts, "
                + "liberates your energy, and inspires your hopes.");
        quote1.addAuthor(author1);


        Author author2 = new Author("Confucius",0);
        Quote quote2 = new Quote("The more one meditates upon good thoughts, the better will be one's"
                + "world and the world at large.");
        Quote quote3 = new Quote("It does not matter how slowly you go so long as you do not stop.");
        author2.addQuote(quote2);
        author2.addQuote(quote3);

        System.out.println(author2.getQuotes().size());
        author2.removeQuote(quote3);
        System.out.println(quote3.getAuthor());
        System.out.println(author2.getQuotes().size());
        System.out.println(author1.getQuotes().size());

        quote1.removeAuthor(author1);
        System.out.println(quote1.getAuthor());

    }
}
