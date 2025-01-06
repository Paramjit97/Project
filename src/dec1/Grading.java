package dec1;

import java.util.Scanner;

public class Grading {
    public static void main(String[]args){
        System.out.println("enter the marks");
        Scanner scanner=new Scanner(System.in);
        int marks=scanner.nextInt();
        if (marks<=100 && marks>90){
          System.out.println("A+");
        }
        else if (90>=marks && marks>80 ){
            System.out.println("A");
        }
        else if (80>=marks && marks>70 ){
            System.out.println("B+");
        }
        else if (70>=marks && marks>60){
            System.out.println("B");
        }
        else if (60>=marks && marks>50 ){
            System.out.println("C+");
        }
        else if (50>=marks && marks>40 ){
            System.out.println("C");
        }
        else {
            System.out.println("Fail");
        }
    }
}
