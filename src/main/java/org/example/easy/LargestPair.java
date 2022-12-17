package org.example.easy;

/**
 * Have the function largestPair(num) take the num parameter being passed
 * and determine the largest double-digit number within the whole number.
 * ---
 * For example: if num is 4759472 then your program should return 94 because
 * that is the largest double-digit number.
 * The input will always contain at least two positive digits.
 */
public class LargestPair {
    public static int largestPair(int num) {
        int largest = Integer.MIN_VALUE;
        String number = Integer.toString(num);
        for (int i = 0; i < number.length() - 1; i++) {
            int i1 = Integer.parseInt(String.valueOf(number.charAt(i)));
            int i2 = Integer.parseInt(String.valueOf(number.charAt(i + 1)));
            int pair = i1 * 10 + i2;
            if (pair > largest) {
                largest = pair;
            }
        }
        return largest;
    }
}
