import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiceGame diceGame = new DiceGame();
        int func;
        do {
            System.out.println("請輸入功能碼");
            func = sc.nextInt();
            switch (func) {
                case 1:
                    System.out.println("請輸入骰子數量(3~6):");
                    diceGame.setDiceNum(Input.number(3, 6));
                    System.out.println("請輸入獲勝條件(1~3):");
                    diceGame.setWinRule(Input.number(1, 3));
                    System.out.println("請輸入回合數(請輸入大於0的奇數):");
                    diceGame.setRound(Input.oddNumber());
                    diceGame.playGame();
                    break;
                default:
                    System.exit(0);
            }
        } while (true);
    }
}
