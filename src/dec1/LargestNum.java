package dec1;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int z=scanner.nextInt();
        if(x>y && x>z){
            System.out.println("x is the greatest");
        } else if (y>x && y>z) {
            System.out.println("y is the greatest");

        }
        else{
            System.out.println("Z is the greatest");
        }
    }
}