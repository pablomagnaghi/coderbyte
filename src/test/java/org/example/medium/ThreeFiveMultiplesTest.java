package org.example.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeFiveMultiplesTest {
    @Test
    public void threeFiveMultiples() {
        assertEquals(ThreeFiveMultiples.threeFiveMultiples(17), 60);
        assertEquals(ThreeFiveMultiples.threeFiveMultiples(117), 3183);
    }
}

