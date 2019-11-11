package model;

import model.activities.Activity;
import model.activities.Breathe;
import model.activities.Exercise;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeTest {
    Home testHome;
    Activity breathe;
    Activity exercise;


    @BeforeEach
    void setUp() {
        testHome = new Home("My Home");
        breathe = new Breathe();
        exercise = new Exercise();
    }

    @Test
    void getName() {
        assertEquals("My Home",testHome.getName());
    }

    @Test
    void addActivity() {
        testHome.addActivity(breathe);
        assertEquals(1, testHome.activities.size());
    }

    @Test
    void addActivities() {
        testHome.addActivity(breathe);
        testHome.addActivity(exercise);
        assertEquals(2, testHome.activities.size());

    }
}
