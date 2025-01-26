package Jan23;
// User-defined exception class
class NegativeBalanceException extends Exception {
    // Constructor that takes a message
    public NegativeBalanceException(String message) {
        super(message); // Call the parent Exception class constructor
    }
}


