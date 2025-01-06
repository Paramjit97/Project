package dec3;

import java.util.Scanner;

public class IVR {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to rfg customer care..");
        System.out.println("kindly enter 1 for english and 2 for french or 0 to exit");
        int choice=scanner.nextInt();
        System.out.println("You have entered:" + choice);
        while(choice!=0) {
            switch (choice) {
                case 1:
                    System.out.println("press 1 for internet.press 2 for " +
                            "mobile plans,press 3 for Technical support ," +
                            "press 4 for home wifi plans and press 6 for return to main menu");
                    int subchoice = scanner.nextInt();
                    while(subchoice!=0) {
                        switch (subchoice) {
                            case 1:
                                System.out.println("select 1 for billing.2 for " +
                                        "change in plan,3 for checking the " +
                                        "balance,6 to cut the call and 0 to return to previous menu");
                                int ioptions = scanner.nextInt();
                                while (ioptions!=0) {
                                    switch (ioptions) {
                                        case 1:
                                            System.out.println("this is your billing information");
                                            break;
                                        case 2:
                                            System.out.println("new plans are available");
                                            break;
                                        case 3:
                                            System.out.println("your balance is:");
                                            break;
                                        default:
                                            System.out.println("invalid");;
                                            break;
                                    }
                                    ioptions=scanner.nextInt();
                                }
                                break;
                            case 2:

                                System.out.println("select 1 for iphone " +
                                        "2 for samsung,3 for data and mobile offer " +
                                        "balance,6 to return to previous menu and 0 to return to main menu");
                                int mpoptions = scanner.nextInt();
                                while (mpoptions!=0) {
                                    switch (mpoptions) {
                                        case 1:
                                            System.out.println("these are new iphone offers");
                                            break;
                                        case 2:
                                            System.out.println("these are plans for samsung");
                                            break;
                                        case 3:
                                            System.out.println(" here are new data and mobile offers");
                                            break;
                                        default:
                                            System.out.println("invlaid:");;

                                    }
                                    mpoptions=scanner.nextInt();
                                }
                                break;
                            case 3:
                                System.out.println("select 1 for monthly " +
                                        "2 for yearly,3 for wifi and mobile offer " +
                                        "balance,6 to return to previous menu and 0 to return to main menu");
                                int woptions = scanner.nextInt();
                                while (woptions!=0) {
                                    switch (woptions) {
                                        case 1:
                                            System.out.println("monthly done");
                                            break;
                                        case 2:
                                            System.out.println("yearly done");
                                            break;
                                        case 3:
                                            System.out.println("wifi and mobile");
                                            break;
                                        default:
                                            System.out.println("invalid");;
                                            break;
                                    }
                                    woptions=scanner.nextInt();
                                }
                                break;
                            default:
                                System.out.println("invlaid choice");
                                break;
                        }
                        subchoice=scanner.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("frenchhhh menu");
                    break;
                default:
                    System.out.println("enter vaild:");
                    break;
            }
            choice=scanner.nextInt();
        }
    }
}
