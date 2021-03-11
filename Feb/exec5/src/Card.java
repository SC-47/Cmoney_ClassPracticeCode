public class Card {
    private String suit;
    private int point;

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

    public Card (int c){

    }

    @Override
    public String toString() {
        return getSuit() + getPoint();
    }
}
