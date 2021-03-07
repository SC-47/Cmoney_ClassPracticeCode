public class Main {
    public static void main(String[] args) {
        String a = "hello1";
        final String b = "hello";
        String d = "hello";
        String c = b + 1;
        String e = d + 1;
        System.out.println((a == c));
        System.out.println((a == e));
    }
}
