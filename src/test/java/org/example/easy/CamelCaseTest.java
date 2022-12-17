package org.example.easy;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CamelCaseTest {

    @Test
    public void camelCase() {
        assertEquals(CamelCase.camelCase("_good_looking_blues_"), "goodLookingBlues");
        assertEquals(CamelCase.camelCase("-=last-night-on-earth=-"), "lastNightOnEarth");
        assertEquals(CamelCase.camelCase("BOB loves-coding"), "bobLovesCoding");
    }
}
