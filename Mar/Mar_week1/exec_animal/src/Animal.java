public class Animal {
    private final String name;
    private final float weight;
    protected String race;
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

    public final String getRace() {
        return race;
    }

    public String getAnimalInfo(){
        return "名稱:"+getName()+" 重量:"+getWeight();
    }
}
