public class AnimalArray {
    private Animal[] animals;
    private int animalNum;

    public AnimalArray() {
        animals = new Animal[2];
        animalNum = 0;
    }

    public final void add(Animal animal) {
        insert(animalNum, animal);
    }

    public final void insert(int index, Animal animal) {
        if (index < 0 || index > animalNum) {
            System.out.println("欲插入位置不存在");
        } else {
            if (animalNum == animals.length) {
                doubleArray();
            }
            for (int i = animalNum; i > index; i--) {
                animals[i] = animals[i - 1];
            }
            animals[index] = animal;
            animalNum++;
        }
    }

    public final void delete(int index) {
        if (index < 0 || index >= animalNum) {
            System.out.println("欲刪除位置不存在");
        } else {
            for (int i = index; i < animalNum - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[--animalNum] = null;
        }
    }

    public void sort(Comparator comparator) {
        for (int i = 0; i < animalNum - 1; i++) {
            for (int j = 0; j < animalNum - 1 - i; j++) {
                if (comparator.compare(animals[j], animals[j + 1]) > 0) {
                    swap(j, j + 1);
                }
            }
        }
    }

    public Animal queryByName(String name) {
        for (int i = 0; i < animalNum; i++) {
            if (animals[i].getName().equals(name)) {
                return animals[i];
            }
        }
        System.out.println("查無此動物");
        return null;
    }

    public AnimalArray query(Filter filter) {
        AnimalArray tmp = new AnimalArray();
        for (int i = 0; i < animalNum; i++) {
            if (filter.query(animals[i])) {
                tmp.add(animals[i]);
            }
        }
        return tmp;
    }

    public void printAll() {
        for (int i = 0; i < animalNum; i++) {
            System.out.println(animals[i].getAnimalInfo());
        }
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
