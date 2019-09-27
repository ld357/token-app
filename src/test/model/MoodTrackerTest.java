package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import model.MoodTracker;

import static org.junit.jupiter.api.Assertions.*;

class MoodTrackerTest {
    MoodTracker testMoodTracker;
    MoodTracker testAmazing;
    String testName;
    int testNum;
    MoodTracker testMoodChoice;
    ArrayList<MoodTracker> testHomepageData;
    ArrayList<MoodTracker> testAllMoods;


    @BeforeEach
    void setUp() {
        testMoodTracker = new MoodTracker();
        testAmazing = new MoodTracker();
        testAmazing.amazing();
    }

    @Test
    void testAmazing() {
        testNum = 5;
        testName = "amazing";
        testMoodTracker.amazing();
        assertEquals(testNum, testMoodTracker.getMoodNum());
        assertEquals(testName, testMoodTracker.getMoodName());
    }



    @Test
    void testContent() {
        testNum = 4;
        testName = "content";
        testMoodTracker.content();
        assertEquals(testNum, testMoodTracker.getMoodNum());
        assertEquals(testName, testMoodTracker.getMoodName());
    }

    @Test
    void testMeh() {
        testNum = 3;
        testName = "meh";
        testMoodTracker.meh();
        assertEquals(testNum, testMoodTracker.getMoodNum());
        assertEquals(testName, testMoodTracker.getMoodName());
    }

    @Test
    void testBad() {
        testNum = 2;
        testName = "bad";
        testMoodTracker.bad();
        assertEquals(testNum, testMoodTracker.getMoodNum());
        assertEquals(testName, testMoodTracker.getMoodName());
    }

    @Test
    void testTerrible() {
        testNum = 1;
        testName = "terrible";
        testMoodTracker.terrible();
        assertEquals(testNum, testMoodTracker.getMoodNum());
        assertEquals(testName, testMoodTracker.getMoodName());
    }

    @Test
    void testAddMood() {
        MoodTracker amazing = new MoodTracker();
        testMoodTracker.addMood(testAmazing);
        assertEquals(1, testMoodTracker.getHD().size());
    }


    @Test
    void testChangeMood() {
        MoodTracker content = new MoodTracker();
        testMoodTracker.changeMood(content);
        testMoodChoice = content;
        assertEquals(testMoodChoice, testMoodTracker.getMoodChoice());
    }

}