package L9_Exceptions.customExceptions;

public class InsufficientFundsException extends Exception{
    private double amount;

    // we can also override the toString() method of Throwable class.
    // which is NOT recommended.
    // RATHER, we should pass the message to constructor. To print the class name : message.

    @Override
    public String toString() {
        return "You don't have enough money!";
    }

    // constructor
    public InsufficientFundsException(double amount){
//        super("What do you want ? You don't have money");
        this.amount = amount;
    }


    public double getAmount() {
        return amount;
    }
}

/*
*
* 1. customException extends the Exception class.
*
* 2. we can write any logic, bcz we're creating a class which is extending 'Exception' class.
*
* */