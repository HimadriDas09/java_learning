package L5_Inheritance.animal;

public class Dog extends Animal {

    // override the method sayHello 
    @Override
    public void sayHello() {
        System.out.println("woof!");
    }
}
