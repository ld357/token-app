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
    String testSoundMood;
    String testAnnounceMood;
    HashSet<Moods> testHomepageData;
    HashSet<Moods> testSelectionData;


    @BeforeEach
    void setUp() {
        testMoodTracker = new MoodTracker();
    }

    @Test
    void testAmazing() {
        Moods testAmazing = new Amazing();
        Amazing testAmazing2 = new Amazing();
        testNum = 5;
        testName = "amazing";
        assertEquals(testNum, testAmazing.getMoodNum());
        assertEquals(testName, testAmazing.getMoodName());
    }

    @Test
    void testSetting() {
        Amazing testAmazing = new Amazing();
        testNum = 5;
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


    @Test
    void testSoundAMood() {
        Amazing testAmazing = new Amazing();
        testAmazing.soundMood();
        testSoundMood = "Yaay!";
        assertEquals(testSoundMood, testAmazing.getSoundMood());

    }

    @Test
    void testAnnounceAMood() {
        Amazing testAmazing = new Amazing();
        testAmazing.announceMood();
        testAnnounceMood = "I am feeling amazing!";
        assertEquals(testAnnounceMood, testAmazing.getAnnouncement());
    }

    @Test
    void testSoundBMood() {
        Bad testBad = new Bad();
        testBad.soundMood();
        testSoundMood = "Ughhh!.";
        assertEquals(testSoundMood, testBad.getSoundMood());

    }

    @Test
    void testAnnounceBMood() {
        Bad testBad = new Bad();
        testBad.announceMood();
        testAnnounceMood = "I am feeling bad!";
        assertEquals(testAnnounceMood, testBad.getAnnouncement());
    }

    @Test
    void testSoundCMood() {
        Content testContent = new Content();
        testContent.soundMood();
        testSoundMood = "Hmmmm!";
        assertEquals(testSoundMood, testContent.getSoundMood());

    }

    @Test
    void testAnnounceCMood() {
        Content testContent = new Content();
        testContent.announceMood();
        testAnnounceMood = "I am feeling content!";
        assertEquals(testAnnounceMood, testContent.getAnnouncement());
    }

    @Test
    void testSoundMMood() {
        Meh testMeh = new Meh();
        testMeh.soundMood();
        testSoundMood = "Ehhhhh...";
        assertEquals(testSoundMood, testMeh.getSoundMood());

    }

    @Test
    void testAnnounceMMood() {
        Meh testMeh = new Meh();
        testMeh.announceMood();
        testAnnounceMood = "I am feeling meh!";
        assertEquals(testAnnounceMood, testMeh.getAnnouncement());
    }

    @Test
    void testSoundTMood() {
        Terrible testTerrible = new Terrible();
        testTerrible.soundMood();
        testSoundMood = "DARNN...";
        assertEquals(testSoundMood, testTerrible.getSoundMood());

    }

    @Test
    void testAnnounceTMood() {
        Terrible testTerrible = new Terrible();
        testTerrible.announceMood();
        testAnnounceMood = "I am feeling terrible!";
        assertEquals(testAnnounceMood, testTerrible.getAnnouncement());
    }
}