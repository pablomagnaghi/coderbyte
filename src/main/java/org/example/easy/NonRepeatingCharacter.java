package org.example.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Have the function nonRepeatingCharacter(str)
 * take the str parameter being passed,
 * which will contain only alphabetic characters and spaces,
 * and return the first non-repeating character.
 * ---
 * For example: if str is "agettkgaeee" then your program should return k.
 * The string will always contain at least one character and there will
 * always be at least one non-repeating character.
 */
public class NonRepeatingCharacter {
    public static String nonRepeatingCharacter(String str) {

        char[] charArr = str.toLowerCase().toCharArray();
        Map<Integer, Integer> freq = new HashMap<>();

        for (int c : charArr) {
            Integer count = freq.get(c);
            freq.put(c, count == null ? 1 : ++count);
        }

        for (int c : charArr) {
            Integer count = freq.get(c);
            if (count == 1) {
                return String.valueOf((char) c);
            }
        }
        return "false";
    }
}
