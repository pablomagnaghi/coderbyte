package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwapCaseTest {

    @Test
    public void swapCase() {
        assertEquals(SwapCase.swapCase("The Livin' Free EP"), "tHE lIVIN' fREE ep");
        assertEquals(SwapCase.swapCase("Selected MP3"), "sELECTED mp3");
    }
}
