package dec1;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[]args){
        System.out.println("enter the number");
        Scanner scanner=new Scanner(System.in);
        int x = scanner.nextInt();
        if ( x%2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
}
