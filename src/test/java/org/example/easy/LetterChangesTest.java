package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LetterChangesTest {
    @Test
    public void letterChanges() {
        assertEquals(LetterChanges.letterChanges("anthology"), "bOUIpmphz");
        assertEquals(LetterChanges.letterChanges("equilibrium"), "frvjmjcsjvn");
        assertEquals(LetterChanges.letterChanges("oxford"), "pygpsE");
    }
}
