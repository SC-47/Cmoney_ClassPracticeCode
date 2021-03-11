import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShapeArray shapeArray = new ShapeArray();
        int func;
        do {
            func = inputInt("功能碼(1~8)");
            switch (func) {
                case 1 -> {
                    int shapeInt = inputInt("功能碼(1~3)");
                    switch (shapeInt) {
                        case 1 -> shapeArray.add(new Circle(new Point(
                                inputFloat("中心座標(x軸)"), inputFloat("中心座標(y軸)")),
                                inputFloat("半徑")));
                        case 2 -> shapeArray.add(new Rectangle(new Point(
                                inputFloat("中心座標(x軸)"), inputFloat("中心座標(y軸)")),
                                inputFloat("寬"), inputFloat("高")));
                        case 3 -> shapeArray.add(new Square(new Point(
                                inputFloat("中心座標(x軸)"), inputFloat("中心座標(y軸)")),
                                inputFloat("寬")));
                    }
                }
                case 2 -> shapeArray.getShape(inputInt("指定位置")).print();
                case 3 -> shapeArray.sort((a, b) -> a.area() > b.area()).
                        consume(Shape::print);
                case 4 -> shapeArray.sort((a, b) -> a.perimeter() > b.perimeter()).
                        consume(Shape::print);
                case 5 -> shapeArray.consume(Shape::print);
                case 6 -> System.exit(0);
                case 7 -> {
                    float distance = shapeArray.getShape(inputInt("指定位置"))
                            .getPoint().getDistanceFrom(
                                    shapeArray.getShape(inputInt("指定位置")).getPoint());
                    System.out.println(distance);
                }
                case 8 -> {
                    Point pointA = inputPoint("輸入座標(左上)");
                    Point pointB = inputPoint("輸入座標(右下)");
                    shapeArray.filter(shape -> shape.getPoint().isBetweenWith(pointA, pointB))
                            .consume(Shape::print);
                }
            }

        } while (true);
    }

    public static int inputInt(String hint) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入" + hint + ":");
        return sc.nextInt();
    }

    public static float inputFloat(String hint) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入" + hint + ":");
        return sc.nextFloat();
    }

    public static Point inputPoint(String hint) {
        System.out.println("請輸入" + hint + ":");
        return new Point(inputFloat("輸入座標(x軸)"), inputFloat("輸入座標(y軸)"));
    }
}
