//package ui.quotes;
//
//import ui.activities.Activities;
//import ui.quotes.*;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.HashSet;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class MotivationToolTest {
//    MotivationTool testMotivationTool;
//    String testAuthor;
//    String testQuote;
//    Boolean testStatus;
//    HashSet<Activities> testHomepageData;
//    HashSet<Activities> testSelectionData;
//
//
//    @BeforeEach
//    void setUp() {
//        testMotivationTool = new MotivationTool();
//    }
//
//    @Test
//    void testQ1A() {
//        Quotes testQ1 = new Quote1();
//        testStatus = false;
//        testQuote = "When we seek to discover the best in others,we somehow bring out the best in ourselves";
//        Assertions.assertEquals(testQuote, testQ1.getQuote());
//        Assertions.assertEquals(testStatus, testQ1.getStatus());
//    }
//
//    @Test
//    void testQ1B() {
//        Authors testA1 = new Author1();
//        testAuthor = "William Arthur Ward";
//        Assertions.assertEquals(testAuthor, testA1.getAuthor());
//
//    }
//
//
//
//    @Test
//    void testQ2A() {
//        Quotes testQ2 = new Quote2();
//        testStatus = false;
//        testQuote = "Make each day your masterpiece";
//        Assertions.assertEquals(testQuote, testQ2.getQuote());
//        Assertions.assertEquals(testStatus, testQ2.getStatus());
//    }
//
//    @Test
//    void testQ2B() {
//        Authors testA2 = new Author2();
//        testAuthor = "John Wooden";
//        Assertions.assertEquals(testAuthor, testA2.getAuthor());
//
//    }
//
//
//    @Test
//    void testQ3A() {
//        Quotes testQ3 = new Quote3();
//        testStatus = false;
//        testQuote = "People overestimate what they can do in a single day." +
//                "And underestimate what they can do in their whole lives";
//        Assertions.assertEquals(testQuote, testQ3.getQuote());
//        Assertions.assertEquals(testStatus, testQ3.getStatus());
//    }
//
//    @Test
//    void testQ3B() {
//        Authors testA3 = new Author3();
//        testAuthor = "Unknown";
//        Assertions.assertEquals(testAuthor, testA3.getAuthor());
//
//    }
//
//    @Test
//    void testQ4A() {
//        Quotes testQ4 = new Quote4();
//        testStatus = false;
//        testQuote = "Dwell on the beauty of life. Watch the stars,and see yourself running with them";
//        Assertions.assertEquals(testQuote, testQ4.getQuote());
//        Assertions.assertEquals(testStatus, testQ4.getStatus());
//    }
//
//    @Test
//    void testQ4B() {
//        Authors testA4 = new Author4();
//        testAuthor = "Marcus Aurelius";
//        Assertions.assertEquals(testAuthor, testA4.getAuthor());
//
//    }
//
//    @Test
//    void testQ5A() {
//        Quotes testQ5 = new Quote5();
//        testStatus = false;
//        testQuote = "There’s no such things as a small act of kindness." +
//                "Every act creates a ripple with no logical end";
//        Assertions.assertEquals(testQuote, testQ5.getQuote());
//        Assertions.assertEquals(testStatus, testQ5.getStatus());
//    }
//
//    @Test
//    void test5B() {
//        Authors testA5 = new Author5();
//        testAuthor = "Scott Adams";
//        Assertions.assertEquals(testAuthor, testA5.getAuthor());
//
//    }
//
//
//    @Test
//    void testAddFavourite() {
//        Quotes testQ1 = new Quote1();
//        testMotivationTool.addFavourite(testQ1);
//        Assertions.assertEquals(1, testMotivationTool.getFavouriteList().size());
//    }
//
//
//
//    @Test
//    void testRemoveFavourite() {
//        Quotes testQ1 = new Quote1();
//        testMotivationTool.addFavourite(testQ1);
//        testMotivationTool.removeFavourite(testQ1);
//        Assertions.assertEquals(0, testMotivationTool.getFavouriteList().size());
//    }
//
//    @Test
//    void testFavouriteAuthor() {
//        Authors testQA1 = new Author1();
//        testQA1.saveAuthor();
//        Assertions.assertTrue(true, testQA1.getAuthor());
//    }
//
//    @Test
//    void testUnFavouriteAuthor() {
//        Authors testQA2 = new Author2();
//        testQA2.saveAuthor();
//        testQA2.unSaveAuthor();
//        Assertions.assertFalse(false, testQA2.getAuthor());
//    }
//
//
//}