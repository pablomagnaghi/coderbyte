package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdditivePersistenceTest {

    @Test
    public void additivePersistence() {
        assertEquals(AdditivePersistence.additivePersistence(2718), 2);
        assertEquals(AdditivePersistence.additivePersistence(199), 3);
        assertEquals(AdditivePersistence.additivePersistence(913), 2);
    }
}
