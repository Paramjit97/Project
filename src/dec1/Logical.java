package dec1;

public class Logical {
    public static void main(String[]args){
        int x=10;
        int y=20;
        boolean result1=(x>y) && (x!=0);
        System.out.println(result1);

        boolean result2=(x>y) || (x!=0);
        System.out.println(result2);

        boolean result3=!((x>y) && (x!=0));
        System.out.println(result3);
    }
}
