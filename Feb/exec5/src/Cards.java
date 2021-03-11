public class Cards {
    private static final int MAX = 52;
    private Card[] cards;
    private int dealCount;

    public Cards() {
        cards = new Card[MAX];
        dealCount = 0;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            swap(i, (int) (Math.random() * 52));
        }
    }

    public Card deal(){
        return cards[dealCount++];
    }

    public void reset(){
        dealCount = 0;
    }



    public void consume(Consumer consumer) {
        for (int i = 0; i < cards.length; i++) {
            consumer.accept(cards[i]);
        }
    }

    private void swap(int a, int b) {
        Card tmp = cards[a];
        cards[a] = cards[b];
        cards[b] = tmp;
    }
}
