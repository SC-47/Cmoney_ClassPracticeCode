public class Rectangle extends Shape{
    private float w;
    private float h;

    public Rectangle(float w, float h, float x, float y){
        super(x,y);
        setW(w);
        setH(h);
    }

    private void setW(float w) {
        this.w = w;
    }

    private void setH(float h) {
        this.h = h;
    }

    @Override
    public float area() {
        return w*h;
    }

    @Override
    public float perimeter() {
        return 2*(w+h);
    }

    @Override
    public void print() {
        System.out.printf("長方形=> 面積: %5.2f 周長: %5.2f",this.area(),this.perimeter());
        System.out.println();
    }
}
