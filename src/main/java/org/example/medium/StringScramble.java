package org.example.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Have the function stringScramble(str1,str2) take both parameters
 * being passed and return the string true. if a portion of str1 characters
 * can be rearranged to match str2, otherwise return the string false.
 * For example: if str1 is "rkqodlw" and str2 is "world"
 * the output should return true.
 * Punctuation and symbols will not be entered with the parameters.
 */
public class StringScramble {

    public static boolean stringScramble(String str1, String str2) {
        Map<String, Integer> freq = new HashMap<>();
        String[] arr1 = str1.replaceAll("([^" + str2 + "])", "").split("");
        String[] arr2 = str2.split("");
        for (String letter : arr1) {
            if (freq.containsKey(letter)) {
                freq.put(letter, freq.get(letter) + 1);
            } else {
                freq.put(letter, 1);
            }
        }
        for (String letter : arr2) {
            if (freq.containsKey(letter) && freq.get(letter) > 0) {
                freq.put(letter, freq.get(letter) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
