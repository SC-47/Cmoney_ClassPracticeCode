import java.util.Scanner;

public class Main {
    private static final Comparator[] comparators = {new SeatNumComparator(), new ScoreComparator(), new NameComparator()};
    private static final Mapper[] mappers = {new PrintMapper()};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentArray students = new StudentArray();
        int func;
        do {
            System.out.println("請輸入功能碼(1~5):");
            func = sc.nextInt();
            sc.nextLine();
            switch (func) {
                case 1:
                    System.out.println("請輸入座號:");
                    int seatNum = sc.nextInt();
                    sc.nextLine();
                    System.out.println("請輸入姓名:");
                    String name = sc.nextLine();
                    System.out.println("請輸入成績:");
                    students.add(new Student(seatNum, name, sc.nextInt()));
                    sc.nextLine();
                    break;
                case 2:
                    do {
                        System.out.println("請輸入功能碼(1~3):");
                        func = sc.nextInt();
                        sc.nextLine();
                    } while (func <= 0 || func > comparators.length);
                    students.sort(comparators[func - 1]);
                    break;
                case 3:
                    students.shuffle();
                    break;
                case 4:
                    students.map(mappers[0]);
                    System.out.println("------------");
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}