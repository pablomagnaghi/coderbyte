package org.example.easy;

/**
 * Have the function arithmeticGeometric(arr) take the array of numbers stored in arr
 * and return the string "Arithmetic" if the sequence follows an arithmetic pattern
 * or return "Geometric" if it follows a geometric pattern.
 * ---
 * If the sequence doesn't follow either pattern return -1.
 * An arithmetic sequence is one where the difference between
 * each of the numbers is consistent, where in a geometric sequence,
 * each term after the first is multiplied by some constant or common ratio.
 * ---
 * Arithmetic example: [2, 4, 6, 8] and Geometric example: [2, 6, 18, 54].
 * Negative numbers may be entered as parameters, 0 will not be entered,
 * and no array will contain all the same elements.
 */
public class ArithmeticGeometric {

    public static String arithmeticGeometric(int[] arr) {

        int arithmeticInterval = arr[1] - arr[0];
        int geoInterval = arr[1] / arr[0];
        int arithmeticCount = 0;
        int geoCount = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == arithmeticInterval) {
                arithmeticCount++;
            }
            if (arr[i + 1] / arr[i] == geoInterval) {
                geoCount++;
            }
        }

        if (arithmeticCount == arr.length - 1) {
            return "Arithmetic";
        }

        if (geoCount == arr.length - 1) {
            return "Geometric";
        }

        return "-1";
    }

}
