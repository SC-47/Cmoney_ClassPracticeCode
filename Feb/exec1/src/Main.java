import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentArr students = new StudentArr();
        int func;
        do {
            Consumer print = student -> System.out.println(student.getInfo());
            func = inputInt("功能碼(1~6)");
            switch (func) {
                case 1 -> students.add(new Student(
                        inputString("班級"),
                        inputInt("座號"),
                        inputString("姓名")
                ));
                case 2 -> System.out.println(
                        students.getBySeatNum(inputInt("座號")).getInfo()
                );

                case 3 -> {
                    Comparator scoreComparator = (student1, student2) ->
                            student1.getScore() < student2.getScore();
                    students.sort(scoreComparator).consume(print);
                }

                case 4 -> {
                    Comparator seatNumComparator = (student1, student2) ->
                            student1.getSeatNum() > student2.getSeatNum();
                    students.sort(seatNumComparator).consume(print);
                }

                case 5 -> students.getBySeatNum(
                        inputInt("座號")
                ).setScore(inputInt("成績"));

                case 6 -> System.exit(0);
            }
        } while (true);
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