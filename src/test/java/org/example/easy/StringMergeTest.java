package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringMergeTest {
    @Test
    public void stringMerge() {
        assertEquals(StringMerge.stringMerge("123hg*aaabb"), "1a2a3ahbgb");
    }
}
