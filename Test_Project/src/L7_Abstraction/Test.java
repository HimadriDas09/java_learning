package L7_Abstraction;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = new Dog(); // we can even take the reference of the ABSTRACT class.

        dog.sayHello();
        animal.sayHello();

        // Animal animal2 = new Animal();  ERROR

        // we cannot create an object of Animal class: bcz even if we could've created it, how could we've run ABSTRACT methods (whose definitions are not provided).
    }
}
