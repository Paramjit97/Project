package Assignment;

import java.util.Scanner;

public class ProductInventoryManagement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] products=new String[5];
        int[] price=new int[5];

        //values of the product
        System.out.println("Enter the products:");
        for(int j=0;j< products.length;j++){
            products[j]=scanner.next();
        }


        //price
        System.out.println("Enter the price:");
        for(int i=0;i< price.length;i++){
            price[i]=scanner.nextInt();
        }

        // price and product list
        for(int l=0;l<5;l++){
            System.out.println(products[l]+":"+price[l]);
        }

        //retrieve the price according to product name
        System.out.println("Enter the product name:");
        String nameP=scanner.next();
        boolean found=false;
        for(int i=0;i<5;i++){
            if(nameP.equals(products[i])){
                System.out.println("Price of the "+nameP+" is:"+price[i]);
                found=true;
                break;
            }
        }
            if (!found){
                System.out.println("not in the list");
            }
    }

}
