import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AnimalArray animals = new AnimalArray();
        animals.add(new Dog("Brian", 38));
        animals.add(new Cat("Cathy", 49));
        animals.add(new Mouse("bird", 51));
        animals.insert(1,new Dog("Brian", 63));
        animals.query(new AnimalFilter("Dog")).printAll();
    }
}
