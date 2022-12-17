package org.example.easy;

/**
 * Have the function superIncreasing(arr) take the array of numbers stored in arr
 * and determine if the array forms a super increasing sequence
 * where each element in the array is greater than the sum of all previous elements.
 * The array will only consist of positive integers.
 * For example: if arr is [1, 3, 6, 13, 54] then your program
 * should return the string "true" because it forms a super increasing sequence.
 * If a super increasing sequence isn't formed, then your program
 * should return the string "false"
 */
public class SuperIncreasing {
    public static boolean superIncreasing(int[] arr) {
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > sum) {
                sum += arr[i];
            } else {
                return false;
            }
        }
        return true;
    }
}
