public class PerimeterComparator implements Comparator {
    @Override
    public int compare(Shape a, Shape b) {
        if (a.perimeter() > b.perimeter()) {
            return 1;
        } else if (a.perimeter() < b.perimeter()) {
            return -1;
        } else {
            return 0;
        }
    }
}
