package L1_Methods;

public class Test {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int ans = sum(a); // static members an only access other static members of the class.
        System.out.println(ans);

        String str = "   himadri   ";
        System.out.println(toUpperCase(str)); // a public method of a class was able to call it's private methods

        int x = 2;
        System.out.println(mulitplyBy10(x)); // ALWAYS: argument value is copied to the method parameter receiving it.
        System.out.println(x);

        String myString = "bulbul"; // myString: reference to the String object.
        System.out.println(upper(myString));
        // argument: reference, parameter: reference. But strings are immutable in java:
        // any operation on the string will result in creation of a new string.

        System.out.println(myString);

        Cat cat = new Cat("bob");
        makeCatUpperCase(cat);

        System.out.println(cat.name);

        // get sum of all arguments
        System.out.println(getSum(1, 2, 3, 4, 5, 6, 7));
    }

    // change the name of cat in the created object only
    private static void makeCatUpperCase(Cat c) {
        c.name = c.name.toUpperCase(); // newly created string is assigned
    }

    public static int sum(int[] arr) {
        int res = 0;

        for (int i : arr) {
            res += i;
        }

        return res;
    }

    private static String toUpperCase(String str) {
        return str.trim().toUpperCase();
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    // method overriding: i.e same method name, return type but different parameters
    /*
     * we cannot have 2 methods with same signature(i.e name + list of paramters(i.e
     * data types is considered of them && NOT name))
     */
    private static int sum(int a, int c, int b) {
        return a + c + b;
    }

    // receive all arguments in an array
    private static int getSum(int... arr) {
        int res = 0;
        for (int i : arr)
            res += i;

        return res;
    }

    private static int mulitplyBy10(int x) {
        return x * 10;
    }

    private static String upper(String s) {
        return s.toUpperCase();
    }

}
