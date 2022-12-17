package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PalindromeTest {

    @Test
    public void palindrome() {
        assertTrue(Palindrome.palindrome("dont nod"));
        assertTrue(Palindrome.palindrome("rats live on no evil star"));
    }

    @Test
    public void isPalindrome() {
        assertTrue(Palindrome.isPalindrome("dont nod"));
        assertTrue(Palindrome.isPalindrome("rats live on no evil star"));
    }
}


