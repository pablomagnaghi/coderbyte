package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicativePersistenceTest {
    @Test
    public void multiplicativePersistence() {
        assertEquals(MultiplicativePersistence.multiplicativePersistence(2677889), 8);
        assertEquals(MultiplicativePersistence.multiplicativePersistence(8192), 3);
    }
}
