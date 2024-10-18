interface TwentySevenOperation {
    void deposit(double amount);
    double getBalance();
}

public class TwentySeven implements TwentySevenOperation {
    private double balance;

    public TwentySeven(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            // System.out.println("Deposited: " + amount);
        } else {
            // System.out.println("Invalid deposit amount");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        TwentySeven myTwentySeven = new TwentySeven(1000.0);
        myTwentySeven.deposit(5000.0);
        System.out.println("Current balance: " + myTwentySeven.getBalance());
    }
}

