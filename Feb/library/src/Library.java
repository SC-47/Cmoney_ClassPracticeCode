public class Library {
    private BookShelf[] bookShelves;
    private int count;

    public Library() {
        bookShelves = new BookShelf[2];
        count = 0;
    }

    public void addBookShelf(BookShelf bookShelf) {
        if (count == bookShelves.length) {
            doubleArray();
        }
        bookShelves[count++] = bookShelf;
    }

    public BookShelf getBySerialNum(int serialNum) {
        for (int i = 0; i < count; i++) {
            if (bookShelves[i].getSerialNumber() == serialNum) {
                return bookShelves[i];
            }
        }
        return null;
    }

    public Library filter(BookShelfFilter bookShelfFilter) {
        Library tmp = new Library();
        for (int i = 0; i < count; i++) {
            if (bookShelfFilter.filter(bookShelves[i])) {
                tmp.addBookShelf(bookShelves[i]);
            }
        }
        return tmp;
    }

    public void consume(Consumer consumer) {
        BookFilter nonFilter = book -> true;
        consume(consumer, nonFilter);
    }

    public void consume(Consumer consumer, BookFilter bookFilter) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < bookShelves[i].getBookNum(); j++) {
                if (bookFilter.filter(bookShelves[i].getBook(j))) {
                    consumer.accept(bookShelves[i].getBook(j));
                }
            }
        }
    }

    public void addBook(Book book, String classification) {
        Library tmp = this.filter(bookShelf -> bookShelf.getClassification().equals(classification));
        for (int i = 0; i < tmp.count; i++) {
            if (tmp.getByIndex(i).add(book)) {
                return;
            }
        }
        if (tmp.count == 0) {
            System.out.println("書櫃不存在");
            return;
        }
        System.out.println("書櫃全滿");
    }

    public Book getBook(String key) {
        for (int i = 0; i < count; i++) {
            if (bookShelves[i].getByName(key) != null) {
                return bookShelves[i].getByName(key);
            }
        }
        return null;
    }

    private void doubleArray() {
        BookShelf[] tmp = new BookShelf[bookShelves.length * 2];
        for (int i = 0; i < bookShelves.length; i++) {
            tmp[i] = bookShelves[i];
        }
        bookShelves = tmp;
    }

    private BookShelf getByIndex(int index) {
        return bookShelves[index];
    }
}
