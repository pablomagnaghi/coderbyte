package org.example.easy;

/**
 * Have the function bitwiseOne(strArr) take the array of strings stored in strArr,
 * which will only contain two strings of equal length that represent binary numbers,
 * and return a final binary string that performed the bitwise OR operation
 * on both strings.
 * ---
 * A bitwise OR operation places a 0 in the new string
 * where there are zeroes in both binary strings,
 * otherwise it places a 1 in that spot.
 * ---
 * For example: if strArr is ["1001", "0100"] then your program
 * should return the string "1101"
 */
public class BitwiseOne {

    public static String bitwiseOne(String[] strArr) {
        String s1 = strArr[0];
        String s2 = strArr[1];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            int lgOr = Character.getNumericValue(s1.charAt(i)) | Character.getNumericValue(s2.charAt(i));
            result.append(lgOr);
        }
        return result.toString();
    }
}
