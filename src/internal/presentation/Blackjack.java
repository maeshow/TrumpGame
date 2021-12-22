package internal.presentation;

import internal.domain.usecase.Dealer;

public class Blackjack {
    private static final int ACE_NUMBER = 1;
    private static final int JACK_NUMBER = 11;
    private static final int QUEEN_NUMBER = 12;
    private static final int KING_NUMBER = 13;
    private static final int ONE_POINT = 1;
    private static final int TEN_POINT = 10;
    private static final int ELEVEN_POINT = 11;
    private static final int BUST_NUMBER = 21;

    private final Dealer dealer;

    public Blackjack() {
        dealer = new Dealer();
    }

    public int computeScore(int currentScore, int trumpNumber) {
        int score = currentScore;
        switch (trumpNumber) {
            case ACE_NUMBER:
                if (isBust(score + ELEVEN_POINT)) {
                    return score += ONE_POINT;
                }
                return score += ELEVEN_POINT;
            case JACK_NUMBER:
            case QUEEN_NUMBER:
            case KING_NUMBER:
                return score += TEN_POINT;
            default:
                return score += trumpNumber;
        }
    }

    private boolean isBust(int score) {
        return BUST_NUMBER < score;
    }
}
