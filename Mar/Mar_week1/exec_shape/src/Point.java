public class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        setX(x);
        setY(y);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float calculateDistanceWith(Point a) {
        return (float) Math.sqrt(Math.pow((a.getX() - this.getX()), 2) + Math.pow((a.getY() - this.getY()), 2));
    }

    public boolean isInArea(Point a, Point b) {
        if (this.x >= Math.min(a.getX(), b.getX()) && this.x <= Math.max(a.getX(), b.getX()) &&
                this.y >= Math.min(a.getY(), b.getY()) && this.y <= Math.max(a.getY(), b.getY())) {
            return true;
        } else {
            return false;
        }
    }
}
