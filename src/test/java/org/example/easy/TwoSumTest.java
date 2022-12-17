package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSumTest {
    @Test
    public void twoSum() {
        assertEquals(TwoSum.twoSum(new int[]{8, 1, 2, 3, 4, 5, 7}), "1,7 3,5");
        assertEquals(TwoSum.twoSum(new int[]{7, 3, 5, 2, -4, 8, 11}), "5,2 -4,11");
    }
}
