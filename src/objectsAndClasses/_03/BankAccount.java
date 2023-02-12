package objectsAndClasses._03;

public class BankAccount {
    private static final double DEFAULT_INTEREST_RATE = 0.02;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private int id;
    private double balance;


    public double getInterest(int years){
        return this.balance * interestRate * years;
    }
    public void deposit(double balance){
        this.balance += balance;
    }
    public static void setInterestRate(double interest){
        interest = interest;
    }
}
