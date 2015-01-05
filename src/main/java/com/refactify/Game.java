package com.refactify;

public class Game {
    private int itsCurrentFrame = 1;
    private boolean firstThrowInFrame = true;
    private Scorer itsScorer = new Scorer();

    public void add(final int pins) {
        itsScorer.addThrow(pins);
        adjustCurrentFrame(pins);
    }

    private void adjustCurrentFrame(int pins) {
        if (firstThrowInFrame == true) {
            if (adjustFrameForStrike(pins) == false)
                firstThrowInFrame = false;
        }
        else {
            firstThrowInFrame = true;
            advanceFrame();
        }
    }

    private boolean adjustFrameForStrike(final int pins) {
        if(pins == 10) {
            advanceFrame();
            return true;
        }
        return false;
    }

    private void advanceFrame() {
        itsCurrentFrame = Math.min(10, itsCurrentFrame+1);
    }

    public int score() {
        return scoreForFrame(itsCurrentFrame);
    }

    public int scoreForFrame(int theFrame) {
        return itsScorer.scoreForFrame(theFrame);
    }
}
