public class NameComparator implements Comparator {

    @Override
    public int compare(Animal a, Animal b) {
        if (a.getName().compareTo(b.getName()) > 0) {
            return 1;
        } else if (a.getName().compareTo(b.getName()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
