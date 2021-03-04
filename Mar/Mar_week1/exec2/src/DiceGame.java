public class DiceGame {
    private int diceNum;
    private int winRule;
    private int round;

    public void setDiceNum(int diceNum) {
        this.diceNum = diceNum;
    }

    public void setWinRule(int winRule) {
        this.winRule = winRule;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int getDiceNum() {
        return diceNum;
    }

    public int getWinRule() {
        return winRule;
    }

    public int getRound() {
        return round;
    }

    public void playGame() {
        switch (winRule) {
            case 1:
                DiceGameWinningRule win = new IsLargerWin();
                int player1win = 0;
                for (int i =0; i < getRound(); i++){
                    player1win += win.WinGameCondition(diceNum);
                }
                if (player1win > 0){
                    System.out.println("該局玩家1獲勝");
                }else if (player1win <0){
                    System.out.println("該局玩家2獲勝");
                }else{
                    System.out.println("該局平手");
                }
                break;
            case 2:
                win = new IsSmallerWin();
                player1win = 0;
                for (int i =0; i < getRound(); i++){
                    player1win += win.WinGameCondition(diceNum);
                }
                if (player1win > 0){
                    System.out.println("該局玩家1獲勝");
                }else if (player1win <0){
                    System.out.println("該局玩家2獲勝");
                }else{
                    System.out.println("該局平手");
                }
                break;
            case 3:
                win = new IsMoreSameWin();
                player1win = 0;
                for (int i =0; i < getRound(); i++){
                    player1win += win.WinGameCondition(diceNum);
                }
                if (player1win > 0){
                    System.out.println("該局玩家1獲勝");
                }else if (player1win <0){
                    System.out.println("該局玩家2獲勝");
                }else{
                    System.out.println("該局平手");
                }
                break;
        }
        for (int i = 0; i < round; i++) {

        }
    }

}
