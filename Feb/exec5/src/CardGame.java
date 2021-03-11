public class CardGame {
    private final Cards cards;
    private CardPlayer[] players;
    private int playerNum;

    public CardGame() {
        cards = new Cards();
        players = new CardPlayer[2];
        playerNum = 0;
    }

    public void addPlayer(CardPlayer player) {
        if (playerNum == players.length) {
            doubleArray();
        }
        players[playerNum++] = player;
    }

    public void start(int round) {
        if (playerNum == 0) {
            System.out.println("錯誤");
            return;
        }
        cards.shuffle();
        for (int i = 0; i < round; i++) {
            int bet = 0;
            Card maxCard = new Card("梅花", 0);
            int winningPlayer = -1;
            for (int j = 0; j < playerNum; j++) {
                if (players[j].getMoney() == 0) {
                    continue;
                }
                System.out.println(players[j].getName() + " 剩餘金額:" + players[j].getMoney());
                bet += players[j].placeBet(Main.inputInt("下注金額"));
                players[j].setCard(cards.deal());
                if (maxCard.compare(players[j].getCard()) < 0) {
                    maxCard = players[j].getCard();
                    winningPlayer = j;
                }
            }
            for (int j = 0; j < playerNum; j++) {
                if (players[j].getCard() == null) {
                    continue;
                }
                System.out.println(players[j].getName() + " 手牌:" + players[j].getCard());
                players[j].setCard(null);
            }
            players[winningPlayer].addMoney(bet);
            System.out.println("該回合" + players[winningPlayer].getName() + "獲勝");
        }

        int maxMoney = 0;
        for (int i = 0; i < playerNum; i++) {
            if (maxMoney < players[i].getMoney()) {
                maxMoney = players[i].getMoney();
            }
        }
        for (int i = 0; i < playerNum; i++) {
            if (maxMoney == players[i].getMoney()) {
                System.out.println(players[i].getName() + " 贏得遊戲");
            }
        }
    }

    private void doubleArray() {
        CardPlayer[] tmp = new CardPlayer[players.length * 2];
        for (int i = 0; i < players.length; i++) {
            tmp[i] = players[i];
        }
        players = tmp;
    }
}
