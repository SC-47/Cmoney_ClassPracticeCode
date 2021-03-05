public class Main {
    private static WinningRule[] winningRules =
            {new IsLargerWin(), new IsSmallerWin(), new MoreSameWin()};

    public static void main(String[] args) {
        do {
            DiceGame diceGame = new DiceGame(
                    Input.number("骰子數量", 3, 6),
                    winningRules[Input.number("獲勝規則", 1, 3) - 1],
                    Input.oddNumber("回合數")
            );
            diceGame.play();
        } while (true);
    }
}
