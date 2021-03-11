public class Square extends Shape {
    private final float w;

    public Square(Point point, float w) {
        super(point);
        this.w = w;
    }

    @Override
    float area() {
        return w * w;
    }

    @Override
    float perimeter() {
        return 4 * w;
    }

    @Override
    void print() {
        System.out.printf("正方形=> 面積: %5.2f 周長: %5.2f", area(), perimeter());
        System.out.println();
    }
}
