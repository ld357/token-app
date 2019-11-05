package model.activities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InteractTest {
    Activity interact;

    @BeforeEach
    void setUp() {
        interact = new Interact();
    }

    @Test
    void testConstructor() {
        assertEquals("today",interact.getStatus());
        assertEquals("Interact", interact.getActivityName());

    }

}