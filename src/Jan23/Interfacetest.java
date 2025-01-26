package Jan23;

public class Interfacetest  {
    public static void main(String[] args) {
        Test t1=new Test() {

            public void test() {
                System.out.println("Hello ");
            }
        };
        t1.test();
    }
}
