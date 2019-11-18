package model.activities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HydrateTest {
    Activity hydrate;

    @BeforeEach
    void setUp() {
        hydrate = new Hydrate();
    }

    @Test
    void testConstructor() {
        assertEquals("not yet completed",hydrate.getStatus());
        assertEquals("Hydrate", hydrate.getActivityName());

    }

    @Test
    void testStatus() {
        hydrate.setStatus();
        assertEquals("today",hydrate.getStatus());
    }


}