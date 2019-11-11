package model.activities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseTest {
    Activity exercise;

    @BeforeEach
    void setUp() {
        exercise = new Exercise();
    }

    @Test
    void testConstructor() {
        assertEquals("not yet completed",exercise.getStatus());
        assertEquals("Exercise", exercise.getActivityName());

    }

    @Test
    void testStatus() {
        exercise.setStatus();
        assertEquals("today",exercise.getStatus());
    }


}