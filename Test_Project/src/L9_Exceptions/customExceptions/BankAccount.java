package L9_Exceptions.customExceptions;

public class BankAccount {
    public double balance;

    public BankAccount(double amount){
        this.balance = amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount > balance) {
            throw new InsufficientFundsException(amount);
        }
        balance -= amount;
    }
}
