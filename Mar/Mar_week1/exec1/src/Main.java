import java.util.Scanner;
public class Main {
    private static Comparator[] COMPARATOR_ARR = {new SeatNumComparator(), new ScoreComparator(), new NameComparator()};

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StudentArray students = new StudentArray();
        int func;
        do{
            System.out.println("請輸入功能碼(1~5):");
            func = sc.nextInt();
            switch(func){
                case 1:
                    System.out.println("請輸入座號:");
                    int seatNum = sc.nextInt();
                    sc.nextLine();
                    System.out.println("請輸入姓名:");
                    String name = sc.nextLine();
                    System.out.println("請輸入成績:");
                    students.add(new Student(seatNum,name,sc.nextInt()));
                    break;
                case 2:
                    System.out.println("請輸入功能碼(1~3):");
                    while(true){
                        func = sc.nextInt();
                        if(func > 0 && func <= COMPARATOR_ARR.length){
                            break;
                        }
                    }
                    students.sort(COMPARATOR_ARR[func - 1]);

                    break;
                case 3:
                    students.shuffle();
                    break;
                case 4:
                    students.printAll();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while(true);
    }
}
