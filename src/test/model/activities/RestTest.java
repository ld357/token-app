package model.activities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RestTest {
    Activity rest;

    @BeforeEach
    void setUp() {
        rest = new Rest();
    }

    @Test
    void testConstructor() {
        assertEquals("not yet completed",rest.getStatus());
        assertEquals("Rest", rest.getActivityName());

    }

    @Test
    void testStatus() {
        rest.setStatus();
        assertEquals("today",rest.getStatus());
    }




}