public class Cat extends Animal {
    public Cat(String name, float weight) {
        super(name, weight);
    }

    @Override
    public String getRace() {
        return "Cat";
    }
}
