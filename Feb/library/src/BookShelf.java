public class BookShelf {
    private static int serial = 1;
    private final int num;
    private final String classification;
    private final int size;
    private final Book[] books;
    private int bookNum;

    public BookShelf(String name, int size) {
        this.num = serial++;
        this.classification = name;
        this.size = size;
        books = new Book[size];
        bookNum = 0;
    }

    public int getNum() {
        return num;
    }

    public String getClassification() {
        return classification;
    }

    public Book getBook(int index) {
        return books[index];
    }

    public int getBookNum() {
        return bookNum;
    }

    public boolean add(Book book) {
        if (bookNum == size) {
            return false;
        }
        books[bookNum++] = book;
        return true;
    }

    public Book getByName(String key) {
        for (int i = 0; i < bookNum; i++) {
            if (books[i].getName().equals(key)) {
                return books[i];
            }
        }
        return null;
    }
}
