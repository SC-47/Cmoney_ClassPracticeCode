public abstract class Shape {
    private final Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    abstract float area();

    abstract float perimeter();

    abstract void print();
}
