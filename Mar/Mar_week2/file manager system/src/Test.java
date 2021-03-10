public class Test {
    private final int a;
    private final int b;
    Conumer consumer = new Consumer;
.consume(consumer)
    public Test(int a, int b) {
        this. a = a;
        this.b = b;
    }

    public class InnerTest{
        private int b;

        public InnerTest(){
            this.b = 11;
        }

        public void test(){
            System.out.println(Test.this.b);
        }
    }
}
