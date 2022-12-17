package org.example.easy;

/**
 * Have the function letterCapitalize(str) take the str parameter
 * being passed and capitalize the first letter of each word.
 * Words will be separated by only one space.
 */
public class LetterCapitalize {

    public static String letterCapitalize(String str) {
        String[] splitWords = str.split(" ");
        for (int i = 0; i < splitWords.length; i++) {
            String word = splitWords[i];
            splitWords[i] = word.substring(0, 1).toUpperCase() + word.substring(1);
        }
        return String.join(" ", splitWords);
    }
}
