package L9_Exceptions;

import L3_Encapsulation.Student;
import L8_AccessModifiers.zoo.Animal;
import L8_AccessModifiers.zoo.Dog;

public class Test {
    public static void main(String[] args) {
//        Animal animal = new Animal("tiger", "roar");
//        Animal animal2 = new Dog("ragnar");
//
//
//        System.out.println(animal); // getClass.getName() + "@" + Integer.toHexString(this.hashCode())

//        System.out.println(animal.getClass().getName());
//        System.out.println("hashcode of animal : " + animal.hashCode());
//        System.out.println("Integer.toHexString(hashcode of animal) : " + Integer.toHexString(animal.hashCode()));
//        System.out.println(animal2);

        int [] arr1 = {10 ,20 , 30 ,40};
        int [] arr2 = {2, 4, 0, 4};

        for(int i = 0; i < 10; i++) {
            try{
                System.out.println(divide(arr1[i], arr2[i]));
            }
            catch (Exception t) {
                System.out.println(t);
            }
        }

        System.out.println("Loop Executed :)");
    }

    public static int divide(int a, int b) {
//        return a/b; -> exception happened at this line
        try {
            return a/b;
        }
        catch(Exception e){
            System.out.println(e);
            return -1;
        }
    }
}

/*
 * Syntax Error: checked during compilation.
 *
 * 3 types or error:
 *
 * 1. syntax error.: compilation error i.e Program doesn't run.
 * 2. logical error: compiled BUT (wrong code implementation)
 * 3. runtime error: compiled BUT (program crash during execution)
 *
 *   Q) SO does that mean the Program will NOT run at all ?
 *   Ans) NO, the program may run for some time. But stops as soon as the error occurs.
 *   : i.e Before encountering error: program runs. But after encountering error: program stops and
 *   doesn't execute rest of the lines.
 *   : i.e Program RUNS except some cases (those cases are called EXCEPTIONS).
 *
 * -----------------------------------------------------------------------------------
 *
 *   1. Exception Handling: is the way to handle runtime errors so that normal flow of application
 *   can be maintained.
 *
 *   2. Exception is an event that DISRUPTS the NORMAL FLOW of the program. It is an OBJECT that is
 *   thrown at RUNTIME.
 *
 *   3. to handle exception, we use try-catch block.
 *   i.e try the code in try-block
 *   But if exception happen: execute the code in the catch block && continue the flow of program.
 *
 *   -> when exception happens: OBJECT is thrown which is caught by the catch-block, and it's code
 *   is executed.
 *
 *   catch ( ReferenceType refName ) {..}
 *
 * -----------------------------------------------------------------------------------
 *  NOTE:
 *      a. if we do :
 *          Student st = new Student();
 *          System.out.println(st); // o/p: Student@some_code
 *
 *      b. But if we do:
 *          System.out.println(e); // java.lang.ArithmeticException: / by zero
 *
 *          Q. why no the hash code here ?
 *          ans) when we do System.out.println(ref) : it runs the toString() method of the Object.
 *
 *          - 1st why does Student print className@hashCode ?
 *
 *          - bcz Every class we create, extends the class 'Object', in which there is a method
 *          named 'toString()'
 *
 *          public String toString(){
 *              return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *          }
 *
 *          But since a child class can Override the parent class method.
 *
 *          -> Student class hasn't overridden it && ArithmeticException class is using a
 *          overridden method.
 * ----------------------------------------------------------------------------------
 *
 * 1.       try{}
 *          catch(ArithmeticException t){}
 *          catch(Exception t) {}
 *
 * 2.       try{}
 *          catch(ArithmeticException | NullPointerException e) {}
 *
 *
 *
 * */
