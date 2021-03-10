import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        int func;
        do {
            func = inputInt("功能碼(1~10)");
            switch (func) {
                case 1 -> library.addBookShelf(new BookShelf(
                        inputString("書櫃分類"), inputInt("存書量上限")
                ));
                case 2 -> library.addBook(
                        new Book(inputString("書名"), inputString("作者"), inputDate("出版日期"))
                        , inputString("書櫃分類"));
                case 3 -> {
                    String classification = inputString("指定分類");
                    library.filter(
                            bookShelf -> bookShelf.getClassification().equals(classification)
                    ).consume(System.out::println);
                }
                case 4 -> {
                    String author = inputString("指定作者");
                    library.consume(System.out::println, book -> book.getAuthor().equals(author));
                }
                case 5 -> {
                    String name = inputString("指定書名");
                    library.consume(System.out::println, book -> book.getName().equals(name));
                }
                case 6 -> {
                    Date date = inputDate("指定出版日期");
                    library.consume(
                            System.out::println, book -> book.getDate().getDateInt() == date.getDateInt()
                    );
                }
                case 7 -> {
                    Date startDate = inputDate("開始日期");
                    Date endDate = inputDate("結束日期");
                    library.consume(
                            System.out::println, book ->
                                    book.getDate().isBetweenWith(startDate, endDate));
                }
                case 8 -> {
                    String name = inputString("欲查詢書名");
                    Book tmp = library.getBook(name);
                    if (tmp == null) {
                        System.out.println("查無此書");
                        return;
                    }
                    tmp.setName(inputString("修改後書名"));
                    tmp.setAuthor(inputString("修改後作者"));
                    tmp.setDate(inputDate("修改後出版日期"));
                }
                case 9 -> library.consume(System.out::println);
                case 10 -> System.exit(0);
            }

        } while (true);


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

    public static String inputString(String hint) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入" + hint + ":");
        return sc.nextLine();
    }

}