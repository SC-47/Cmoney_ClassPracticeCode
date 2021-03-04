public abstract class Shape {
    private Point point;
    public Shape(float x, float y){
        setPoint(x,y);
    }
    public abstract float area();

    public abstract float perimeter();

    public abstract void print();

    public void setPoint(float x, float y){
        point = new Point(x, y);
    }

    public Point getPoint() {
        return point;
    }
}
