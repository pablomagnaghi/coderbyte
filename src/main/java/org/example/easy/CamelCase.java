package org.example.easy;

/**
 * Have the function camelCase(str) take the str parameter being passed
 * and return it in proper camel case format where the first letter
 * of each word is capitalized (excluding the first letter).
 * ---
 * The string will only contain letters and some combination of delimiter
 * punctuation characters separating each word.
 * For example: if str is "BOB loves-coding" then your program
 * should return the string bobLovesCoding.
 */
public class CamelCase {

    private static String[] splitWords(String str) {
        return str
                .toLowerCase()
                .replaceAll("([^a-z])", " ")
                .replaceAll(" +", " ")
                .trim().split(" ");
    }

    public static String camelCase(String str) {
        StringBuilder camel = new StringBuilder();
        String[] words = splitWords(str);
        int index = 0;
        for (String word : words) {
            if (index == 0) {
                camel.append(word);
            } else {
                camel.append(word.substring(0, 1).toUpperCase()).append(word.substring(1));
            }
            index++;
        }
        return camel.toString();
    }
}
