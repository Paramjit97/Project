package dec29;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the length ");
        int i=scanner.nextInt();
        int[]arr=new int[i];
        System.out.println("Enter the numbers");
        for(int j=0;j<arr.length;j++){
            arr[j]=scanner.nextInt();
        }
        int sum=0;
        for(int k=0;k<arr.length;k++){
            sum+=arr[k];
        }
        System.out.println("Sum  of all the numbers is:"+sum);
    }
}
