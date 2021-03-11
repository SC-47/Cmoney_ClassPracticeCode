import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CardGame cardGame = new CardGame();
        cardGame.addPlayer(
                    new CardPlayer(inputString("玩家姓名"), inputInt("持有金額"))
            );
        cardGame.addPlayer(
                new CardPlayer(inputString("玩家姓名"), inputInt("持有金額"))
        );
        cardGame.addPlayer(
                new CardPlayer(inputString("玩家姓名"), inputInt("持有金額"))
        );
        cardGame.start(inputInt("遊玩回合數"));
    }

    public static int inputInt(String hint) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入" + hint + ":");
        return sc.nextInt();
    }

    public static String inputString(String hint) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入" + hint + ":");
        return sc.nextLine();
    }
}
