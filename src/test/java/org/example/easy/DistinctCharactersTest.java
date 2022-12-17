package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class DistinctCharactersTest {
    @Test
    public void distinctCharacters() {
        assertTrue(DistinctCharacters.distinctCharacters("12334bbmma:=6"));
        assertFalse(DistinctCharacters.distinctCharacters("001122334455667788"));
    }
}
