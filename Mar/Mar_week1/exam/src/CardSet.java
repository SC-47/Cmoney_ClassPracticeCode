public class CardSet {
    private Card[] cardSet;

    public CardSet() {
        this.cardSet = new Card[52];
        for (int i = 0; i < 13; i++) {
            this.cardSet[i] = new Card("梅花", i + 1);
        }
        for (int i = 13; i < 26; i++) {
            this.cardSet[i] = new Card("方塊", i - 12);
        }
        for (int i = 26; i < 39; i++) {
            this.cardSet[i] = new Card("紅心", i - 25);
        }
        for (int i = 39; i < 52; i++) {
            this.cardSet[i] = new Card("黑桃", i - 38);
        }
    }

    public void setCardSet(Card[] cardSet) {
        this.cardSet = cardSet;
    }

    public Card getCard(int index) {

        return cardSet[index];
    }

    public void shuffle() {
        Card[] afterShuffle = new Card[52];
        for (int i = 0; i < afterShuffle.length; i++) {
            int random;
            do {
                random = randomNum();
            } while (this.getCard(random) == null);
            afterShuffle[i] = this.getCard(random);
            this.cardSet[random] = null;
        }
        setCardSet(afterShuffle);

    }

    public Card[] playCard() {
        return playCards(1);
    }


    public Card[] playCards(int number) {
        Card[] cards = new Card[number];
        for (int i = 0; i < cards.length; i++) {
            int random;
            do {
                random = randomNum();
            } while (this.getCard(random) == null);
            cards[i] = this.getCard(random);
            this.cardSet[random] = null;
        }
        return cards;
    }

    public void printAll() {
        for (int i = 0; i < 52; i++) {
            cardSet[i].printCardInfo();
        }
    }


    public int[] randomSeries() {
        int[] randomNumSeries = new int[52];
        for (int i = 0; i < randomNumSeries.length; i++) {
            randomNumSeries[i] = -1;
        }
        for (int i = 0; i < randomNumSeries.length; i++) {
            boolean repeat;
            int randomInput;
            do {
                randomInput = randomNum();
                repeat = false;
                for (int j = 0; j < randomNumSeries.length; j++) {
                    if (randomNumSeries[j] == randomInput) {
                        repeat = true;
                        break;
                    }
                }
            } while (repeat);
            randomNumSeries[i] = randomInput;
        }
        return randomNumSeries;
    }

    public int randomNum() {
        double random = Math.random();
        int output = (int) (Math.random() * 52);
        return output;
    }
}
