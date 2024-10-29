package L9_Exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Test5 {
    public static void main(String[] args) {
        // try with resources i.e try()
        // within (): if we create an object of a class which implements the AutoCloseable Interface.
        // then it will automatically close.
        // we don't need to explicitly do it in finally block.

        try(BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {

        }
        catch(Exception e) {

        }
    }
}
