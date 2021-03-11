public class Dog extends Animal{
    public Dog(String name, float weight) {
        super(name, weight);
    }

    @Override
    public String getRace() {
        return "Dog";
    }

    @Override
    public String toString() {
        return getRace()+" 名稱:"+getName()+" 體重:"+getWeight();
    }
}
