public class Library {
    private BookShelf[] bookShelves;
    private int amount;

    public Library() {
        bookShelves = new BookShelf[2];
        amount = 0;
    }

    public int getAmount() {
        return amount;
    }

    public BookShelf getBookShelf(int index) {
        return bookShelves[index];
    }

    public void addBookShelf(BookShelf bookShelf) {
        if (amount == bookShelves.length) {
            doubleArray();
        }
        bookShelves[amount++] = bookShelf;
    }

    public void addBook(Book book, String classification) {
        Library tmp = sort(classification);
        int amount = 0;
        do {
            if (tmp.getBookShelf(amount).add(book)) {
                return;
            }
            amount++;
        } while (amount != tmp.getAmount());
        System.out.println("書櫃全滿");
    }

    public void queryBook() {
        BookFilter nonFilter = book -> true;
        queryBook(this, nonFilter);
    }

    public void queryBook(String classification) {
        BookFilter nonFilter = book -> true;
        queryBook(this.sort(classification), nonFilter);
    }

    public void queryBook(BookFilter bookFilter) {
        queryBook(this, bookFilter);
    }

    public BookShelf queryBookShelf(int bookShelfNum) {
        for (int i = 0; i < amount; i++) {
            if (bookShelves[i].getNum() == bookShelfNum) {
                return bookShelves[i];
            }
        }
        return null;
    }

    private void doubleArray() {
        BookShelf[] tmp = new BookShelf[bookShelves.length * 2];
        for (int i = 0; i < amount; i++) {
            tmp[i] = bookShelves[i];
        }
        bookShelves = tmp;
    }

    private Library sort(String classification) {
        Library tmp = new Library();
        BookShelfFilter classificationFilter = bookShelf ->
                bookShelf.getClassification().equals(classification);
        for (int i = 0; i < amount; i++) {
            if (classificationFilter.query(bookShelves[i])) {
                tmp.addBookShelf(bookShelves[i]);
            }
        }
        return tmp;
    }


    private void queryBook(Library library, BookFilter bookFilter) {
        Consumer printConsumer = libraryP -> {
            for (int i = 0; i < libraryP.amount; i++) {
                BookShelf tmp = libraryP.getBookShelf(i);
                int bookNum = tmp.getBookNum();
                for (int j = 0; j < bookNum; j++) {
                    if (bookFilter.query(tmp.getBook(j))) {
                        System.out.println(tmp.getBook(j).getBookInfo());
                    }
                }
            }
        };
        printConsumer.consume(library);

    }
}
