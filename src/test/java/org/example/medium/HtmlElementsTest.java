package org.example.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HtmlElementsTest {

    @Test
    public void htmlElements() {
        assertEquals(HtmlElements.htmlElements("<div><b><p>hello world</p></b></div>"), "true");
        assertEquals(HtmlElements.htmlElements("<div><b><p>hello world</b></div>"), "p");
    }

}