package org.example.easy;

/**
 * Have the function snakeCase(str) take the str parameter being passed
 * and return it in proper snake case format where each word is lowercased
 * and separated from adjacent words via an underscore.
 * The string will only contain letters and some combination
 * of delimiter punctuation characters separating each word.
 */
public class SnakeCase {
    public static String snakeCase(String str) {
        return str
                .toLowerCase()
                .replaceAll("([^a-z])", " ")
                .replaceAll(" +", "_")
                .trim();
    }
}

