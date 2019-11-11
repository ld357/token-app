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
        assertEquals("not yet completed",refresh.getStatus());
        assertEquals("Refresh", refresh.getActivityName());

    }

    @Test
    void testStatus() {
        refresh.setStatus();
        assertEquals("today",refresh.getStatus());
    }


}