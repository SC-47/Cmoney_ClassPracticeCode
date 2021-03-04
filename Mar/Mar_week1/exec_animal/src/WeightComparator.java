public class WeightComparator implements Comparator {

    @Override
    public int compare(Animal a, Animal b) {
        if (a.getWeight()>b.getWeight()){
            return 1;
        }else if(a.getWeight()<b.getWeight()){
            return -1;
        }else{
            return 0;
        }
    }
}
