package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckNumsTest {
    @Test
    public void checkNums() {
        assertEquals(CheckNums.checkNums(63, 16), "false");
        assertEquals(CheckNums.checkNums(50, 50), "-1");
        assertEquals(CheckNums.checkNums(70, 60), "false");
    }
}
