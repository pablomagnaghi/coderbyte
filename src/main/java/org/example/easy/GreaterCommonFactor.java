package org.example.easy;

/**
 * Have the function greaterCommonFactor(arr) take the array of numbers stored in arr
 * which will always contain only two positive integers,
 * and return the greatest common factor of them.
 * ---
 * For example: if arr is [45, 12] then your program should return 3.
 * There will always be two elements in the array,
 * and they will be positive integers.
 */
public class GreaterCommonFactor {

    public static int greaterCommonFactor(int[] arr) {
        if (arr[0] == 0 || arr[1] == 0) {
            return arr[0] + arr[1];
        }
        return greaterCommonFactor(new int[]{arr[1], arr[0] % arr[1]});
    }
}
