public class SeatNumComparator implements Comparator {
    @Override
    public boolean compare(Student a, Student b) {
        return a.getSeatNum() > b.getSeatNum();

    }
}
