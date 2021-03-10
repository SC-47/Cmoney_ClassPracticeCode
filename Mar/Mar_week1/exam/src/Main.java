public class Main {
    public static void main(String[] args) {
        CardSet cardSet = new CardSet();
        final int a = 4;
        Card[] cards = cardSet.shuffle().play(4);
        Card maxCard = cards[0];
        for (int i = 0; i < 4; i++) {
            System.out.println(cards[i]);
            if (maxCard.compareCard(cards[i]) < 0) {
                maxCard = cards[i];
            }
        }
        System.out.println("---------------");
        System.out.println(maxCard);
    }
}