public class NameFilter implements Filter {
    private String name;

    public NameFilter(String name) {
        setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean query(Animal animal) {
        if (animal.getName().equals(name)) {
            return true;
        }
        return false;

    }
}
