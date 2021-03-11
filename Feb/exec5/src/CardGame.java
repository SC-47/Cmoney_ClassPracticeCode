public class CardGame {
    private Cards cards;
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

    public void start(int round){

    }

    private void doubleArray() {
        CardPlayer[] tmp = new CardPlayer[players.length * 2];
        for (int i = 0; i < players.length; i++) {
            tmp[i] = players[i];
        }
        tmp = players;
    }


}
