package model;

import model.activities.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class ActivityReminderTest {
    ActivityReminder testReminders;
    Activities testBreathe;
    String testName;
    String testStatus;
    Activities testActChoice;
    HashSet<Activities> testHomepageData;
    HashSet<Activities> testSelectionData;



    @BeforeEach
    void setUp() {
        testReminders = new ActivityReminder();


    }

    @Test
    void testHydrate() {
        Activities testHydrate = new Hydrate();
        Activities testRest = new Rest();
        testName = "Hydrate";
        testStatus = "today";
        assertEquals(testName, testHydrate.getActivityName());
        assertEquals(testStatus, testHydrate.getStatus());
    }


    @Test
    void testExercise() {
        Activities testExercise = new Exercise();
        testName = "Exercise";
        testStatus = "today";
        assertEquals(testName, testExercise.getActivityName());
        assertEquals(testStatus, testExercise.getStatus());
    }

    @Test
    void testBreathe() {
        Activities testExercise = new Breathe();
        testName = "Breathe";
        testStatus = "today";
        assertEquals(testName, testExercise.getActivityName());
        assertEquals(testStatus, testExercise.getStatus());
    }

    @Test
    void testRest() {
        Activities testRest = new Rest();
        testName = "Rest";
        testStatus = "today";
        assertEquals(testName, testRest.getActivityName());
        assertEquals(testStatus, testRest.getStatus());
    }

    @Test
    void testRevitalize() {
        Activities testRevitalize = new Revitalize();
        testName = "Revitalize";
        testStatus = "today";
        assertEquals(testName, testRevitalize.getActivityName());
        assertEquals(testStatus, testRevitalize.getStatus());
    }

    @Test
    void testRefresh() {
        Activities testRefresh = new Refresh();
        testName = "Refresh";
        testStatus = "today";
        assertEquals(testName, testRefresh.getActivityName());
        assertEquals(testStatus, testRefresh.getStatus());
    }

    @Test
    void testInteract() {
        Activities testInteract = new Interact();
        testName = "Interact";
        testStatus = "today";
        assertEquals(testName, testInteract.getActivityName());
        assertEquals(testStatus, testInteract.getStatus());
    }

    @Test
    void testInspire() {
        Activities testInspire = new Inspire();
        testName = "Inspire";
        testStatus = "today";
        assertEquals(testName, testInspire.getActivityName());
        assertEquals(testStatus, testInspire.getStatus());
    }

    @Test
    void testCheckIn() {
        testStatus = "today";
        Activities testInspire = new Inspire();
        testReminders.checkIn(testInspire);
        assertEquals(testStatus, testInspire.getStatus());
    }


    @Test
    void testAddActivity() throws IOException, EOFException {
        Activities testInspire = new Inspire();
        testReminders.addActivity(testInspire);
        assertEquals(1, testReminders.getHomepageData().size());
    }



    @Test
    void testRemoveActivity() throws IOException {
        Activities testInspire = new Inspire();
        testReminders.addActivity(testInspire);
        testReminders.removeActivity(testInspire);
        assertEquals(0, testReminders.getHomepageData().size());
    }


}