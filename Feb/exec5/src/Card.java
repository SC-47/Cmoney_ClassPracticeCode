public class Card {
    public static final String[] SUIT_ARRAY = {"梅花", "方塊", "紅心", "黑桃"};
    private final String suit;
    private final int point;

    public Card(String suit, int point) {
        this.suit = suit;
        this.point = point;
    }

    public String getSuit() {
        return suit;
    }

    public int getPoint() {
        return point;
    }

    public static Card gen(int c) {
        return new Card(SUIT_ARRAY[c / 13], c % 13 + 1);
    }

    public int compare(Card card) {
        return this.getCardInt() - card.getCardInt();
    }

    public int getCardInt() {
        int cardInt = getPoint() * 10;
        for (int i = 0; i < 3; i++) {
            if (this.getSuit().equals(SUIT_ARRAY[i])) {
                cardInt += i;
            }
        }
        return cardInt;
    }

    @Override
    public String toString() {
        return getSuit() + getPoint();
    }
}
