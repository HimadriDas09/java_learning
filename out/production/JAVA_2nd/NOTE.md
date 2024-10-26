**NOTE :**

1. For a CHILD class to Override a method, it should be able to access the PARENT method first.

   - Now if the method is 'private' (i.e cannot be accessed outside it's class) -> then CHILD class cannot access it && therefore CANNOT Override it.

2. taking string input after Integer/float/double input
   -> before that take an empty line input.

   ```java

       int a = sc.nextInt();
       sc.nextLine(); // here
       String str = sc.nextLine();
       int b = sc.nextInt();

   ```

## 2. ABSTRACTION

0. Case: You don't want to define the method i.e (DO NOT want to provide a method body) but just declare it: declare it as an ABSTRACT method.

- Abstract methods can be overriden by the child class method.

- abstract methods are present in abstract classes only.

1.  can abstract class contain regular methods, fields ?
    -> YES

2.  methods with definition are called: concrete methods
    methods without definition : abstract methods

3.  an ABSTRACT class may not necessarily have ABSTRACT methods.

4.  Now, if we create a child class of this ABSTRACT class: we'll get an error i.e(either declare CHILD class as ABSTRACT or override the abstract methods of parent class).

5.  we CANNOT create objects of ABSTRACT class. But we can take it's reference to point to it's child class instance.

6.  USECASE of abstract classes:
    -> They can enforce that certain methods should be declared + defined in their child classes.

7.  Abstract methods should be public/protected: bcz if PRIVATE then child class cannot access it && Therefore cannot Override it.

    -> A SUBCLASS can access a PROTECTED method, even outside the package of the PARENT class.

    -> BUT in case of private: subclass cannot access PROTECTED methods from same package + from outside the package.

    -> So, if we make ABSTRACT METHOD as PROTECTED, then it cannot be accessed outside the class UNLESS it's a SUBCLASS which is trying to access it.

8.  GOOD PRACTICE: Constructor of ABSTRACT classes should not be 'public' constructor. bcz constructor of abstract classes CAN only be called via constructor of subclass. Since cannot create object of abstract clas
