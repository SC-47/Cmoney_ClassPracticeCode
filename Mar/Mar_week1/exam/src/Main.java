public class Main {
    public static void main(String[] args) {
        CardSet cardSet = new CardSet();
        cardSet.shuffle();
        Card[] cards = cardSet.playCards(4);
        for (int i = 0; i < cards.length; i++) {
            cards[i].printCardInfo();
        }
        int count = 0;
        Card maxCard = cards[0];
        do {
            if (cards[count].isLargerThan(maxCard)){
                maxCard = cards[count];
            }
            count++;
        } while (count < 4);
        System.out.println("最大張牌為:");
        maxCard.printCardInfo();
    }
}