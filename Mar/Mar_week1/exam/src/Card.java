public class Card {
    private String icon;
    private int cardNum;

    public Card(String icon, int cardNum) {
        setIcon(icon);
        setCardNum(cardNum);
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public String getIcon() {
        return icon;
    }

    public int getCardNum() {
        return cardNum;
    }

    public String getCardInfo() {
        String str = this.getIcon();
        str += String.valueOf(getCardNum());
        return str;
    }

    public void printCardInfo() {
        System.out.println(this.getCardInfo());
    }

    public boolean isLargerThan(Card card) {
        int compareNum = this.getCardNum() - card.getCardNum();
        if (compareNum > 0) {
            return true;
        } else if (compareNum == 0) {
            if(this.iconNum()>card.iconNum()){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    private int iconNum() {
        if (this.icon.equals("梅花")) {
            return 1;
        }
        else if (this.icon.equals("方塊")) {
            return 2;
        }
        else if (this.icon.equals("紅心")) {
            return 3;
        }
        else if (this.icon.equals("黑桃")) {
            return 4;
        }else{
            return 0;
        }
    }
}
