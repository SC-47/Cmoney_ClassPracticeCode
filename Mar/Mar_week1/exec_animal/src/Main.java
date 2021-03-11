import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AnimalArray animalArray = new AnimalArray();
        Scanner sc = new Scanner(System.in);
        int func;
        do {
            func = inputInt("功能碼(1~10)");
            switch (func) {
                case 1 -> animalArray.add(inputAnimal());
                case 2 -> animalArray.insert(inputInt("插入位置"), inputAnimal());
                case 3 -> animalArray.delete(inputInt("刪除位置"));
                case 4 -> animalArray
                        .sort((a, b) -> a.getName().compareTo(b.getName()) > 0);
                case 5 -> animalArray
                        .sort((a, b) -> a.getWeight() > b.getWeight());
                case 6 -> animalArray.consume(System.out::println);
                case 7 -> {
                    String name = inputString("指定姓名");
                    animalArray
                            .query(animal -> animal.getName().equals(name))
                            .consume(System.out::println);
                }
                case 8 -> {
                    char firstLetter = inputChar("指定字母開頭");
                    animalArray
                            .query(animal -> animal.getName().charAt(0) == firstLetter)
                            .consume(System.out::println);
                }
                case 9 -> {
                    float weightMin = inputFloat("體重(最小值)");
                    float weightMax = inputFloat("體重(最大值)");
                    animalArray
                            .query(animal ->
                                    animal.getWeight() >= weightMin &&
                                            animal.getWeight() <= weightMax)
                            .consume(System.out::println);
                }
                case 10 -> {
                    String race = inputString("欲篩選動物種類");
                    animalArray
                            .query(animal ->
                                    animal.getRace().equals(race))
                            .consume(System.out::println);
                }
            }
        } while (func > 0 && func < 11);
        sc.close();
        System.out.println("功能碼輸入錯誤，結束程式");
    }

    public static int inputInt(String hint) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入" + hint + ":");
        return sc.nextInt();
    }

    public static float inputFloat(String hint) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入" + hint + ":");
        return sc.nextFloat();
    }

    public static char inputChar(String hint) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入" + hint + ":");
        return sc.next().charAt(0);
    }


    public static String inputString(String hint) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入" + hint + ":");
        return sc.nextLine();
    }

    public static Animal inputAnimal() {
        int func = inputInt("動物代碼(1~3)");
        if (func < 1 || func > 3) {
            func = (int) (Math.random() * 3 + 1);
        }
        switch (func) {
            case 1:
                return new Dog(inputString("名字"), inputFloat("體重"));
            case 2:
                return new Cat(inputString("名字"), inputFloat("體重"));
            case 3:
                return new Mouse(inputString("名字"), inputFloat("體重"));
        }
        return null;
    }
}
