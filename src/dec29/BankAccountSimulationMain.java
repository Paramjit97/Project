package dec29;

import java.util.Scanner;

public class BankAccountSimulationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input details
        System.out.println("How many people entries");
        int people = scanner.nextInt();
        for (int i = 0; i < people; i++) {
            System.out.println("Account Number:");
            String accNum = scanner.next();
            System.out.println("Account Holder Name:");
            String name = scanner.next();
            System.out.println("Initial Value:");
            float bal = scanner.nextFloat();

            //ask for number of people
            BankAccountSimulation BankAccount = new BankAccountSimulation(accNum, name, bal);

            //calling
            BankAccount.selector();
        }
    }
}
