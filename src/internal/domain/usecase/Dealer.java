package internal.domain.usecase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import internal.domain.vo.Trump;
import internal.domain.vo.Trump.Mark;

public class Dealer {
    private static final int FIRST_INDEX = 0;
    private static final int FIRST_TRUMP_NUMBER = 1;
    private static final int NUMBER_OF_TRUMP = 13;

    private List<Trump> cards;

    public Dealer() {
        reset();
        shuffle();
    }

    public void reset() {
        cards = new ArrayList<>();
        for (Mark mark : Mark.values()) {
            for (int i = FIRST_TRUMP_NUMBER; i <= NUMBER_OF_TRUMP; i++) {
                cards.add(new Trump(mark, i));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Trump draw() {
        return cards.remove(FIRST_INDEX);
    }
}
