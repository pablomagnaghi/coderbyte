package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryReversalTest {

    @Test
    public void binaryReversal() {
        assertEquals(BinaryReversal.binaryReversal("47"), 244);
        assertEquals(BinaryReversal.binaryReversal("2"), 64);
        assertEquals(BinaryReversal.binaryReversal("2000000"), 74104);

    }
}
