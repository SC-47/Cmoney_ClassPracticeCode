public class StudentArray {
    private Student[] students;
    private int count;

    public StudentArray() {
        students = new Student[2];
        count = 0;
    }

    public void add(Student student){
        if (students.length == count){
            doubleArray();
        }
        students[count++] = student;
    }

    public StudentArray sort(Comparator comparator) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (comparator.compare(students[j], students[j + 1]) > 0) {
                    swap(j, j + 1);
                }
            }
        }
        return this;
    }

    public void shuffle(){
        for (int i = 0; i < count; i++){
            swap(i,randomNumGen());
        }
    }

    public void printAll(){
        for (int i =0; i < count;i ++){
            students[i].print();
        }
    }

    private void doubleArray(){
        Student[] tmp = new Student[students.length*2];
        for (int i =0; i < students.length; i++){
            tmp[i] = students[i];
        }
        students = tmp;
    }

    private void swap(int a, int b) {
        Student tmp = students[a];
        students[a] = students[b];
        students[b] = tmp;
    }

    private int randomNumGen() {
        return (int) (Math.random() * (count + 1));
    }
}
