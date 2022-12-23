package org.example.medium;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EvenPairsTest {

    @Test
    public void evenPairs() {
        assertTrue(EvenPairs.evenPairs("7r5gg812"));
        assertTrue(EvenPairs.evenPairs("f178svg3k19k46"));
    }
}
