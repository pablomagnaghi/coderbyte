package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeCreatorTest {

    @Test
    public void palindromeCreator() {
        assertEquals(PalindromeCreator.palindromeCreator("racecar"), "palindrome");
        assertEquals(PalindromeCreator.palindromeCreator("vhhgghhgghhk"), "vk");
        assertEquals(PalindromeCreator.palindromeCreator("rats live on no evil stars"), "s");
    }
}
