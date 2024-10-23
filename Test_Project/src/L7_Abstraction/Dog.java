package L7_Abstraction;

public class Dog extends Animal {

    // overriden the abstract method in child class.
    @Override
    public void sayHello() {
        System.out.println("woof");
    }

    Dog() {
        System.out.println("Dog constructor");
    }

}
