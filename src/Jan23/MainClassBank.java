package Jan23;

public class MainClassBank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);

        try {
            account.withdraw(600);  // Attempt to withdraw more than available balance
        } catch (NegativeBalanceException e) {
            System.out.println("Error: " + e.getMessage());  // Handle the exception
        }

        System.out.println("Program continues...");
    }

}
