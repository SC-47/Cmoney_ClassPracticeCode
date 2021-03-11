public class CardPlayer {
    private final String name;
    private int money;
    private Card card;

    public CardPlayer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public Card getCard() {
        return card;
    }

    public int placeBet(int bet) {
        if (bet < 0 || bet > money) {
            return -1;
        }
        money -= bet;
        return bet;
    }

    public void addMoney(int winningBet) {
        this.money += winningBet;
    }
}
