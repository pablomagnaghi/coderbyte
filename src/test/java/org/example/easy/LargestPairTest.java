package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestPairTest {

    @Test
    public void largestPair() {
        assertEquals(LargestPair.largestPair(567353664), 73);
        assertEquals(LargestPair.largestPair(8163264), 81);
    }
}
