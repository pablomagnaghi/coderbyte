package org.example.hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void calculate() {
        assertEquals(Calculator.calculate("8-7*(12+100/2)*9-2"), "-3900");
    }
}
