package L5_Inheritance;

import L5_Inheritance.animal.Cat;
import L5_Inheritance.animal.Dog;
import L5_Inheritance.humans.Children;

public class Test {
    public static void main(String[] args) {
        // Children child = new Children();

        // child.setAge(10);
        // System.out.println(child.getAge()); // 10

        // Dog dog = new Dog();
        // Cat cat = new Cat();

        // dog.sayHello(); // woff
        // cat.sayHello(); // meow

        Children child = new Children();
        // System.out.println(child.getHasSuperPowers());
        // System.out.println(child.getWork()); // 30

        child.childMethod();
    }
}
