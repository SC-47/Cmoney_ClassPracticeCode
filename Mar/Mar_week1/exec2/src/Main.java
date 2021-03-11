import java.util.Scanner;

public class Main {
    public static final WinningRule[] WINNING_RULES = {
            new IsLargerWin(), new IsSmallerWin(), new IsMoreSameWin()
    };

    public static void main(String[] args) {
        do {
            DiceGame diceGame = new DiceGame(
                    inputInt("骰子數量", 3, 6),
                    WINNING_RULES[inputInt("獲勝條件", 1, 3) - 1],
                    inputOddNum("回合數"));
            diceGame.play();
        }
        while (true);
    }

    public static int inputInt(String hint, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int output;
        do {
            System.out.println("請選擇" + hint + "(" + min + "~" + max + ")");
            output = sc.nextInt();
        } while (output < min || output > max);
        return output;
    }

    public static int inputOddNum(String hint) {
        Scanner sc = new Scanner(System.in);
        int output;
        do {
            System.out.println("請選擇" + hint + "(大於0的奇數):");
            output = sc.nextInt();
        } while (output < 0 || output % 2 == 0);
        return output;
    }
}
