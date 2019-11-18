package model.activities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InspireTest {
    Activity inspire;

    @BeforeEach
    void setUp() {
        inspire = new Inspire();
    }

    @Test
    void testConstructor() {
        assertEquals("not yet completed",inspire.getStatus());
        assertEquals("Inspire", inspire.getActivityName());

    }

    @Test
    void testStatus() {
        inspire.setStatus();
        assertEquals("today",inspire.getStatus());
    }

}