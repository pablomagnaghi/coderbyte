package org.example.hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReversePolishNotationTest {
    @Test
    public void reversePolishNotation() {
        assertEquals(ReversePolishNotation.reversePolishNotation("1 1 + 1 + 1 +"), "4");
        assertEquals(ReversePolishNotation.reversePolishNotation("1 2 + 3 *"), "9");
    }
}

