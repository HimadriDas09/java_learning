package L9_Exceptions;

import jdk.jshell.spi.ExecutionControlProvider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test3 {
    /*
    public static void main(String[] args) throws Exception {
        // throws FileNotFoundException:
        // exception is added to method signature.
        // means that below code could throw an exception. So throw it
        // i.e whoever has called main(), it's his responsibility to handle the exception.
        // either handle the exception using try-catch OR throws the exception to above level.
        // i.e JVM in this case.

        FileReader fileReader = new FileReader("a.txt");

        System.out.println(1);
        System.out.println(2);
    }

     */

    public static void main(String[] args) throws Exception {
        try {
            method1();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("handling exception in main");
        }

//        method1();
    }

    private static void method1() throws IOException {
        // since method1() is calling method2(), so it's responsibility of method1() to handle
        // the exception.
        // if not: then throws the exception.

        method2();
    }

    private static void method2() throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");

            // we can also explicitly throw an error.
            // throw new ExceptionType(message)
            // (here) we're EXPLICITLY creating ExceptionType type OBJECT
            // i.e the same that's created when an exception occurs.

            // now, we've 2 choice: either handle it in this fn only: try-catch
            // OR it'll be implicitly propagated to it's parent method.

            // Now, in case of checked exception: eg: FileNotFoundException()
            // if we don't handle it here: we're get compilation error.
            // so to mention that it'll be handled somewhere along the hierarchy: we mention
            // throws ExceptionType at method signature (to resolve the compilation err)

            // But in case of unChecked exception.
            // we don't need to explicitly mention in the method signature.

//            throw new ArithmeticException("oops :o ");
            throw new FileNotFoundException("oops!");
//            try{
//
//            throw new FileNotFoundException("oops!");
//            }
//            catch(Exception ex) {
//                System.out.println("nested catch handled the FileNotFoundException :)");
//            }

        }
    }

}



/*
 *
 *   1. One way to handle error
 *
 *   try{
 *       FileReader fr = new FileReader("a.txt");
 *   }
 *   catch(Exception e) {

 *   }
 *
 *   -> we can also write:
 *       catch(IOException e) {..}
 *
 *
 *
 *
 * */