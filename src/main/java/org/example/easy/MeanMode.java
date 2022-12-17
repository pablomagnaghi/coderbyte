package org.example.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Have the function meanMode(arr) take the array of numbers stored in arr
 * and return 1 if the mode equals the mean, 0 if they don't equal each other
 * (i.e. [5, 3, 3, 3, 1] should return 1 because the mode (3) equals the mean (3)).
 * The array will not be empty, will only contain positive integers,
 * and will not contain more than one mode.
 */
public class MeanMode {
    public static String meanMode(int[] arr) {
        int sum = 0;
        int modeKey = 0;
        int modeVal = 0;

        Map<Integer, Integer> modeMap = new HashMap<>();
        for (int item : arr) {
            modeMap.put(item, 0);
        }

        for (int value : arr) {
            sum += value;
            int val = modeMap.get(value);
            if (val > 0) {
                modeMap.put(value, val + 1);
            } else {
                modeMap.put(value, 1);
            }
        }

        for (Map.Entry<Integer, Integer> item : modeMap.entrySet()) {
            int itemKey = item.getKey();
            int itemVal = item.getValue();
            if (itemVal > modeVal) {
                modeVal = itemVal;
                modeKey = itemKey;
            }
        }

        return modeKey == (sum / arr.length) ? "1" : "0";
    }
}
