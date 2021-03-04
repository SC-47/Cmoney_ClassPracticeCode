public class StudentArr {
    private Student[] students;
    private int studentNum;

    public StudentArr() {
        this.students = new Student[2];
        this.studentNum = 0;
    }

    public void add(Student student) {
        if (students.length == studentNum) {
            students = doubleArray();
        }
        this.students[studentNum++] = student;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public Student getStudent(int index){
        return students[index];
    }

    public StudentArr queryBySeatNum(int seatNum){
        StudentArr tmp = new StudentArr();
        for (int i = 0; i < studentNum; i++){
            if (seatNum == students[i].getSeatNum()){
                tmp.add(this.getStudent(i));
            }
        }
        return tmp;
    }

    public void swap(int a, int b){
        Student tmp = students[a];
        students[a] = students[b];
        students[b] = tmp;
    }

    public void printAll() {
        for (int i = 0; i < studentNum; i++) {
            students[i].print();
        }
    }

    private Student[] doubleArray() {
        Student[] tmp = new Student[students.length * 2];
        for (int i = 0; i < studentNum; i++) {
            tmp[i] = students[i];
        }
        return tmp;
    }

}
