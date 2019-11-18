package model.activities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InteractTest {
    Activity interact;

    @BeforeEach
    void setUp() {
        interact = new Interact();
    }

    @Test
    void testConstructor() {
        assertEquals("not yet completed",interact.getStatus());
        assertEquals("Interact", interact.getActivityName());

    }

    @Test
    void testStatus() {
        interact.setStatus();
        assertEquals("today",interact.getStatus());
    }


}