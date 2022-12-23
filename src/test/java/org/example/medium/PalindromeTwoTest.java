package org.example.medium;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PalindromeTwoTest {
    @Test
    public void palindromeTwo() {
        assertTrue(PalindromeTwo.palindromeTwo("Noel - sees Leon"));
        assertTrue(PalindromeTwo.palindromeTwo("A man, a plan, a canal – Panama."));
        assertTrue(PalindromeTwo.palindromeTwo("No lemon, no melon!"));
    }
}
