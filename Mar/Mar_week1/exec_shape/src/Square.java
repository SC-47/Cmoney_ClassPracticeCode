public class Square extends Rectangle {

    public Square(float w, float x, float y) {
        super(w, w, x, y);
    }

    public void print() {
        System.out.printf("正方形=> 面積: %5.2f 周長: %5.2f", this.area(), this.perimeter());
        System.out.println();
    }
}
