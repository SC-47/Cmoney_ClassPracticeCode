public class Mouse extends Animal{
    public Mouse(String name, float weight) {
        super(name, weight);
    }

    @Override
    public String getRace() {
        return "Mouse";
    }

    @Override
    public String toString() {
        return getRace()+" 名稱:"+getName()+" 體重:"+getWeight();
    }
}
