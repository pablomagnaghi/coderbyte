package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelCountTest {

    @Test
    public void vowelCount() {
        assertEquals(VowelCount.vowelCount("I cannot sleep unless I am surrounded by books."), 13);
        assertEquals(VowelCount.vowelCount("Life itself is a quotation."), 11);
    }
}
