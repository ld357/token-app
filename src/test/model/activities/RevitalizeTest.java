package model.activities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RevitalizeTest {
    Activity revitalize;

    @BeforeEach
    void setUp() {
        revitalize = new Revitalize();
    }

    @Test
    void testConstructor() {
        assertEquals("today",revitalize.getStatus());
        assertEquals("Revitalize", revitalize.getActivityName());

    }



}