package L3_Encapsulation;

public class BankAccount {
    private long accNo;
    private long balance;

    public void withdraw(long amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;

            System.out.println(amount + " Successfully Withdrawn");
            System.out.println("remaining balance is : " + this.balance);

        } else if (amount < 0) {
            System.out.println("enter a positive amount to withdraw");
        } else {
            System.out.println("inserted amount exceeds your current balance");
        }
    }

    public void deposit(long amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Amount successfully deposited");
            System.out.println("Current balance is: " + this.balance);
        }
    }

}
