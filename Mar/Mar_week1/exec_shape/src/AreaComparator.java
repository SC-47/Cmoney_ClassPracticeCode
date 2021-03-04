public class AreaComparator implements Comparator {
    @Override
    public int compare(Shape a, Shape b) {
        if (a.area() > b.area()) {
            return 1;
        } else if (a.area() < b.area()) {
            return -1;
        } else {
            return 0;
        }
    }
}
