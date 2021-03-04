public class ScoreComparator implements Comparator {

    @Override
    public int compare(Student a, Student b) {
        if (a.getScore()>b.getScore()){
            return 1;
        }
        else if (a.getScore()<b.getScore()){
            return -1;
        }else {
            return 0;
        }
    }
}
