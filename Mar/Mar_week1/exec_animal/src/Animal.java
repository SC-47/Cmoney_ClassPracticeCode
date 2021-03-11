public abstract class Animal {
    private String name;
    private float weight;
    public Animal (String name, float weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public abstract String getRace();
}
