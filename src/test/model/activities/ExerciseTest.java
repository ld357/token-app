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
        assertEquals("today",exercise.getStatus());
        assertEquals("Exercise", exercise.getActivityName());

    }

}