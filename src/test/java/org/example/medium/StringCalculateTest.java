package org.example.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculateTest {

    @Test
    public void stringCalculate() {
        assertEquals(StringCalculate.stringCalculate("7-4-1+8(3)/2"), "14");
        assertEquals(StringCalculate.stringCalculate("(2+2)*2"), "8");
        assertEquals(StringCalculate.stringCalculate("2+2*2"), "6");
    }
}
