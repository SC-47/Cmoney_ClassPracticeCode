public class ShapeArray {
    private Shape[] shapes;
    private int count;

    public ShapeArray() {
        shapes = new Shape[2];
        count = 0;
    }

    public final void add(Shape shape) {
        if (shapes.length == count) {
            doubleArray();
        }
        shapes[count++] = shape;
    }

    public final Shape getShape(int index) {
        return shapes[index];
    }

    public int getCount() {
        return count;
    }

    public final void sort(Comparator comparator) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (comparator.compare(shapes[j], shapes[j + 1]) > 0) {
                    swap(j, j + 1);
                }
            }
        }
    }

    public final void printAll (){
        for (int i = 0; i < count; i ++){
            shapes[i].print();
        }
    }

    private void doubleArray() {
        Shape[] tmp = new Shape[shapes.length * 2];
        for (int i = 0; i < shapes.length; i++) {
            tmp[i] = shapes[i];
        }
        shapes = tmp;
    }

    private final void swap(int a, int b) {
        Shape tmp = this.shapes[a];
        this.shapes[a] = this.shapes[b];
        this.shapes[b] = tmp;
    }

}
