package model;

import model.activities.Activities;
import model.quotes.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class MotivationToolTest {
    MotivationTool testMotivationTool;
    String testAuthor;
    String testQuote;
    Boolean testStatus;
    HashSet<Activities> testHomepageData;
    HashSet<Activities> testSelectionData;


    @BeforeEach
    void setUp() {
        testMotivationTool = new MotivationTool();
    }

    @Test
    void testQ1A() {
        Quotes testQ1 = new Quote1();
       // testAuthor = "William Arthur Ward";
        testStatus = false;
        testQuote = "When we seek to discover the best in others,we somehow bring out the best in ourselves";
      //  assertEquals(testAuthor, testQ1.getAuthor());
        assertEquals(testQuote, testQ1.getQuote());
        assertEquals(testStatus, testQ1.getStatus());
    }

    @Test
    void testQ1B() {
        Authors testA1 = new Author1();
        testAuthor = "William Arthur Ward";
        assertEquals(testAuthor, testA1.getAuthor());

    }



    @Test
    void testQ2A() {
        Quotes testQ2 = new Quote2();
       // testAuthor = "John Wooden";
        testStatus = false;
        testQuote = "Make each day your masterpiece";
        // assertEquals(testAuthor,testQ2.getAuthor());
        assertEquals(testQuote, testQ2.getQuote());
        assertEquals(testStatus, testQ2.getStatus());
    }

    @Test
    void testQ2B() {
        Authors testA2 = new Author2();
        testAuthor = "John Wooden";
        assertEquals(testAuthor, testA2.getAuthor());

    }


    @Test
    void testQ3A() {
        Quotes testQ3 = new Quote3();
        // testAuthor = "Unknown";
        testStatus = false;
        testQuote = "People overestimate what they can do in a single day." +
                "And underestimate what they can do in their whole lives";
        // assertEquals(testAuthor,testMotivationTool.getAuthor());
        assertEquals(testQuote, testQ3.getQuote());
        assertEquals(testStatus, testQ3.getStatus());
    }

    @Test
    void testQ3B() {
        Authors testA3 = new Author3();
        testAuthor = "Unknown";
        assertEquals(testAuthor, testA3.getAuthor());

    }

    @Test
    void testQ4A() {
      //  testAuthor = "Marcus Aurelius";
        Quotes testQ4 = new Quote4();
        testStatus = false;
        testQuote = "Dwell on the beauty of life. Watch the stars,and see yourself running with them";
      //  assertEquals(testAuthor,testMotivationTool.getAuthor());
        assertEquals(testQuote, testQ4.getQuote());
        assertEquals(testStatus, testQ4.getStatus());
    }

    @Test
    void testQ4B() {
        Authors testA4 = new Author4();
        testAuthor = "Marcus Aurelius";
        assertEquals(testAuthor, testA4.getAuthor());

    }

    @Test
    void testQ5A() {
        // testAuthor = "Scott Adams";
        Quotes testQ5 = new Quote5();
        testStatus = false;
        testQuote = "There’s no such things as a small act of kindness." +
                "Every act creates a ripple with no logical end";
       // assertEquals(testAuthor,testMotivationTool.getAuthor());
        assertEquals(testQuote, testQ5.getQuote());
        assertEquals(testStatus, testQ5.getStatus());
    }

    @Test
    void test5B() {
        Authors testA5 = new Author5();
        testAuthor = "Scott Adams";
        assertEquals(testAuthor, testA5.getAuthor());

    }


    @Test
    void testAddFavourite() {
        Quotes testQ1 = new Quote1();
        testMotivationTool.addFavourite(testQ1);
        assertEquals(1, testMotivationTool.getFavouriteList().size());
    }



    @Test
    void testRemoveFavourite() {
        Quotes testQ1 = new Quote1();
        testMotivationTool.addFavourite(testQ1);
        testMotivationTool.removeFavourite(testQ1);
        assertEquals(0, testMotivationTool.getFavouriteList().size());
    }


}