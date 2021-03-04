import java.util.Scanner;

public class Input {

    public static int number(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            input = sc.nextInt();
            if (input >= min && input <= max) {
                return input;
            }
            System.out.println("輸入數值超出範圍，請重新輸入:");
        } while (true);

    }

    public static int oddNumber() {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            input = sc.nextInt();
            if (input > 0 && (input - 1) % 2 == 0) {
                return input;
            }
            System.out.println("輸入錯誤數值，請重新輸入:");
        } while (true);

    }
}
