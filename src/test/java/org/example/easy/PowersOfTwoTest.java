package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PowersOfTwoTest {

    @Test
    public void powersOfTwo() {
        assertFalse(PowersOfTwo.powersOfTwo(15));
        assertTrue(PowersOfTwo.powersOfTwo(64));
    }
}
