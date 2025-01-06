package dec3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){
        System.out.println("*******************");
        System.out.println("Welcome to My Calculator");
        System.out.println("*****************");

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Div");
        System.out.println("5. Modulus");
        System.out.println("0. Exit");

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your choice");
        int operator = scanner.nextInt();


        switch(operator){
            case 1:
                System.out.println("Enter the first number");
                float x = scanner.nextFloat();

                System.out.println("Enter the second number");
                float y = scanner.nextFloat();

                float sum=x+y;
                System.out.println(sum);
                break;
            case 2:
                System.out.println("Enter the first number");
                float num1 = scanner.nextFloat();

                System.out.println("Enter the second number");
                float num2 = scanner.nextFloat();

                float diff=num1-num2;
                System.out.println(diff);
                break;
            case 3:
                System.out.println("Enter the first number");
                float a = scanner.nextFloat();

                System.out.println("Enter the second number");
                float b = scanner.nextFloat();

                float product=a*b;
                System.out.println(product);
                break;
            case 4:
                System.out.println("Enter the first number");
                float e = scanner.nextFloat();

                System.out.println("Enter the second number");
                float f = scanner.nextFloat();
                float divide=e/f;
                System.out.println(divide);
                break;
            case 5:
                System.out.println("Enter the first number");
                float g = scanner.nextFloat();

                System.out.println("Enter the second number");
                float h = scanner.nextFloat();
                float modulus=g%h;
                System.out.println(modulus);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("wrong input");
        }
    }
}

// in this exit doesnt work as it because it gonna scan the num everytime(first it cover all the scanner statments) so best method is to use the functions so there will be separate scanner and it exit as expected