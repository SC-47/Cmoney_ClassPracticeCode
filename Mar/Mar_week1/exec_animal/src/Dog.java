public class Dog extends Animal {

    public Dog(String name, float weight) {
        super(name, weight);
    }

    @Override
    public String getRace() {
        return "Dog";
    }

}
