public class Circle extends Shape {
    private static final float PI = 3.1415926f;
    private final float r;

    public Circle(Point point, float r) {
        super(point);
        this.r = r;
    }

    @Override
    float area() {
        return r * r * PI;
    }

    @Override
    float perimeter() {
        return 2 * PI * r;
    }

    @Override
    void print() {
        System.out.printf("圓形=> 面積: %5.2f 周長: %5.2f", area(), perimeter());
        System.out.println();
    }
}
