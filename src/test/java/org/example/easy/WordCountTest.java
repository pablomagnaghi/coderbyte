package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCountTest {
    @Test
    public void wordCount() {
        assertEquals(WordCount.wordCount("The mind was dreaming. The world was its dream."), 9);
        assertEquals(WordCount.wordCount("I have always imagined that Paradise will be a kind of library."), 12);
    }
}
