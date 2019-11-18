package model.quotes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CollectionTest {
    Collection Collect;

    @BeforeEach
    public void setUp() {
        Collect = new Collection();
    }


    @Test
    public void testDisplayQuotes() {
        Collect.displayQuotes();
        assertEquals(3, Collect.quotes.size());
    }

    @Test
    public void testDisplayAuthors() {
        Collect.displayAuthors();
        assertEquals(2,Collect.authors.size());

    }
}