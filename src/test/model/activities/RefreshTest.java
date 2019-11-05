package model.activities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RefreshTest {
    Activity refresh;

    @BeforeEach
    void setUp() {
        refresh = new Refresh();
    }

    @Test
    void testConstructor() {
        assertEquals("today",refresh.getStatus());
        assertEquals("Refresh", refresh.getActivityName());

    }

}