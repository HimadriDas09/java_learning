package L9_Exceptions.customExceptions;


public class Test {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10);
        try{
            bankAccount.withdraw(11);
        }
        catch(InsufficientFundsException e) {
            System.out.println(e.getAmount());
            System.out.println(e); // packageName : message -> if we're using pre-defined Exceptions.
        }
    }
}
