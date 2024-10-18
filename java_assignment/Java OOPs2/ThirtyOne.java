class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(double balance, double withdrawalAmount) {
        super("Insufficient Balance !! Current balamce is" + balance );
    }
}

public class ThirtyOne {
    public static void main(String[] args) {
        try {
            double balance = 100.0;
            double withdrawalAmount = 150.0;

            if (withdrawalAmount > balance) {
                throw new InsufficientBalanceException(balance, withdrawalAmount);
            }

            balance -= withdrawalAmount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
