package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestFourTest {

    @Test
    public void largestFour() {
        assertEquals(LargestFour.largestFour(new int[]{5, 6, 10, 12, 1, 1, 1, 5}), 33);
        assertEquals(LargestFour.largestFour(new int[]{0, 0, 2, 3, 7, 1}), 13);
    }
}
