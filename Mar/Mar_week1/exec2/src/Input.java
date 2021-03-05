import java.util.Scanner;

public class Input {
    public static int number(String hint, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println("請選擇" + hint + "(" + min + "~" + max + "):");
            input = sc.nextInt();
        } while (input < min || input > max);
        return input;
    }

    public static int oddNumber(String hint) {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println("請選擇" + hint + "(大於0的奇數):");
            input = sc.nextInt();
        } while (input < 0 || input % 2 == 0);
        return input;
    }
}
