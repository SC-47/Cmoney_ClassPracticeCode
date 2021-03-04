public class Student {
    private String className;
    private int seatNum;
    private String name;
    private int score;


    public Student(String className, int seatNum, String name) {
        this(className, seatNum, name, 0);
    }

    public Student(String className, int seatNum, String name, int score) {
        setClassName(className);
        setSeatNum(seatNum);
        setName(name);
        setScore(score);
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getClassName() {
        return className;
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

    public String getStudentInfo() {
        String str = "班級:" + getClassName();
        str += " 座號:" + String.valueOf(getSeatNum());
        str += " 姓名:" + getName();
        str += " 成績:" + getScore();
        return str;
    }

    public void print(){
        System.out.println(getStudentInfo());
}




}
