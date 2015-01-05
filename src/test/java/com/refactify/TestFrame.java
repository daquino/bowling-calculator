package com.refactify;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFrame {

//    @Test
//    public void test???


    @Test
    public void testScoreNoThrows() throws Exception {
        Frame f = new Frame();
        assertEquals(0, f.getScore());
    }

    @Test
    public void testAddOneThrow() throws Exception {
        Frame f = new Frame();
        f.add(5);
        assertEquals(5, f.getScore());

    }
}
