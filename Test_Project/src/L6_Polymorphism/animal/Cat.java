package L6_Polymorphism.animal;

public class Cat extends Animal {
    String color;

    public Cat() {
        System.out.println("Cat constructor invoked");
    }

    @Override
    public void sayHello() {
        System.out.println("Meow!");
    }
}
