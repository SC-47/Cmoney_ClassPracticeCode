public class CardSet {
    public static final int MAX = 52;
    private Card[] cardSet;

    public CardSet() {
        cardSet = new Card[MAX];
        for (int i = 0; i < MAX; i++) {
            cardSet[i] = Card.gen(i);
        }
    }

    public CardSet shuffle() {
        for (int i = 0; i < MAX; i++) {
            swap(i, randomNum());
        }
        return this;
    }

    public Card[] play(int cardNum) {
        Card[] cards = new Card[cardNum];
        for (int i = 0; i < cardNum; i++) {
            cards[i] = cardSet[i];
        }
        return cards;
    }

    private void swap(int a, int b) {
        Card tmp = cardSet[a];
        cardSet[a] = cardSet[b];
        cardSet[b] = tmp;
    }

    private int randomNum() {
        return (int) (Math.random() * 52);
    }
}