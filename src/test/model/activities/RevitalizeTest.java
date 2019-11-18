package model.activities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RevitalizeTest {
    Activity revitalize;

    @BeforeEach
    void setUp() {
        revitalize = new Revitalize();
    }

    @Test
    void testConstructor() {
        assertEquals("not yet completed",revitalize.getStatus());
        assertEquals("Revitalize", revitalize.getActivityName());

    }

    @Test
    void testStatus() {
        revitalize.setStatus();
        assertEquals("today",revitalize.getStatus());
    }




}