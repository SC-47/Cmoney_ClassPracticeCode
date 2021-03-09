public final class Student {
    private final String className;
    private final int seatNum;
    private final String name;
    private int score;

    public Student(String className, int seatNum, String name) {
        this(className, seatNum, name, 0);
    }

    public Student(String className, int seatNum, String name, int score) {
        this.className = className;
        this.seatNum = seatNum;
        this.name = name;
        setScore(score);
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public int getScore() {
        return score;
    }

    public String getInfo() {
        return "班級:" + className +
                " 座號:" + getSeatNum() +
                " 姓名:" + name +
                " 成績:" + getScore();
    }
}