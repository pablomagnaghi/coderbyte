package org.example.hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumReductionTest {
    @Test
    public void romanNumeralReduction() {
        assertEquals(RomanNumReduction.romanNumeralReduction("XXXVVIIIIIIIIII"), "L");
        assertEquals(RomanNumReduction.romanNumeralReduction("VVV"), "XV");
        assertEquals(RomanNumReduction.romanNumeralReduction("CCCCCIIIII"), "DV");

    }
}