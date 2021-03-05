public class DiceGame {
    private int diceNum;
    private WinningRule winningRule;
    private int round;

    public DiceGame(int diceNum, WinningRule winningRule, int round) {
        setDiceNum(diceNum);
        setWinningRule(winningRule);
        setRound(round);
    }

    public void setDiceNum(int diceNum) {
        this.diceNum = diceNum;
    }

    public void setWinningRule(WinningRule winningRule) {
        this.winningRule = winningRule;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public void play() {
        int player1Win = 0;
        for (int i = 0; i < round; i++) {
            int[] player1 = new int[diceNum];
            int[] player2 = new int[diceNum];
            for (int j = 0; j < diceNum; j++) {
                player1[j] = rollDice();
                player2[j] = rollDice();
            }
            printPoint("玩家1", player1);
            printPoint("玩家2", player2);
            if (winningRule.winRound(player1, player2) > 0) {
                player1Win++;
                System.out.println("該局玩家1獲勝");
            } else if (winningRule.winRound(player1, player2) < 0) {
                player1Win--;
                System.out.println("該局玩家2獲勝");
            } else {
                System.out.println("該局平手");
            }
            System.out.println("-------------------");
        }
        if (player1Win > 0) {
            System.out.println("玩家1獲勝");
        } else if (player1Win < 0) {
            System.out.println("玩家2獲勝");
        } else {
            System.out.println("平手");
        }
        System.out.println("-------------------");
    }

    private int rollDice() {
        return (int) (Math.random() * 6 + 1);
    }

    private void printPoint(String playerName, int[] player) {
        System.out.print(playerName + "點數:");
        for (int i = 0; i < player.length; i++) {
            System.out.print(" " + player[i]);
        }
        System.out.println();
    }
}
