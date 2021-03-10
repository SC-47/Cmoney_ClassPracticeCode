public class Card{
    private static final String[] SUIT_ARRAY = {"梅花","方塊","紅心","黑桃"};
    private String suit;
    private int number;
    public Card(String suit, int number){
        this.suit = suit;
        this.number = number;
    }

    public static Card gen(int card){
        return new Card(SUIT_ARRAY[card/13],card%13+1);
    }

    public String getSuit() {
        return suit;
    }

    public int getNumber() {
        return number;
    }

    public int compareCard(Card card){
        int point1 = this.getNumber()*10+this.getSuitNum();
        int point2 = card.getNumber()*10+card.getSuitNum();
        return point1-point2;
    }

    @Override
    public String toString() {
        return getSuit()+getNumber();
    }

    private int getSuitNum(){
        for(int i=0; i < SUIT_ARRAY.length;i++){
            if(this.getSuit().equals(SUIT_ARRAY[i])){
                return i;
            }
        }
        return 0;
    }


}