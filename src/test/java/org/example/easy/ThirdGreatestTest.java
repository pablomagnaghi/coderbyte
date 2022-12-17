package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThirdGreatestTest {

    @Test
    public void thirdGreatest() {
        assertEquals(ThirdGreatest.thirdGreatest(new String[]{"flowers", "decorate", "soul", "sleep"}), "sleep");
        assertEquals(ThirdGreatest.thirdGreatest(new String[]{"surrounded", "darkness", "awakened", "within"}), "awakened");
        assertEquals(ThirdGreatest.thirdGreatest(new String[]{"hello", "world", "after", "all"}), "after");
    }

    @Test
    public void thirdGreatestWithStream() {
        assertEquals(ThirdGreatest.thirdGreatestWithStream(new String[]{"flowers", "decorate", "soul", "sleep"}), "sleep");
        assertEquals(ThirdGreatest.thirdGreatestWithStream(new String[]{"surrounded", "darkness", "awakened", "within"}), "awakened");
        assertEquals(ThirdGreatest.thirdGreatestWithStream(new String[]{"hello", "world", "after", "all"}), "after");
    }
}

