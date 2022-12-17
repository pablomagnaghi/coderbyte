package org.example.easy;

/**
 * Have the function timeConvert(num) take the num parameter being passed
 * and return the number of hours and minutes the parameter converts to
 * (i.e. if num = 63 then the output should be 1:3).
 * Separate the number of hours and minutes with a colon.
 */
public class TimeConvert {

    public static String timeConvert(int num) {
        int hours = num / 60;
        int minutes = num % 60;
        return hours + ":" + minutes;
    }
}
