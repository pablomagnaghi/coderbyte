package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicRomanNumeralsTest {

    @Test
    public void basicRomanNumerals() {
        assertEquals(BasicRomanNumerals.basicRomanNumerals("XXIV"), 24);
        assertEquals(BasicRomanNumerals.basicRomanNumerals("XLVI"), 46);
        assertEquals(BasicRomanNumerals.basicRomanNumerals("IV"), 4);
        assertEquals(BasicRomanNumerals.basicRomanNumerals("XXXIX"), 39);
        assertEquals(BasicRomanNumerals.basicRomanNumerals("XLI"), 41);
    }
}
