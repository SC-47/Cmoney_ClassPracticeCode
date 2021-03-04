public class Circle extends Shape {
    private static final float PI = 3.1415926f;
    private float r;

    public Circle(float r, float x, float y) {
        super(x,y);
        setR(r);
    }

    private void setR(float r) {
        this.r = r;
    }

    @Override
    public float area() {
        return r * r * PI;
    }

    @Override
    public float perimeter() {
        return 2 * r * PI;
    }

    @Override
    public void print() {
        System.out.printf("圓形 => 面積: %5.2f 周長: %5.2f",this.area(),this.perimeter());
        System.out.println();
    }
}
