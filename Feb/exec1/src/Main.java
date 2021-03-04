import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int func;
        StudentArr students = new StudentArr();
        do {
            System.out.println("請輸入功能碼:");
            func = sc.nextInt();
            sc.nextLine();
            switch (func) {
                case 1:
                    System.out.println("請輸入班級:");
                    String className = sc.nextLine();
                    System.out.println("請輸入座號:");
                    int seatNum = sc.nextInt();
                    sc.nextLine();
                    System.out.println("請輸入姓名:");
                    String name = sc.nextLine();
                    students.add(new Student(className, seatNum, name));
                    break;
                case 2:
                    System.out.println("請輸入座號:");
                    students.queryBySeatNum(sc.nextInt()).printAll();
                    break;
                case 3:
                    for (int i = 0; i < students.getStudentNum() - 1; i++) {
                        for (int j = 0; j < students.getStudentNum() - 1 - i; j++) {
                            if (students.getStudent(j).getScore()
                                    < students.getStudent(j + 1).getScore()) {
                                students.swap(j, j + 1);
                            }
                        }
                    }
                    students.printAll();
                    break;
                case 4:
                    for (int i = 0; i < students.getStudentNum() - 1; i++) {
                        for (int j = 0; j < students.getStudentNum() - 1 - i; j++) {
                            if (students.getStudent(j).getSeatNum()
                                    > students.getStudent(j + 1).getSeatNum()) {
                                students.swap(j, j + 1);
                            }
                        }
                    }
                    students.printAll();
                    break;
                case 5:
                    System.out.println("請輸入座號:");
                    StudentArr tmp = students.queryBySeatNum(sc.nextInt());
                    for (int i = 0; i < tmp.getStudentNum(); i++) {
                        tmp.getStudent(i).print();
                        System.out.println("請輸入更改後成績:");
                        tmp.getStudent(i).setScore(sc.nextInt());
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                case 7:
                    students.printAll();

            }

        } while (true);
    }
}
