package dec1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[]args){
        System.out.println("enter the year");
        Scanner scanner=new Scanner(System.in);
        int Year=scanner.nextInt();
        if (Year%4==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Common Year");
        }
    }
}
