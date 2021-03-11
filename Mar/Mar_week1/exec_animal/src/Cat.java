public class Cat extends Animal{
    public Cat(String name, float weight) {
        super(name, weight);
    }

    @Override
    public String getRace() {
        return "Cat";

    }

    @Override
    public String toString() {
        return getRace()+" 名稱:"+getName()+" 體重:"+getWeight();
    }
}
