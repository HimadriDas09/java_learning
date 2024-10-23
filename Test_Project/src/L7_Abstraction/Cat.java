package L7_Abstraction;

public class Cat extends Animal {

    // override the abstract method of parent class
    @Override
    public void sayHello() {
        System.out.println("meow");
    }
}
