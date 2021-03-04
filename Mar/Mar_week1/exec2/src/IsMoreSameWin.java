public class IsMoreSameWin implements DiceGameWinningRule {
    @Override
    public int WinGameCondition(int diceNum) {
        int[] point1Count = new int[6];
        for (int i = 0; i < point1Count.length; i++) {
            point1Count[i] = 0;
        }
        System.out.print("玩家1點數:");
        for (int i = 0; i < diceNum; i++) {
            Dice dice = new Dice();
            int point = dice.roll();
            System.out.print(" " + String.valueOf(point));
            point1Count[point - 1]++;
        }
        int maxPoint1Count = 0;
        for (int i = 0; i < diceNum; i++) {
            if (maxPoint1Count < point1Count[i])
                maxPoint1Count = point1Count[i];
        }
        System.out.println("");
        int[] point2Count = new int[6];
        for (int i = 0; i < point2Count.length; i++) {
            point2Count[i] = 0;
        }
        System.out.print("玩家2點數:");
        for (int i = 0; i < diceNum; i++) {
            Dice dice = new Dice();
            int point = dice.roll();
            System.out.print(" " + String.valueOf(point));
            point2Count[point - 1]++;
        }
        int maxPoint2Count = 0;
        for (int i = 0; i < diceNum; i++) {
            if (maxPoint2Count < point2Count[i])
                maxPoint2Count = point2Count[i];
        }
        System.out.println("");
        if (maxPoint1Count > maxPoint2Count) {
            System.out.println("當回合玩家1獲勝");
            return 1;
        } else if (maxPoint1Count < maxPoint2Count) {
            System.out.println("當回合玩家2獲勝");
            return -1;
        } else {
            System.out.println("當回合平手");
            return 0;
        }
    }

}
