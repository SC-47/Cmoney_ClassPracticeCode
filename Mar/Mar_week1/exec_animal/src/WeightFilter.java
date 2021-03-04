public class WeightFilter implements Filter {
    private float min;
    private float max;

    public WeightFilter(float min, float max){
        setMin(min);
        setMax(max);
    }

    public void setMin(float min) {
        this.min = min;
    }

    public void setMax(float max) {
        this.max = max;
    }

    @Override
    public boolean query(Animal animal) {
        if (animal.getWeight() >= min && animal.getWeight() <= max) {
            return true;
        }
        return false;

    }
}
