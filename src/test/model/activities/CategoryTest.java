package model.activities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {
    Category testCategory1;
    Category testCategory2;
    Category testCategory3;

    @BeforeEach
    void setUp() {
        testCategory1 = new Category("High Active",5,false);
        testCategory2 = new Category("Medium Active",3,false);
        testCategory3 = new Category("Medium Active",3,false);
    }

    @Test
    void testGetName() {
        assertEquals("High Active",testCategory1.getName());
        assertEquals("Medium Active",testCategory2.getName());
    }

    @Test
    void testGetActiveLevel() {
        assertEquals(5,testCategory1.getActiveLevel());
        assertEquals(3,testCategory2.getActiveLevel());
    }

    @Test
    void testHashCodeEquals() {
        assertTrue(testCategory2.equals(testCategory3));
        assertTrue(testCategory3.equals(testCategory2));
        assertTrue(testCategory2.hashCode() == testCategory3.hashCode());
    }

}
