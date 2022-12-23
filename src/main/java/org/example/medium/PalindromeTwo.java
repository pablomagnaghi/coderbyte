package org.example.medium;

/**
 * Have the function palindromeTwo(str) take the str parameter being passed
 * and return the string true if the parameter is a palindrome,
 * (the string is the same forward as it is backward)
 * otherwise return the string false.
 * ---
 * The parameter entered may have punctuation and symbols,
 * but they should not affect whether the string is in fact a palindrome.
 * For example: "Anne, I vote more cars race Rome-to-Vienna" should return true.
 */
public class PalindromeTwo {

    private static boolean isPalindrome(String str) {
        char[] strArr = str.toCharArray();
        int len = strArr.length;
        for (int i = 0; i < len / 2; i++) {
            if (strArr[i] != strArr[len - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean palindromeTwo(String str) {
        String parsed = str.toLowerCase().replaceAll("[^a-z$]", "");
        return isPalindrome(parsed);
    }
}
