package model;

import model.activities.Activity;
import model.activities.Breathe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubjectTest {
    Subject subjectTest;
    Observer user1;
    Observer user2;
    Observer user3;
    Activity breathe;


    @BeforeEach
    void setUp() {
        subjectTest = new Home("My Home");
        user1 = new User("U1");
        user2 = new User("U2");
        user3 = new User("U3");
        breathe = new Breathe();
    }


    @Test
    void addOneObserver() {
        subjectTest.addObserver(user1);
        assertEquals(1, subjectTest.observers.size());

    }

    @Test
    void removeOneObserver() {
        subjectTest.addObserver(user1);
        assertEquals(1, subjectTest.observers.size());

        subjectTest.removeObserver(user1);
        assertEquals(0, subjectTest.observers.size());

    }

    @Test
    void addMultiple() {
        subjectTest.addObserver(user1);
        subjectTest.addObserver(user1);
        subjectTest.addObserver(user2);
        subjectTest.addObserver(user3);
        assertEquals(3, subjectTest.observers.size());

    }

    @Test
    void removeOneHaveMultiple() {
        subjectTest.addObserver(user1);
        subjectTest.removeObserver(user1);
        subjectTest.addObserver(user2);
        subjectTest.addObserver(user3);
        assertEquals(2, subjectTest.observers.size());

    }

    @Test
    void notifyObserver() {
        subjectTest.notifyObserver(breathe);
    }
}