package model.activities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HydrateTest {
    Activity hydrate;

    @BeforeEach
    void setUp() {
        hydrate = new Hydrate();
    }

    @Test
    void testConstructor() {
        assertEquals("today",hydrate.getStatus());
        assertEquals("Hydrate", hydrate.getActivityName());

    }

}