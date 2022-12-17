package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeConvertTest {

    @Test
    public void timeConvert() {
        assertEquals(TimeConvert.timeConvert(63), "1:3");
        assertEquals(TimeConvert.timeConvert(178), "2:58");
        assertEquals(TimeConvert.timeConvert(249), "4:9");
    }
}
