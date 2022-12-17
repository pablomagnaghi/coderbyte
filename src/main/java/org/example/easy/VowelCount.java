package org.example.easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Have the function vowelCount(str) take the str string
 * parameter being passed and return the number of vowels
 * the string contains (i.e. "All cows eat grass and moo" would return 8).
 * Do not count y as a vowel for this challenge.
 */
public class VowelCount {
    public static int vowelCount(String str) {
        Pattern pattern = Pattern.compile("[aeiou]");
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        int count = 0;
        while (matcher.find(i)) {
            count++;
            i = matcher.start() + 1;
        }
        return count;
    }
}
