package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabetSoupTest {

    @Test
    public void alphabetSoup() {
        assertEquals(AlphabetSoup.alphabetSoup("leftfield"), "deeffillt");
        assertEquals(AlphabetSoup.alphabetSoup("underworld"), "ddelnorruw");
    }
}
