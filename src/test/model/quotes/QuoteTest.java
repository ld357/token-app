package model.quotes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuoteTest {
    Author testAuthor;
    Quote testQuote1;
    Quote testQuote2;

    @BeforeEach
    void setUp() {
        testAuthor = new Author("Confucius", 0);
        testQuote1 = new Quote("This is an example");
        testQuote2 = new Quote("This is another example");
    }

    @Test
    void testingName() {
        assertEquals("This is another example", testQuote2.getName());
        assertEquals("This is an example", testQuote1.getName());

    }

    @Test
    void testAddAuthor() {
        testQuote1.addAuthor(testAuthor);
        assertEquals(true, testQuote1.getAuthor().getQuotes().contains(testQuote1));
    }

    @Test
    void testRemoveAuthor() {
        testQuote1.addAuthor(testAuthor);
        testQuote1.removeAuthor(testAuthor);

        assertEquals(null, testQuote1.getAuthor());

    }

    @Test
    void sameAuthorTwice() {
        testQuote1.addAuthor(testAuthor);
        testQuote2.addAuthor(testAuthor);

        assertEquals(true, testQuote1.getAuthor().getQuotes().contains(testQuote1));
        assertEquals(true, testQuote2.getAuthor().getQuotes().contains(testQuote2));

    }


}