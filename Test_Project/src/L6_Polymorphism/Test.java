package L6_Polymorphism;

import L5_Inheritance.animal.Animal;
import L5_Inheritance.animal.Dog;
import L5_Inheritance.animal.Cat;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sayHello();

        // runtime polymorphism.

        Animal bob = new Dog(); // base class reference can point to a child class object.

        bob.sayHello(); // But we can only access those methods via the baseClass reference that the baseClass has.

        // via the parent reference: you can only access methods, fields that are present in the parent class.

        // bob.bye(); -> ERROR
        // System.out.println(bob.age); // fields are not overriden BUT methods are.
        System.out.println(bob.getAge());
        // bob.wild(); // methods only present in the parent class van also be invoked.

        bob = new Cat();
        bob.sayHello();
    }
}
