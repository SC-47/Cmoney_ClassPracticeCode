public class AlphabetFilter implements Filter {
    private char firstLetter;

    public AlphabetFilter(char firstLetter) {
        setFirstLetter(firstLetter);
    }

    private void setFirstLetter(char firstLetter) {
        this.firstLetter = firstLetter;
    }

    @Override
    public boolean query(Animal animal) {
        char tmp = animal.getName().charAt(0);
        if (tmp == firstLetter) {
            return true;
        }
        return false;
    }
}
