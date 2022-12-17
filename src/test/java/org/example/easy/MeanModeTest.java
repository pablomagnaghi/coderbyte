package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MeanModeTest {
    @Test
    public void meanMode() {
        assertEquals(MeanMode.meanMode(new int[]{5, 3, 3, 3, 1}), "1");
        assertEquals(MeanMode.meanMode(new int[]{64, 64, 64, 64, 64, 64, 64, 64, 1024}), "0");
    }
}
