package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LetterCapitalizeTest {

    @Test
    public void letterCapitalize() {
        assertEquals(LetterCapitalize.letterCapitalize("The soul becomes dyed with the color of its thoughts."), "The Soul Becomes Dyed With The Color Of Its Thoughts.");
        assertEquals(LetterCapitalize.letterCapitalize("The universe is change; our life is what our thoughts make it."), "The Universe Is Change; Our Life Is What Our Thoughts Make It.");
    }
}
