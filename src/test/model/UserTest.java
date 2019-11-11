package model;

import model.activities.Activity;
import model.activities.Breathe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User userExample;
    Activity breathe;

    @BeforeEach
    void setUp() {
        userExample = new User("U1");
        breathe = new Breathe();

    }

    @Test
    void getName() {
        assertEquals("U1", userExample.getName());
    }

    @Test
    void testUpdate() {
        userExample.update(breathe);

    }

}