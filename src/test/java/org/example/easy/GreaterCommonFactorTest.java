package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreaterCommonFactorTest {

    @Test
    public void greaterCommonFactor() {
        assertEquals(GreaterCommonFactor.greaterCommonFactor(new int[]{64, 128, 256, 512}), 64);
        assertEquals(GreaterCommonFactor.greaterCommonFactor(new int[]{12, 28}), 4);
    }
}
