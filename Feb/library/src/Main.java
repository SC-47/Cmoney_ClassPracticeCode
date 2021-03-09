import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        int func;
        do {
            func = inputInt("功能碼(1~10)");
            switch (func) {
                case 1 -> library.addBookShelf(new BookShelf(
                        inputString("書櫃分類"),
                        inputInt("存書量")));
                case 2 -> library.addBook(new Book(
                        inputString("書名"),
                        inputString("作者"),
                        inputDate("出版日期")
                ), inputString("書櫃分類"));
                case 3 -> library.queryBook(inputString("欲查詢書櫃分類"));
                case 4 -> {
                    String author = inputString("欲查詢作者");
                    BookFilter authorFilter = book -> book.getAuthor().equals(author);
                    library.queryBook(authorFilter);
                }
                case 5 -> {
                    String name = inputString("欲查詢書名");
                    BookFilter nameFilter = book -> book.getName().equals(name);
                    library.queryBook(nameFilter);
                }
                case 6 -> {
                    Date publicationDate = inputDate("欲查詢出版日期");
                    BookFilter dateFilter = book ->
                            book.getDate().getDateInt() == publicationDate.getDateInt();
                    library.queryBook(dateFilter);
                }
                case 7 -> {
                    Date startDate = inputDate("欲查詢開始日期");
                    Date endDate = inputDate("欲查詢結束日期");
                    BookFilter dateBetweenFilter = book -> book.getDate().getDateInt() >= startDate.getDateInt() &&
                            book.getDate().getDateInt() <= endDate.getDateInt();
                    library.queryBook(dateBetweenFilter);
                }
                case 8 -> {
                    Book book = library.queryBookShelf(inputInt("欲修改書之書櫃編號")).
                            getByName(inputString("欲修改書之書名"));
                    book.setName(inputString("重新輸入書名"));
                    book.setAuthor(inputString("重新輸入作者"));
                    book.setDate(inputDate("重新輸入出版日期"));
                }
                case 9 -> library.queryBook();
                case 10 -> System.exit(0);
            }
        } while (true);
    }

    public static String inputString(String hint) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入" + hint);
        return sc.nextLine();
    }

    public static int inputInt(String hint) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入" + hint + ":");
        return sc.nextInt();
    }

    public static Date inputDate(String hint) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入" + hint + "(年、月、日):");
        return new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }
}
