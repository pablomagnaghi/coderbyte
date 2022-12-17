package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SuperIncreasingTest {

    @Test
    public void superIncreasing() {
        assertTrue(SuperIncreasing.superIncreasing(new int[]{1, 3, 6, 13, 54}));
        assertFalse(SuperIncreasing.superIncreasing(new int[]{3, 3}));
    }
}