package dec21;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] num=new int[10];
        // for numbers
        System.out.println("enter the numbers");
        for(int i=0;i<num.length;i++){
            num[i]=scanner.nextInt();
        }
        for(int number :num){
            System.out.println("Numbers are"+number);
        }

        // for fruits
        System.out.println("enter fruits");
        String[] fruits=new String[5];
        for(int j=0;j<fruits.length;j++){
            fruits[j]=scanner.next();
        }
        for(String fruit:fruits){
            System.out.println("list of fruits"+fruit);
        }

        //countries
        System.out.println("enter country name");
        String[] countries=new String[23];
        for(int k=0;k<countries.length;k++){
            countries[k]=scanner.next();
        }
        for(String country:countries){
            System.out.println("list of countries in NA:"+country);
        }
    }
}
