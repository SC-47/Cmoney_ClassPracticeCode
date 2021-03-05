public final class Student {
    private final int seatNum;
    private final String name;
    private final int score;
    public Student(int seatNum, String name, int score){
        this.seatNum = seatNum;
        this.name = name;
        this.score = score;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
