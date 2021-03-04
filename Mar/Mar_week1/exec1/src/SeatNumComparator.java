public class SeatNumComparator implements Comparator {

    @Override
    public int compare(Student a, Student b) {
        if (a.getSeatNum()>b.getSeatNum()){
            return 1;
        }
        else if (a.getSeatNum()<b.getSeatNum()){
            return -1;
        }else {
            return 0;
        }
    }
}
