public final class StudentArray {
    private Student[] students;
    private int count;

    public StudentArray() {
        students = new Student[2];
        count = 0;
    }

    public final void sort(Comparator comparator) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (comparator.compare(students[j], students[j + 1])) {
                    swap(j, j + 1);
                }
            }

        }
    }

    public final void add(Student student) {
        if (students.length == count) {
            doubleArray();
        }
        students[count++] = student;
    }

    public final Student getStudent(int index) {
        return students[index];
    }

    public final void shuffle(){
        for (int i =0; i < count; i++){
            swap(i,randomNum());
        }
    }

    public final void map(Mapper mapper){
        for (int i =0; i < count; i ++){
            mapper.map(students[i]);
        }
    }

    private void swap(int a, int b) {
        Student tmp = students[a];
        students[a] = students[b];
        students[b] = tmp;
    }

    private void doubleArray() {
        Student[] tmp = new Student[students.length * 2];
        for (int i = 0; i < students.length; i++) {
            tmp[i] = students[i];
        }
        students = tmp;
    }

    private int randomNum(){
        return (int)(Math.random()*(count));
    }
}
