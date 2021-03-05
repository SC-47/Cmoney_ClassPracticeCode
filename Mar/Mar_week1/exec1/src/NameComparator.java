public class NameComparator implements Comparator {
    @Override
    public boolean compare(Student a, Student b) {
        return a.getName().compareTo(b.getName()) > 0;
    }
}
