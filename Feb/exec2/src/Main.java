import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BookShelf books = new BookShelf();
        int func;
        do{
            System.out.println("1.讓使用者新增一本書");
            System.out.println("2.查詢指定作者撰寫的所有書籍的詳細資料");
            System.out.println("3.查詢指定書名的詳細資料");
            System.out.println("4.查詢指定出版日的所有書籍的詳細資料");
            System.out.println("5.查詢開始日期~結束日期間的所有書籍");
            System.out.println("6.結束程式");
            System.out.println("請輸入功能碼:");
            func = sc.nextInt();
            sc.nextLine();
            switch (func){
                case 1:
                    System.out.println("請輸入書名:");
                    String name = sc.nextLine();
                    System.out.println("請輸入作者:");
                    String author = sc.nextLine();
                    System.out.println("請輸入出版年、月、日:");
                    Date date = new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());
                    sc.nextLine();
                    books.add(new Book(name,author,date));
                    break;
                case 2:
                    System.out.println("請輸入作者:");
                    books.queryByAuthor(sc.nextLine()).printAll();
                    break;
                case 3:
                    System.out.println("請輸入書名:");
                    books.queryByName(sc.nextLine()).printAll();
                    break;
                case 4:
                    System.out.println("請輸入出版年、月、日:");
                    Date tmp = new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());
                    sc.nextLine();
                    books.queryByDate(tmp).printAll();
                    break;
                case 5:
                    System.out.println("請輸入開始年、月、日:");
                    Date startDate = new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());
                    System.out.println("請輸入結束年、月、日:");
                    Date endDate = new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());
                    sc.nextLine();
                    for (int i =0; i < books.getSize(); i++){
                        if (books.getBook(i).getDate().isBetweenWith(startDate,endDate)){
                            System.out.println(books.getBook(i).getBookInfo());
                        }
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                case 7:
                    books.printAll();
                    break;
            }
        }while(true);
    }
}
