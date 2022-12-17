package org.example.easy;

/**
 * Have the function wordCount(str) take the str string
 * parameter being passed and return the number of words the string
 * contains (e.g. "Never eat shredded wheat or cake" would return 6).
 * Words will be separated by single spaces.
 */
public class WordCount {

    public static int wordCount(String str) {
        String[] words = str.split(" ");
        return str.length() > 0 ? words.length : 0;
    }
}
