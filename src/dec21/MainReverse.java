package dec21;

import java.util.Scanner;

public class MainReverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int l=scanner.nextInt();
        int[]arry=new int[l];
        System.out.println("enter the numbers");
        for(int i=0;i<arry.length;i++){
            arry[i]=scanner.nextInt();
        }

        Reverse rev=new Reverse();
        rev.reverseArray(arry);

        System.out.println("Reverse Order is:");
        for(int element:arry){
            System.out.println(element);
        }
    }
}
