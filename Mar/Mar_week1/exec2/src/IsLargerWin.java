public class IsLargerWin implements DiceGameWinningRule {
    @Override
    public int WinGameCondition(int diceNum) {
        int player1Point = 0;
        System.out.print("玩家1點數:");
        for (int i = 0; i < diceNum; i++) {
            Dice dice = new Dice();
            int point = dice.roll();
            System.out.print(" "+String.valueOf(point));
            player1Point += point;
        }
        System.out.println("");
        int player2Point = 0;
        System.out.print("玩家2點數:");
        for (int i = 0; i < diceNum; i++) {
            Dice dice = new Dice();
            int point = dice.roll();
            System.out.print(" "+String.valueOf(point));
            player2Point += point;
        }
        System.out.println("");
        int tmp = player1Point-player2Point;
        if (tmp > 0) {
            System.out.println("當回合玩家1獲勝");
            return 1;
        } else if (tmp < 0) {
            System.out.println("當回合玩家2獲勝");
            return -1;
        } else {
            System.out.println("當回合平手");
            return 0;
        }
    }
}
