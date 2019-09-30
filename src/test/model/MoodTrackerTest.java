package model;

import model.moods.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class MoodTrackerTest {
    MoodTracker testMoodTracker;
    Moods testAmazing;
    String testName;
    int testNum;
    Moods testMoodChoice;
    HashSet<Moods> testHomepageData;
    HashSet<Moods> testSelectionData;


    @BeforeEach
    void setUp() {
        testMoodTracker = new MoodTracker();
    }

    @Test
    void testAmazing() {
        Moods testAmazing = new Amazing();
        testNum = 5;
        testName = "amazing";
        assertEquals(testNum, testAmazing.getMoodNum());
        assertEquals(testName, testAmazing.getMoodName());
    }



    @Test
    void testContent() {
        Moods testContent = new Content();
        testNum = 4;
        testName = "content";
        assertEquals(testNum, testContent.getMoodNum());
        assertEquals(testName, testContent.getMoodName());
    }

    @Test
    void testMeh() {
        Moods testMeh = new Meh();
        testNum = 3;
        testName = "meh";
        assertEquals(testNum, testMeh.getMoodNum());
        assertEquals(testName, testMeh.getMoodName());
    }

    @Test
    void testBad() {
        Moods testBad = new Bad();
        testNum = 2;
        testName = "bad";
        assertEquals(testNum, testBad.getMoodNum());
        assertEquals(testName, testBad.getMoodName());
    }

    @Test
    void testTerrible() {
        Moods testTerrible = new Terrible();
        testNum = 1;
        testName = "terrible";
        assertEquals(testNum, testTerrible.getMoodNum());
        assertEquals(testName, testTerrible.getMoodName());
    }

    @Test
    void testAddMood() {
        Moods testAmazing = new Amazing();
        testMoodTracker.addMood(testAmazing);
        assertEquals(1, testMoodTracker.getHD().size());
    }


    @Test
    void testChangeMood() {
        Moods testContent = new Content();
        testMoodTracker.changeMood(testContent);
        testMoodChoice = testContent;
        assertEquals(testMoodChoice, testMoodTracker.getMoodChoice(testContent));
    }

}