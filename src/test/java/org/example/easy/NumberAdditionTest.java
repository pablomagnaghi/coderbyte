package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberAdditionTest {

    @Test
    public void numberAddition() {
        assertEquals(NumberAddition.numberAddition("Chillhouse Mix 2 (2001)"), 2003);
        assertEquals(NumberAddition.numberAddition("Cafe del Mar 5 (1998)"), 2003);
    }
}
