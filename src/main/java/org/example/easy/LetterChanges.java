package org.example.easy;


/**
 * Have the function letterChanges(str) take the str parameter
 * being passed and modify it using the following algorithm.
 * Replace every letter in the string with the letter
 * following it in the alphabet (i.e. c becomes d, z becomes a).
 * Then capitalize every vowel in this new string (a-e-i-o-u)
 * and finally return this modified string.
 */
public class LetterChanges {

    public static String letterChanges(String str) {
        char[] alphabet = {'b', 'c', 'd', 'E', 'f', 'g', 'h', 'I', 'j', 'k', 'l',
                'm', 'n', 'O', 'p', 'q', 'r', 's', 't', 'U', 'v', 'w', 'x', 'y', 'z', 'A'};
        char[] charArray = str.toLowerCase().toCharArray();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            boolean isLetter = letter >= 'a' && letter <= 'z';
            if (isLetter) {
                output.append(alphabet[charArray[i] - 97]);
            } else {
                output.append(letter);
            }
        }

        return output.toString();
    }
}
