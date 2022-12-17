package org.example.easy;


import org.junit.Test;

import static org.junit.Assert.*;

public class FindIntersectionTest {
    @Test
    public void findIntersection() {
        assertEquals(FindIntersection.findIntersection((new String[]{"11, 12, 14, 16, 20", "11, 12, 13, 18, 21"})), "11,12");
        assertEquals(FindIntersection.findIntersection(new String[]{"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}), "1,4,13");
        assertEquals(FindIntersection.findIntersection(new String[]{"21, 22, 23, 25, 27, 28", "21, 24, 25, 29"}), "21,25");
    }
}
