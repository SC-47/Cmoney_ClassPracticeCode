public class Cards {
    private static final int MAX = 52;
    private final Card[] cards;
    private int dealCount;

    public Cards() {
        cards = new Card[MAX];
        for (int i = 0; i < MAX; i++) {
            cards[i] = Card.gen(i);
        }
        dealCount = 0;
    }

    public Cards shuffle() {
        for (int i = 0; i < cards.length; i++) {
            swap(i, (int) (Math.random() * 52));
        }
        return this;
    }

    public Card deal() {
        if(dealCount==MAX){
            reset();
            dealCount =0;
            shuffle();
        }
        return cards[dealCount++];
    }

    public void reset() {
        dealCount = 0;
    }

    private void swap(int a, int b) {
        Card tmp = cards[a];
        cards[a] = cards[b];
        cards[b] = tmp;
    }
}
