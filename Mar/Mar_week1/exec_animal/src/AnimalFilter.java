public class AnimalFilter implements Filter {
    private String race;

    public AnimalFilter(String race) {
        setRace(race);
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public boolean query(Animal animal) {
        if (animal.getRace().equals(race)) {
            return true;
        }
        return false;
    }
}


