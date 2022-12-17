package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleAddingTest {

    @Test
    public void simpleAdding() {
        assertEquals(SimpleAdding.simpleAdding(100), 5050);
        assertEquals(SimpleAdding.simpleAdding(8), 36);
    }
}
