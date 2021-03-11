public class ShapeArray {
    private Shape[] shapes;
    private int count;

    public ShapeArray() {
        shapes = new Shape[2];
        count = 0;
    }

    public void add(Shape shape) {
        if (count == shapes.length) {
            doubleArray();
        }
        shapes[count++] = shape;
    }

    public Shape getShape(int index) {
        return shapes[index];
    }

    public ShapeArray sort(Comparator comparator) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (comparator.compare(shapes[j], shapes[j + 1])) {
                    swap(j, j + 1);
                }
            }
        }
        return this;
    }

    public ShapeArray filter(Filter filter) {
        ShapeArray tmp = new ShapeArray();
        for (int i = 0; i < count; i++) {
            if (filter.use(shapes[i])) {
                tmp.add(shapes[i]);
            }
        }
        return tmp;
    }

    public void consume(Consumer consumer) {
        for (int i = 0; i < count; i++) {
            consumer.accept(shapes[i]);
        }
    }

    private void doubleArray() {
        Shape[] tmp = new Shape[shapes.length * 2];
        for (int i = 0; i < shapes.length; i++) {
            tmp[i] = shapes[i];
        }
        shapes = tmp;
    }

    private void swap(int a, int b) {
        Shape tmp = shapes[a];
        shapes[a] = shapes[b];
        shapes[b] = tmp;
    }
}
