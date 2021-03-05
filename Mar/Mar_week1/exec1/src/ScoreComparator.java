public class ScoreComparator implements Comparator {
    @Override
    public boolean compare(Student a, Student b) {
        return a.getScore() > b.getScore();

    }
}
