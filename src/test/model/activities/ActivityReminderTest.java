package model.activities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ActivityReminderTest {
    ActivityReminder testActivityReminder;
    Category testCategory1;
    Category testCategory2;
    Activity Breathe;


    @BeforeEach
    void setUp() {
        testActivityReminder = new ActivityReminder();
        testCategory1 = new Category("High Active",5,false);
        testCategory2 = new Category("Medium Active",3,false);

    }

    @Test
    void testConstructor() {
        assertEquals("",testActivityReminder.getActivityName());
        assertEquals("not yet completed",testActivityReminder.getStatus());
        assertEquals(8, testActivityReminder.selectionD.size());
        testActivityReminder.setStatus();
        assertEquals("today",testActivityReminder.getStatus());
    }


    @Test
    void testProvideTags() {

        testActivityReminder.addCategory(testCategory1);
        testActivityReminder.addCategory(testCategory2);

        testActivityReminder.addTag(testCategory1,"#fit");
        testActivityReminder.addTag(testCategory1,"#physicalgrowth");

        testActivityReminder.provideTags(testCategory1);

        System.out.println(testActivityReminder.tag.categoryTags.keySet());
        System.out.println(testActivityReminder.tag.categoryTags.values());
    }


    @Test
    void testAddCategory() {
        testActivityReminder.addCategory(testCategory1);
        testActivityReminder.addCategory(testCategory2);

        testActivityReminder.addTag(testCategory1,"#fit");
        testActivityReminder.addTag(testCategory1,"#physicalgrowth");

        assertTrue(testActivityReminder.tag.categoryTags.containsKey(testCategory1));
        assertTrue(testActivityReminder.tag.categoryTags.containsKey(testCategory2));

        testActivityReminder.tag.categoryTags.values();

    }


    @Test
    void testAddTag() {
        testActivityReminder.addTag(testCategory1,"#fit");
        testActivityReminder.addTag(testCategory1,"#physicalgrowth");

        System.out.println(testActivityReminder.tag.categoryTags.values());

    }

    @Test
    void testCheckIn() {
        Breathe = new Breathe();
        testActivityReminder.checkIn(Breathe);
        assertEquals("today",testActivityReminder.status);
    }


    @Test
    void testAddActivity() {
        Breathe = new Breathe();
        testActivityReminder.addActivity(Breathe);
        assertEquals(1, testActivityReminder.homepageD.size());
        assertEquals("today", Breathe.getStatus());
    }

    @Test
    void testAddActivityThere() {
        Breathe = new Breathe();
        testActivityReminder.addActivity(Breathe);
        assertEquals(1, testActivityReminder.homepageD.size());
        testActivityReminder.addActivity(Breathe);
        assertEquals(1, testActivityReminder.homepageD.size());
        assertEquals("today", Breathe.getStatus());
    }

    @Test
    void testRemoveActivityNotThere() {
        Breathe = new Breathe();
        testActivityReminder.removeActivity(Breathe);
        assertEquals(0, testActivityReminder.homepageD.size());

    }

    @Test
    void testAddThenRemoveActivity() {
        Breathe = new Breathe();
        testActivityReminder.addActivity(Breathe);
        assertEquals(1, testActivityReminder.homepageD.size());
        assertEquals("today", Breathe.getStatus());
        testActivityReminder.removeActivity(Breathe);
        assertEquals(0, testActivityReminder.homepageD.size());
    }


}
