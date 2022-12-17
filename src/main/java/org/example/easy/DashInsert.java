package org.example.easy;


/**
 * Have the function dashInsert(str) insert dashes ('-')
 * between each two odd numbers in str. For example:
 * if str is 454793 the output should be 4547-9-3.
 * Don't count zero as an odd number.
 */
public class DashInsert {
    public static String dashInsert(String str) {
        StringBuilder dashed = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = 1; i < chars.length + 1; i++) {
            int c1 = Character.getNumericValue(chars[i - 1]);
            int c2 = i < chars.length ? Character.getNumericValue(chars[i]) : 0;
            dashed.append(c1);
            if (c1 % 2 != 0 && c2 % 2 != 0) {
                dashed.append("-");
            }
        }
        return dashed.toString();
    }
}
