package ui;

import model.Quotes;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Unit tests for MainTest
public class MainTest {
    private static final int NUMITEMS = 50;
    private Quotes set;

    @BeforeEach
    public void runBefore() {set = new Quotes(); }


}