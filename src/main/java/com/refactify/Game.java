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
            if (pins == 10)
                advanceFrame();
            else
                firstThrowInFrame = false;
        }
        else {
            firstThrowInFrame = true;
            advanceFrame();
        }
        itsCurrentFrame = Math.min(11, itsCurrentFrame);
    }

    private void advanceFrame() {
        itsCurrentFrame = Math.min(11, itsCurrentFrame+1);
    }

    public int score() {
        return scoreForFrame(getCurrentFrame() - 1);
    }

    public int scoreForFrame(int theFrame) {
        return itsScorer.scoreForFrame(theFrame);
    }

    public int getCurrentFrame() {
        return itsCurrentFrame;
    }
}
