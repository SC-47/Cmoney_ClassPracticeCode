@FunctionalInterface
public interface BookFilter {
    boolean query(Book book);
}
