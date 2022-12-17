package org.example.easy;

/**
 * Have the function findIntersection(strArr) read the array of strings
 * stored in strArr which will contain 2 elements: the first element
 * will represent a list of comma-separated numbers sorted in ascending order,
 * the second element will represent a second list of comma-separated numbers (also sorted).
 * Your goal is to return a comma-separated string containing
 * the numbers that occur in elements of strArr in sorted order.
 * If there is no intersection, return the string false.
 */
public class FindIntersection {
    private static int binarySearch(Integer[] coll, Integer key) {
        int lo = 0;
        int hi = coll.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < coll[mid]) {
                hi = mid - 1;
            } else if (key > coll[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private static Integer[] toIntArray(String strArr) {
        String[] tmpArr = strArr.split(", ");
        Integer[] intArr = new Integer[tmpArr.length];
        for (int i = 0; i < tmpArr.length; i++) {
            intArr[i] = Integer.parseInt(tmpArr[i].trim());
        }
        return intArr;
    }

    public static String findIntersection(String[] arr) {
        Integer[] arr1 = toIntArray(arr[0]);
        Integer[] arr2 = toIntArray(arr[1]);
        StringBuilder builder = new StringBuilder();
        for (int i : arr1.length > arr2.length ? arr2 : arr1) {
            int findIndex = binarySearch(arr1.length > arr2.length ? arr1 : arr2, i);
            if (findIndex > -1) {
                builder.append(i).append(",");
            }
        }
        String result = builder.toString();
        return result.length() == 0 ? "false" : builder.substring(0, result.length() - 1);
    }
}
