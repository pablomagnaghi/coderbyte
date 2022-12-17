package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonRepeatingCharacterTest {
    @Test
    public void nonRepeatingCharacter() {
        assertEquals(NonRepeatingCharacter.nonRepeatingCharacter("Beauty in things exists in the mind which contemplates them"), "b");
        assertEquals(NonRepeatingCharacter.nonRepeatingCharacter("A wise man apportions his beliefs to the evidence"), "w");
        assertEquals(NonRepeatingCharacter.nonRepeatingCharacter("Aaaa"), "false");
    }
}
