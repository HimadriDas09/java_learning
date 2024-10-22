package L2_myPackage;

import L2_myPackage.TestOne.Cat;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sayHello();

        L2_myPackage.TestTwo.Cat ct = new L2_myPackage.TestTwo.Cat();
        ct.sayHello();
    }
}

// somePath(it's the classpath)> javac package1/package2/myClass.java
// Since in myClass.java: 1st line: package package1/package2;

// so when it compiles it, it looks for package1/package2 from the classpath only.

// But if we'd have done: prev classpath/package1/package2> javac myCLass.java
// compilation failed bcz: from the new classpath, it cannot find package1/package2 as mentioned in myClass.java