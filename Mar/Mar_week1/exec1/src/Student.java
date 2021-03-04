public class Student {
    private int seatNum;
    private String name;
    private int score;

    public Student(int seatNum, String name, int score){
        setSeatNum(seatNum);
        setName(name);
        setScore(score);
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

    public int getSeatNum() {
        return seatNum;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getStudentInfo(){
        return "座號:"+String.valueOf(getSeatNum())+" 姓名:"+getName()+" 成績:"+String.valueOf(getScore());
    }

    public void print(){
        System.out.println(getStudentInfo());
    }
}
