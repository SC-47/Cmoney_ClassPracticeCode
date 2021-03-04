import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShapeArray shapes = new ShapeArray();
        int func;
        do {
            System.out.println("請輸入功能碼(1~6):");
            func = sc.nextInt();
            switch (func) {
                case 1:
                    System.out.println("請輸入功能碼(1~3):");
                    func = sc.nextInt();
                    switch (func) {
                        case 1:
                            System.out.println("請輸入半徑:");
                            float r = sc.nextFloat();
                            System.out.println("請輸入中心點座標(x,y):");
                            shapes.add(new Circle(r, sc.nextFloat(), sc.nextFloat()));
                            break;
                        case 2:
                            System.out.println("請輸入長與寬:");
                            float w = sc.nextFloat();
                            float h = sc.nextFloat();
                            System.out.println("請輸入中心點座標(x,y):");
                            shapes.add(new Rectangle(w, h, sc.nextFloat(), sc.nextFloat()));
                            break;
                        case 3:
                            System.out.println("請輸入寬:");
                            w = sc.nextFloat();
                            System.out.println("請輸入中心點座標(x,y):");
                            shapes.add(new Square(w, sc.nextFloat(), sc.nextFloat()));
                            break;
                        default:
                            System.out.println("輸入錯誤，退回上一步");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("請輸入位置");
                    shapes.getShape(sc.nextInt()).print();
                    break;
                case 3:
                    shapes.sort(new AreaComparator());
                    break;
                case 4:
                    shapes.sort(new PerimeterComparator());
                    break;
                case 5:
                    shapes.printAll();
                    break;
                case 6:
                    System.exit(0);
                    break;
                case 7:
                    System.out.println("請輸入兩個圖形位置");
                    float distance = shapes.getShape(sc.nextInt()).getPoint()
                            .calculateDistanceWith(shapes.getShape(sc.nextInt()).getPoint());
                    System.out.printf("兩圖形距離 = %5.2f", distance);
                    System.out.println();
                    break;
                case 8:
                    System.out.println("請輸入座標1(x,y)");
                    Point point1 = new Point (sc.nextInt() ,sc.nextInt());
                    System.out.println("請輸入座標2(x,y)");
                    Point point2 = new Point (sc.nextInt() ,sc.nextInt());
                    for(int i =0; i < shapes.getCount(); i++) {
                        if (shapes.getShape(i).getPoint().isInArea(point1, point2)) {
                            shapes.getShape(i).print();
                        }
                    }
                    break;
            }
        } while (true);
    }
}
