package org.example.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringScrambleTest {

    @Test
    public void stringScramble() {
        assertFalse(StringScramble.stringScramble("win33er", "winner"));
        assertTrue(StringScramble.stringScramble("rkqodlw", "world"));
    }
}
