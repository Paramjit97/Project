package dec1;

public class Comparison {
    public static void main(String[]args){
        int x=10;
        int y=20;

        // simply the boolean result;
        System.out.println(x>y);
        System.out.println(x<y);
        System.out.println(x==y);
        System.out.println(!(x==y));
        System.out.println(x<=y);
        System.out.println(x>=y);

        // check the result using if-else
        if(x!=y){
            System.out.println("not equal");
        }
        else{
                System.out.println("equal");
        }
    }
}
