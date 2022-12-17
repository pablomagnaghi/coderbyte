package org.example.easy;

import java.util.Arrays;

import static java.lang.Math.pow;

/**
 * Have the function arrayAdditionOne(arr) take the array of numbers stored in arr
 * and return the string true if any combination of numbers in the array
 * (excluding the largest number) can be added up to equal the largest number in the array,
 * otherwise return the string false.
 * ---
 * For example: if arr contains [4, 6, 23, 10, 1, 3] the output
 * should return true because 4 + 6 + 10 + 3 = 23.
 * ---
 * The array will not be empty, will not contain all the same elements,
 * and may contain negative numbers.
 */
public class ArrayAdditionOne {

    private static String padLeft(String str, int len) {
        return String.format("%" + len + "s", str).replace(" ", "0");
    }

    public static boolean arrayAdditionOne(int[] arr) {
        Arrays.sort(arr);
        int largest = arr[arr.length - 1];
        int oneChar = "1".charAt(0);

        for (int i = 0; i < pow(2, arr.length); i++) {
            String bin = Integer.toBinaryString(i);
            String combo = padLeft(bin, arr.length - 1);
            int sum = 0;
            for (int j = 0; j < combo.length(); j++) {
                if (combo.charAt(j) == oneChar) {
                    sum += arr[j];
                }
                if (sum == largest) {
                    return true;
                }
            }
        }

        return false;
    }
}
