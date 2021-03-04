public abstract class Animal {
    private final String name;
    private final float weight;
    public Animal(String name, float weight){
        this.name = name;
        this.weight = weight;
    }

    public final String getName() {
        return name;
    }

    public final float getWeight() {
        return weight;
    }

    public String getAnimalInfo(){
        return "名稱:"+getName()+" 重量:"+getWeight();
    }

    public abstract String getRace();
}
