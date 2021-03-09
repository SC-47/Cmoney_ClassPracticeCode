public final class StudentArr {
    private Student[] students;
    private int count;

    public StudentArr() {
        students = new Student[2];
        count = 0;
    }

    public final void add(Student student) {
        if (count == students.length) {
            doubleArray();
        }
        students[count++] = student;
    }

    public Student getBySeatNum(int seatNum) {
        for (int i = 0; i < count; i++) {
            if (students[i].getSeatNum() == seatNum) {
                return students[i];
            }
        }
        return null;
    }

    public StudentArr sort(Comparator comparator) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++)
                if (comparator.compare(students[j], students[j + 1])) {
                    swap(j, j + 1);
                }
        }
        return this;

    }

    public void consume(Consumer consumer) {
        for (int i = 0; i < count; i++) {
            consumer.accept(students[i]);
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
}