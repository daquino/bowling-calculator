package com.refactify;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestGame {

    private Game g;

    @Before
    public void setUp() throws Exception {
        g = new Game();
    }

    @Test
    public void testOneThrow() throws Exception {
        g = new Game();
        g.add(5);
        assertEquals(5, g.score());
    }

    @Test
    public void testTwoThrowsNoMark() throws Exception {
        g = new Game();
        g.add(5);
        g.add(4);
        assertEquals(9, g.score());
    }

    @Test
    public void testFourThrowsNoMark() throws Exception {
        g = new Game();
        g.add(5);
        g.add(4);
        g.add(7);
        g.add(2);
        assertEquals(18, g.score());
        assertEquals(9, g.scoreForFrame(1));
        assertEquals(18, g.scoreForFrame(2));
    }

    @Test
    public void testSimpleSpare() throws Exception {

    }
}
