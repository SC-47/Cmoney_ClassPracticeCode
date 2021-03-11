public class Point {
    private final float x;
    private final float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    private float getX() {
        return x;
    }

    private float getY() {
        return y;
    }

    public float getDistanceFrom(Point point) {
        return (float) Math.sqrt(Math.pow((getX() - point.getX()), 2) + Math.pow((getY() - point.getY()), 2));
    }

    public boolean isBetweenWith(Point a, Point b) {
        return (this.getX() >= a.getX() && this.getY() >= a.getY()) &&
                (this.getX() <= b.getX() && this.getY() <= b.getY());
    }
}
