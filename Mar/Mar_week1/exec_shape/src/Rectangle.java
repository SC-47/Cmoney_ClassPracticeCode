public class Rectangle extends Shape {
    private final float w;
    private final float h;

    public Rectangle(Point point, float w, float h) {
        super(point);
        this.w = w;
        this.h = h;
    }

    @Override
    float area() {
        return w * h;
    }

    @Override
    float perimeter() {
        return 2 * (w + h);
    }

    @Override
    void print() {
        System.out.printf("長方形=> 面積: %5.2f 周長: %5.2f",area(),perimeter());
        System.out.println();
    }
}
