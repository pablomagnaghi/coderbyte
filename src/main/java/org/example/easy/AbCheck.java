package org.example.easy;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Have the function abCheck(str) take the str parameter being passed
 * and return the string true if the characters a and b are separated by exactly 3 places
 * anywhere in the string at least once (i.e. "lane borrowed" would result in true
 * because there is exactly three characters between a and b). Otherwise, return the string false.
 */
public class AbCheck {

    public static Boolean abCheck(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' && (i + 4) < chars.length && chars[i + 4] == 'b') {
                return true;
            }
            if (chars[i] == 'b' && (i + 4) < chars.length && chars[i + 4] == 'a') {
                return true;
            }
        }
        return false;
    }

    public static Boolean abCheckPatternMather(String str) {
        Pattern pattern = Pattern.compile("(a...b|b...a)");
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? true : false;
    }
}