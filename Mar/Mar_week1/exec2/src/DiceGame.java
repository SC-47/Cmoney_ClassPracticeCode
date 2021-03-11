public class DiceGame {
    private final int diceNum;
    private final WinningRule winningRule;
    private final int round;

    public DiceGame(int diceNum, WinningRule winningRule, int round) {
        this.diceNum = diceNum;
        this.winningRule = winningRule;
        this.round = round;
    }

    public void play() {
        int player1Win = 0;
        int[] player1Dice = new int[diceNum];
        int[] player2Dice = new int[diceNum];
        for (int i = 0; i < round; i++) {
            for (int j = 0; j < diceNum; j++) {
                player1Dice[j] = rollDice();
                player2Dice[j] = rollDice();
            }
            printDice(1, player1Dice);
            printDice(2, player2Dice);
            if (winningRule.win(player1Dice, player2Dice) > 0) {
                System.out.println("該回合玩家1獲勝");
                System.out.println("---------------------");
                player1Win++;
            } else if (winningRule.win(player1Dice, player2Dice) < 0) {
                System.out.println("該回合玩家2獲勝");
                System.out.println("---------------------");
                player1Win--;
            } else {
                System.out.println("該回合平手");
                System.out.println("---------------------");
            }
        }
        if (player1Win > 0) {
            System.out.println("玩家1獲勝");
        } else if (player1Win < 0) {
            System.out.println("玩家2獲勝");
        } else {
            System.out.println("平手");
        }
        System.out.println("---------------------");
    }

    private int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    private void printDice(int player, int[] playerDice) {
        System.out.print("玩家" + player + "點數:");
        for (int i = 0; i < playerDice.length; i++) {
            System.out.print(" " + playerDice[i]);
        }
        System.out.println();
    }
}
