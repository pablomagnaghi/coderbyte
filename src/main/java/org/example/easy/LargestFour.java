package org.example.easy;

/**
 * Have the function largestFour(arr) take the array of integers stored in arr,
 * and find the four largest elements and return their sum.
 * --
 * For example: if arr is [4, 5, -2, 3, 1, 2, 6, 6]
 * then the four largest elements in this array are 6, 6, 4, and 5
 * and the total sum of these numbers is 21, so your program should return 21.
 * --
 * If there are less than four numbers in the array your program
 * should return the sum of all the numbers in the array.
 */
public class LargestFour {
    private static int[] bubbleSort(int[] array) {
        if (array.length == 0) {
            return new int[]{};
        }
        boolean isSorted = false;
        int counter = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1 - counter; i++) {
                if (array[i] > array[i + 1]) {
                    swap(i, i + 1, array);
                    isSorted = false;
                }
            }
            counter++;
        }
        return array;
    }

    private static void swap(int i, int j, int[] array) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

    public static int largestFour(int arr[]) {
        int total = 0;
        int size = arr.length;
        if (size <= 4) {
            for (int x = 0; x < size; x++) {
                total += arr[x];
            }
            return total;
        }
        // Sort our input
        bubbleSort(arr);
        int count = 0;
        for (int x = size - 1; count < 4; count++, x--) {
            total += arr[x];
        }
        return total;
    }
}
