package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotivationToolTest {
    MotivationTool testMotivationTool;
    String testAuthor;
    String testQuote;
    Boolean testStatus;

    @BeforeEach
    void setUp() {
        testMotivationTool = new MotivationTool();
    }

    @Test
    void testQ1() {
        testAuthor = "William Arthur Ward";
        testStatus = false;
        testQuote = "When we seek to discover the best in others,we somehow bring out the best in ourselves";
        testMotivationTool.q1();
        assertEquals(testAuthor, testMotivationTool.getAuthor());
        assertEquals(testQuote, testMotivationTool.getQuote());
        assertEquals(testStatus, testMotivationTool.getStatus());
    }



    @Test
    void testQ2() {
        testAuthor = "John Wooden";
        testStatus = false;
        testQuote = "Make each day your masterpiece";
        testMotivationTool.q2();
        assertEquals(testAuthor,testMotivationTool.getAuthor());
        assertEquals(testQuote, testMotivationTool.getQuote());
        assertEquals(testStatus, testMotivationTool.getStatus());
    }

    @Test
    void testQ3() {
        testAuthor = "Unknown";
        testStatus = false;
        testQuote = "People overestimate what they can do in a single day.And underestimate what they can do in their whole lives";
        testMotivationTool.q3();
        assertEquals(testAuthor,testMotivationTool.getAuthor());
        assertEquals(testQuote, testMotivationTool.getQuote());
        assertEquals(testStatus, testMotivationTool.getStatus());
    }

    @Test
    void testQ4() {
        testAuthor = "Marcus Aurelius";
        testStatus = false;
        testQuote = "Dwell on the beauty of life. Watch the stars,and see yourself running with them";
        testMotivationTool.q4();
        assertEquals(testAuthor,testMotivationTool.getAuthor());
        assertEquals(testQuote, testMotivationTool.getQuote());
        assertEquals(testStatus, testMotivationTool.getStatus());
    }

    @Test
    void testQ5() {
        testAuthor = "Scott Adams";
        testStatus = false;
        testQuote = "There’s no such things as a small act of kindness." +
                "Every act creates a ripple with no logical end";
        testMotivationTool.q5();
        assertEquals(testAuthor,testMotivationTool.getAuthor());
        assertEquals(testQuote, testMotivationTool.getQuote());
        assertEquals(testStatus, testMotivationTool.getStatus());
    }



    @Test
    void testSetFavourite() {
        testStatus = true;
        MotivationTool testq1 = new MotivationTool();
        testMotivationTool.setFavourite(testq1);
        assertEquals(testStatus, testMotivationTool.getStatus());
    }


}