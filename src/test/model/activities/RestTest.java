package model.activities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestTest {
    Activity rest;

    @BeforeEach
    void setUp() {
        rest = new Rest();
    }

    @Test
    void testConstructor() {
        assertEquals("today",rest.getStatus());
        assertEquals("Rest", rest.getActivityName());

    }



}