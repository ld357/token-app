package model.activities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BreatheTest {
    Activity breathe;

    @BeforeEach
    void setUp() {
        breathe = new Breathe();
    }

    @Test
    void testConstructor() {
        assertEquals("not yet completed",breathe.getStatus());
        assertEquals("Breathe", breathe.getActivityName());

    }

    @Test
    void testStatus() {
        breathe.setStatus();
        assertEquals("today",breathe.getStatus());
    }


}