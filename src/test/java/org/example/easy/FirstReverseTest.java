package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstReverseTest {
    @Test
    public void firstReverse() {
        assertEquals(FirstReverse.firstReverse("Hello World and Coders"), "sredoC dna dlroW olleH");
        assertEquals(FirstReverse.firstReverse("Good Looking Blues"), "seulB gnikooL dooG");
    }
}
