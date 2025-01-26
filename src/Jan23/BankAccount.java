package Jan23;
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to withdraw money
    public void withdraw(double amount) throws NegativeBalanceException {
        if (amount > balance) {
            // Throw the user-defined exception if balance is insufficient
            throw new NegativeBalanceException("Insufficient funds! Cannot withdraw " + amount);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: " + balance);
    }
}


