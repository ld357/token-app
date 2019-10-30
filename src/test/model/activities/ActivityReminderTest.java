package model.activities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ActivityReminderTest {
    ActivityReminder testActivityReminder;
    Category testCategory1;
    Category testCategory2;


    @BeforeEach
    void setUp() {
        testActivityReminder = new ActivityReminder();
        testCategory1 = new Category("High Active",5,false);
        testCategory2 = new Category("Medium Active",3,false);

    }


    @Test
    void testProvideTags() {
        testActivityReminder.provideTags(testCategory1);

    }


    @Test
    void testAddCategory() {
        testActivityReminder.addCategory(testCategory1);
        testActivityReminder.addCategory(testCategory2);
    }


    @Test
    void testAddTag() {
        testActivityReminder.addTag(testCategory1,"#fit");
        testActivityReminder.addTag(testCategory1,"#physicalgrowth");

    }


}
