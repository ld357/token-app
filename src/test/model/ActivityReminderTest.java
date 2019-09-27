package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class ActivityReminderTest {
    ActivityReminder testReminders;
    String testName;
    String testStatus;


    @BeforeEach
    void setUp() {
        testReminders = new ActivityReminder();

    }

    @Test
    void testHydrate() {
        testName = "Hydrate";
        testStatus = "today";
        testReminders.hydrate();
        assertEquals(testName, testReminders.getActivityName());
        assertEquals(testStatus, testReminders.getStatus());
    }


    @Test
    void testExercise() {
        testName = "Exercise";
        testStatus = "today";
        testReminders.exercise();
        assertEquals(testName, testReminders.getActivityName());
        assertEquals(testStatus, testReminders.getStatus());
    }

    @Test
    void testBreathe() {
        testName = "Breathe";
        testStatus = "today";
        testReminders.breathe();
        assertEquals(testName, testReminders.getActivityName());
        assertEquals(testStatus, testReminders.getStatus());
    }

    @Test
    void testRest() {
        testName = "Rest";
        testStatus = "today";
        testReminders.rest();
        assertEquals(testName, testReminders.getActivityName());
        assertEquals(testStatus, testReminders.getStatus());
    }

    @Test
    void testRevitalize() {
        testName = "Revitalize";
        testStatus = "today";
        testReminders.revitalize();
        assertEquals(testName, testReminders.getActivityName());
        assertEquals(testStatus, testReminders.getStatus());
    }

    @Test
    void testRefresh() {
        testName = "Refresh";
        testStatus = "today";
        testReminders.refresh();
        assertEquals(testName, testReminders.getActivityName());
        assertEquals(testStatus, testReminders.getStatus());
    }

    @Test
    void testInteract() {
        testName = "Interact";
        testStatus = "today";
        testReminders.interact();
        assertEquals(testName, testReminders.getActivityName());
        assertEquals(testStatus, testReminders.getStatus());
    }

    @Test
    void testInspire() {
        testName = "Inspire";
        testStatus = "today";
        testReminders.inspire();
        assertEquals(testName, testReminders.getActivityName());
        assertEquals(testStatus, testReminders.getStatus());
    }

    @Test
    void testCheckIn() {
        testStatus = "today";
        ActivityReminder testhydrate = new ActivityReminder();
        testReminders.checkIn(testhydrate);
        assertEquals(testStatus, testReminders.getStatus());
    }


    @Test
    void testAddActivity() {
        ActivityReminder testRelax = new ActivityReminder();
        testReminders.addActivity(testRelax);
        assertEquals(1, testReminders.getHomepagedata().size());

    }



    @Test
    void testRemoveActivity() {
        ActivityReminder testRelax = new ActivityReminder();
        testReminders.addActivity(testRelax);
        testReminders.removeActivity(testRelax);
        assertEquals(0, testReminders.getHomepagedata().size());
    }


}