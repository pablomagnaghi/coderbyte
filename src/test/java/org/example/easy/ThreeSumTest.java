package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ThreeSumTest {

    @Test
    public void threeSum() {
        assertTrue(ThreeSum.threeSum(new int[]{8, 1, 2, 3, 4, 5, 7}));
        assertTrue(ThreeSum.threeSum(new int[]{8, 2, 1, 4, 10, 5, -1, -1}));
    }
}
