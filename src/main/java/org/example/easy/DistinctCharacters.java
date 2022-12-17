package org.example.easy;


import java.util.HashSet;
import java.util.Set;

/**
 * Have the function distinctCharacters(str) take the str parameter being passed
 * and determine if it contains at least 10 distinct characters,
 * if so, then your program should return the string true,
 * otherwise it should return the string false.
 * ---
 * For example: if str is "abc123kkmmmm?" then your program should return the string false
 * because this string contains only 9 distinct characters:
 * a, b, c, 1, 2, 3, k, m. ? adds up to 9.
 */
public class DistinctCharacters {

    public static boolean distinctCharacters(String str) {
        Set<Character> table = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            table.add(str.charAt(i));
        }
        return table.size() >= 10;
    }
}