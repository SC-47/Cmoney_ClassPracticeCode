public class AnimalArray {
    private Animal[] animals;
    private int count;

    public AnimalArray() {
        animals = new Animal[2];
        count = 0;
    }

    public void add(Animal animal) {
        insert(count, animal);
    }

    public void insert(int index, Animal animal) {
        if (index < 0 || index > count) {
            System.out.println("查無此位置");
            return;
        }
        if (count == animals.length) {
            doubleArray();
        }
        for (int i = count++; i > index; i--) {
            animals[i] = animals[i - 1];
        }
        animals[index] = animal;
    }

    public void delete(int index) {
        if (index < 0 || index >= count) {
            System.out.println("查無此位置");
            return;
        }
        for (int i = index; i < count - 1; i++) {
            animals[i] = animals[i + 1];
        }
        count--;
    }

    public void consume(Consumer consumer) {
        for (int i = 0; i < count; i++) {
            consumer.accept(animals[i]);
        }
    }

    public void sort(Comparator comparator) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (comparator.compare(animals[j], animals[j + 1])) {
                    swap(j, j + 1);
                }
            }
        }
    }

    public AnimalArray query(Filter filter) {
        AnimalArray tmp = new AnimalArray();
        for (int i = 0; i < count; i++) {
            if (filter.use(animals[i])) {
                tmp.add(animals[i]);
            }
        }
        return tmp;
    }

    private void doubleArray() {
        Animal[] tmp = new Animal[animals.length * 2];
        for (int i = 0; i < animals.length; i++) {
            tmp[i] = animals[i];
        }
        animals = tmp;
    }

    private void swap(int a, int b) {
        Animal tmp = animals[a];
        animals[a] = animals[b];
        animals[b] = tmp;
    }

}
