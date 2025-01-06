package dec1;

import java.util.Scanner;

public class NegPos {
    public static void main(String[]args){
        System.out.println("enter the number");
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        if (x<0){
            System.out.println("negative");
        }
        else{
            System.out.println("positive");
        }
    }
}
