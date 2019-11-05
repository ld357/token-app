package model.activities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BreatheTest {
    Activities breathe;

    @BeforeEach
    void setUp() {
        breathe = new Breathe();
    }

    @Test
    void testConstructor() {
        assertEquals("today",breathe.getStatus());
        assertEquals("Breathe", breathe.getActivityName());

    }


}