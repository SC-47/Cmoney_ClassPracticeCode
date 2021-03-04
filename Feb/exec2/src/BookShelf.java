public class BookShelf {
    private Book[] books;
    private int size;
    public BookShelf(){
        this.books = new Book[2];
        this.size = 0;
    }

    public Book getBook(int i) {
        return books[i];
    }

    public int getSize() {
        return size;
    }

    public void add(Book book){
        if (books.length == size){
            books = doubleArray();
        }
        books[size++] = book;
    }

    public void printAll(){
        for(int i =0; i < this.size;i++){
            System.out.println(books[i].getBookInfo());
        }
    }

    public void printAll(char c){
        for(int i =0; i < this.size;i++){
            System.out.println(books[i].getBookInfo(c));
        }
    }

    public BookShelf queryByAuthor(String author){
        BookShelf tmp = new BookShelf();
        for(int i =0; i < this.size; i++){
            if (books[i].getAuthor().equals(author)){
                tmp.add(books[i]);
            }
        }
        return tmp;
    }

    public BookShelf queryByName(String name){
        BookShelf tmp = new BookShelf();
        for(int i =0; i < this.size; i++){
            if (books[i].getName().equals(name)){
                tmp.add(books[i]);
            }
        }
        return tmp;
    }

    public BookShelf queryByDate(Date date){
        BookShelf tmp = new BookShelf();
        for(int i =0; i < this.size; i++){
            if (books[i].getDate().getDateString().equals(date.getDateString())){
                tmp.add(books[i]);
            }
        }
        return tmp;
    }

    private Book[] doubleArray(){
        Book[] tmp = new Book[books.length*2];
        for (int i = 0; i < books.length; i++){
            tmp[i] = books[i];
        }
        return tmp;
    }
}
