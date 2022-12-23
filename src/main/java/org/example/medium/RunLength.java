package org.example.medium;

/**
 * Have the function runLength(str) take the str parameter being passed
 * and return a compressed version of the string using the Run-length encoding algorithm.
 * ---
 * This algorithm works by taking the occurrence of each repeating character
 * and outputting that number along with a single character of the repeating sequence.
 * ---
 * For example: "wwwggopp" would return 3w2g1o2p.
 * The string will not contain any numbers, punctuation, or symbols.
 */
public class RunLength {

    public static String runLength(String str) {
        StringBuilder output = new StringBuilder();
        int count = 0;
        char prev = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == prev) {
                count++;
            } else {
                output.append(count).append(prev);
                count = 1;
                prev = str.charAt(i);
            }
        }
        output.append(count).append(prev);
        return output.toString();
    }
}
