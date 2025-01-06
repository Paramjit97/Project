package Assignment;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class EcommerceSalesAnalysis {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[]products=new String[7];
        int[]sales=new int[7];

        //product enter
        System.out.println("Enter the products");
        for(int i=0;i<7;i++){
            products[i]=scanner.next();
        }

        //enter sales
        System.out.println("Enter the sale");
        for (int i=0;i<7;i++){
            sales[i]=scanner.nextInt();
        }

        // check sale
        System.out.println("enter the product:");
        String productName=scanner.next();
        boolean found=false;
        for (int i=0;i<7;i++){
            if(products[i].equals(productName)){
                System.out.println("Total sale for "+productName+" is "+sales[i]);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Product is not in the list");
        }
    }
}
