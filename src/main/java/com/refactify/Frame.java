package com.refactify;

public class Frame {
    private int itsScore = 0;
    public int getScore() {
        return itsScore;
    }

    public void add(final int pins) {
        itsScore += pins;
    }
}
