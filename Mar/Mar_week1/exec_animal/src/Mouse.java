public class Mouse extends Animal{
    public Mouse(String name, float weight) {
        super(name, weight);
    }

    @Override
    public String getRace() {
        return "Mouse";
    }
}
