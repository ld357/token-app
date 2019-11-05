package model.activities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InspireTest {
    Activity inspire;

    @BeforeEach
    void setUp() {
        inspire = new Inspire();
    }

    @Test
    void testConstructor() {
        assertEquals("today",inspire.getStatus());
        assertEquals("Inspire", inspire.getActivityName());

    }

}