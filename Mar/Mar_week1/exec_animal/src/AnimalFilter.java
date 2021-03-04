public class AnimalFilter implements Filter {
    private String race;

    public AnimalFilter(String race) {
        setRace(race);
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    @Override
    public boolean query(Animal animal) {
        if (animal.getRace().equals(this.race)) {
            return true;
        }
        return false;

    }
}
