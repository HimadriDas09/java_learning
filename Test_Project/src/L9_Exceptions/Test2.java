package L9_Exceptions;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(0);
        try {
            level1();

            // below try-catch is NOT executed if control directly goes to catch() of main method.
            try {
                divide(2, 0);
            } catch (Exception e) {
                System.out.println("catch of level 2");
                System.out.println(e);
            }

        } catch (Exception e) {
            System.out.println("catch of level 1");
            System.out.println(e);

            // we can also manually print the stack trace:
//            StackTraceElement[] stackTrace = e.getStackTrace();
//            for (int i = 0; i < stackTrace.length; i++) {
//                System.out.println(stackTrace[i]);
//            }

        }
        System.out.println("outside catch level 1");
    }

    private static void divide(int a, int b) {
        // ArithmeticException would happen here:
        // but it should propagate to it's parent && there we're catching the exception.
        System.out.println(a / b);
    }

    private static void level1() {
        level2();
    }

    private static void level2() {
        level3();
        System.out.println("hello from level 2 :) ");

        // TASK: resolve the error here && also write some more executable code in level3
        // ans) Control goes to level1, after complete execution of catch() of level2 and NOT to level3.
        // bcz level3() is out of the stack.
        // Control goes up the hierarchy(by popping out execution context from the top)
        // to check if any fn has handled the exception or not.
    }

    private static void level3() {
        try {
            throw new ArithmeticException("oops!");
            // above EXCEPTION is caught and handled by below catch block.

        } catch (Exception e) {
            System.out.println("catch of level3");
            System.out.println(e);
        }

//        int[] arr = new int[5];
//        arr[5] = 10;
        // Exception propagates from child to parent && to the top of the hierarchy.
        // so we can catch this exception in 'main' method also.
    }
}

/*
 *
 *   NOTE: after entering the catch block: the entire code of catch block is executed
 *   and then code after the catch is executed.
 *
 *   -> so if in 'main' we've written try-catch, then if exception arises in between somewhere of a fn
 *   && we've only written try-catch in main. Then from the fn, the Exception propagates to 'main'.
 *   && code of catch() is executed and then we get out of catch block.
 *
 *  point is : as soon as control goes from try -> catch. Then it doesn't return to try.
 *
 * */