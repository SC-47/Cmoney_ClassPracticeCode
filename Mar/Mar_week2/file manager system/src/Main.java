public class Main {
    public static void main(String[] args) {
        // void test();// 沒有參數且沒有回傳值的方法

        // 參數: 無
        // 實現內容: 無
        // 回傳: 無
        InterfaceA a = () -> { };// 不能省略括號及大括號
        a.test();

        // 參數: 無
        // 實現內容: 一行
        // 回傳: 無
        a = () -> System.out.println("Hello World!");// 可以省略大括號
        a.test();

        // 參數: 無
        // 實現內容: 多行
        // 回傳: 無
        a = () -> {
            System.out.println("Hello");
            System.out.println("World!");
        };// 不能省略大括號
        a.test();

        // 參數: 一個
        // 實現內容: 一行
        // 回傳: 無
        InterfaceB b = kk -> System.out.println(kk);// 可以省略小括號與大括號
        b.test(10);

        // 參數: 多個
        // 實現內容: 一行
        // 回傳: 無
        InterfaceC c = (i, j) -> System.out.println(i + " " + j);// 不能省略小括號，可以省略大括號
        c.test(5, 10);

        // 參數: 無
        // 實現內容: 一行
        // 回傳: 有
        InterfaceD d = () -> 10;// 可以省略大括號以及return
        System.out.println(d.test());

        // 參數: 多個
        // 實現內容: 多行
        // 回傳: 有
        InterfaceE e = (i, j) -> {
            System.out.println(i + " " + j);
            return i + j;// 不能省略return
        };// 不能省略大括號
        System.out.println(e.test(5, 10));
    }

    @FunctionalInterface
    interface InterfaceA {
        void test();// 沒有參數且沒有回傳值的方法
    }

    @FunctionalInterface
    interface InterfaceB {
        void test(int i);// 一個參數且沒有回傳值的方法
    }

    @FunctionalInterface
    interface InterfaceC {
        void test(int i, int j);// 多個參數且沒有回傳值的方法
    }

    @FunctionalInterface
    interface InterfaceD {
        int test();// 沒有參數且有回傳值的方法
    }

    @FunctionalInterface
    interface InterfaceE {
        int test(int i, int j);// 有參數且有回傳值的方法
    }
}
// output
// ---------------------
/*
Hello World!
Hello
World!
10
5 10
10
5 10
15
*/
// ---------------------