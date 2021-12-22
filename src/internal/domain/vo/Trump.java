package internal.domain.vo;

public class Trump {
    private static final String ACE = "A";
    private static final String JACK = "J";
    private static final String QUEEN = "Q";
    private static final String KING = "K";

    private Mark mark;
    private int number;

    public Trump(Mark mark, int number) {
        this.mark = mark;
        this.number = number;
    }

    public enum Mark {
        DIAMONDS,
        HEARTS,
        CLUBS,
        SPADES
    }

    public Mark mark() {
        return mark;
    }

    public int number() {
        return number;
    }

    public String rank() {
        switch (number) {
            case 1:
                return ACE;
            case 11:
                return JACK;
            case 12:
                return QUEEN;
            case 13:
                return KING;
            default:
                return Integer.valueOf(number).toString();
        }
    }
}
