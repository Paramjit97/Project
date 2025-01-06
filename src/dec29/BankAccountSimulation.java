package dec29;

import java.util.Scanner;

public class BankAccountSimulation {
    //intialize values
    String accountNumber;
    String accountHolderName;
    float balance;
    //constructor
    Scanner scanner=new Scanner(System.in);
    public BankAccountSimulation(String accountNumber,String accountHolderName,float balance){
    this.accountNumber=accountNumber;
    this.accountHolderName=accountHolderName;
    this.balance=balance;
    }
    //deposit
    public void Deposit(int amount){
        balance+=amount;
    }
    //withdraw
    public void withdraw(int amount){
        if(amount>balance){
            System.out.println("exceed the withdraw limit");
        }
        else {
            balance -= amount;
        }
    }
    //details
    public void DisplayDetails(){
        System.out.println("your net amount is:"+balance);
    }
    //choice
    public void selector(){
        System.out.println("choose an option:\n1.Deposit\n2.Withdraw");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("enter the amount to deposit");
                int amountD=scanner.nextInt();
                Deposit(amountD);
                System.out.println("deposit Succesful");
                DisplayDetails();
                break;
            case 2:
                System.out.println("enter the amount to withdraw");
                int amountW=scanner.nextInt();
                withdraw(amountW);
                System.out.println("withdraw successful");
                DisplayDetails();
                break;
            default:
                System.out.println("not valid");
    }
}
}
