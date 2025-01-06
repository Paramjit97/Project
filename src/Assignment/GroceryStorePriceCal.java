package Assignment;

import java.util.Scanner;

public class GroceryStorePriceCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]fruits=new String[6];
        double[]prices=new double[6];

        //add fruits name
        System.out.println("Enter the fruits");
        for(int i=0;i< fruits.length;i++){
            fruits[i]=scanner.next();
        }
        //add price
        System.out.println("Enter the price per/kg");
        for(int i=0;i< prices.length;i++){
            prices[i]=scanner.nextDouble();
        }
        System.out.println("Enter fruit you want");
        String fruitName=scanner.next();
        System.out.println("Enter kilos they want");
        int weight=scanner.nextInt();

        //cal the total price
        double netprice=0;
        for(int i=0;i<6;i++){
            if(fruits[i].equals(fruitName)){
                netprice=prices[i]*weight;
                break;
            }
        }
        System.out.println("The total price for "+fruitName+"is "+netprice);
    }
}
