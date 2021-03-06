package model.quotes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuthorTest {
    Author testAuthor;
    Quote testQuote1;
    Quote testQuote2;
    Quote testQuote3;

    @BeforeEach
    void setUp() {
        testAuthor = new Author("Confucius",0);
        testQuote1 = new Quote("This is an example");
        testQuote2 = new Quote("This is another exmaple");
        testQuote3 = new Quote("");
    }

    @Test
    void testGetAndAddQuotes(){
        testAuthor.addQuote(testQuote1);
        assertEquals(true,testAuthor.getQuotes().contains(testQuote1));
        assertEquals(testAuthor, testQuote1.getAuthor());
        assertEquals("Confucius", testAuthor.getName());
    }

    @Test
    void testAddMultipleQuotes() {
        testAuthor.addQuote(testQuote1);
        testAuthor.addQuote(testQuote2);
        assertEquals(2,testAuthor.getQuotes().size());

        assertEquals(testAuthor, testQuote1.getAuthor());
    }

    @Test
    void testRemoveOneQuote() {
        testAuthor.addQuote(testQuote1);
        testAuthor.addQuote(testQuote2);
        testAuthor.removeQuote(testQuote1);

        assertEquals(1, testAuthor.getQuotes().size());
        assertEquals(null, testQuote1.getAuthor());
    }

    @Test
    void testRemoveTwoQuotes() {
        testAuthor.addQuote(testQuote1);
        testAuthor.addQuote(testQuote2);
        testAuthor.removeQuote(testQuote1);
        testAuthor.removeQuote(testQuote2);

        assertEquals(0, testAuthor.getQuotes().size());
        assertEquals(null, testQuote1.getAuthor());
        assertEquals(null, testQuote2.getAuthor());
    }

    @Test
    void testAddEmptyQuote() {
        testAuthor.addQuote(testQuote3);
        assertEquals(1, testAuthor.getQuotes().size());
    }

}