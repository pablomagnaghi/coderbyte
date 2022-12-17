package org.example.easy;

/**
 * Have the function palindrome(str) take the str parameter
 * being passed and return the string true
 * if the parameter is a palindrome,
 * (the string is the same forward as it is backward)
 * otherwise return the string false.
 * For example: "racecar" is also "racecar" backwards.
 * Punctuation and numbers will not be part of the string.
 */
public class Palindrome {

    public static boolean palindrome(String str) {
        StringBuilder reversed = new StringBuilder();
        String cleaned = str.replaceAll(" ", "");
        reversed.append(cleaned).reverse();
        return cleaned.equals(reversed.toString()) && str.length() > 0;
    }

    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll(" ", "");
        char[] strArr = cleaned.toCharArray();
        int len = strArr.length;
        for (int i = 0; i < len / 2; i++) {
            if (strArr[i] != strArr[len - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
