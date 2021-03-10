public final class BookShelf {
    private static int serial = 0;
    private final int serialNumber;
    private final String classification;
    private final int size;
    private final Book[] books;
    private int bookNum;

    public BookShelf(String classification, int size) {
        this.serialNumber = ++serial;
        this.classification = classification;
        this.size = size;
        this.books = new Book[size];
        this.bookNum = 0;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getClassification() {
        return classification;
    }

    public int getSize() {
        return size;
    }

    public int getBookNum() {
        return bookNum;
    }

    public boolean add(Book book) {
        if (size == bookNum) {
            return false;
        }
        books[bookNum++] = book;
        return true;
    }

    public Book getBook(int index){
        return books[index];
    }

    public Book getByName(String key){
        for(int i =0; i < bookNum; i++){
            if (books[i].getName().equals(key)){
                return books[i];
            }
        }
        return null;
    }
}
