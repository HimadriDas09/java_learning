package L9_Exceptions;

public class Test4 {
    public static void main(String[] args) {
        System.out.println(divide(1, 0));
    }

    public static int divide(int a, int b) {
        try{
            return a/b;
        }
        catch(Exception e) {
            System.out.println(e);
            return -1;
        }
        finally {
            // finally block is always executed.
            // if we're returning from either try or catch. 1st run finally and then perform
            // return statement.
            System.out.println("Bye");
//            return 1; -> 1 is returned from divide method.
        }
    }
}

/*
*
* 1. usecase of finally:
*   - used to close/ terminate the use of resources, if we're using one.
*   - eg: DB connections, if we'll not be using it anymore: close the connection.
*
*   - bcz finally block always runs(after try/catch/both).
*
*
*
* */
