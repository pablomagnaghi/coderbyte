package org.example.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RunLengthTest {
    @Test
    public void runLength() {
        assertEquals(RunLength.runLength("ultrarevolutionaries"), "1u1l1t1r1a1r1e1v1o1l1u1t1i1o1n1a1r1i1e1s");
        assertEquals(RunLength.runLength("underworld"), "1u1n1d1e1r1w1o1r1l1d");
        assertEquals(RunLength.runLength("wwwggopp"), "3w2g1o2p");
    }
}
