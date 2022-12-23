package org.example.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeMoverTest {
    @Test
    public void primeMover() {
        assertEquals(PrimeMover.primeMover(9), 23);
        assertEquals(PrimeMover.primeMover(100), 541);
    }
}
