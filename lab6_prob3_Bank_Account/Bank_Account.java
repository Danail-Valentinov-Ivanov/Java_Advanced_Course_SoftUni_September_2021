package lab6_prob3_Bank_Account;

public class Bank_Account {
    private static int accountCount = 1;
    private static double interestRate = 0.02;
    private int id;
    private double balance;

    public Bank_Account() {
        this.id = accountCount;
        accountCount++;
    }

    //    setInterestRate(double interest): void (static)
// getInterest(int Years): double
// deposit(double amount): void
    public static void setInterestRate(double interest) {
        interestRate = interest;
    }

    public double getInterest(int years) {
        return interestRate * years * balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public int getId() {
        return id;
    }
}
