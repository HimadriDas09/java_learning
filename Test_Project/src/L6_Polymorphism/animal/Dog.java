package L6_Polymorphism.animal;

public class Dog extends Animal {
    int age = 10;

    @Override
    public int getAge() {
        System.out.println("getAge of Dog called!");
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public Dog() {
        System.out.println("Dog constructor invoked");
    }

    @Override
    public void sayHello() {
        System.out.println("Woof!");
    }

    public void bye() {
        System.out.println("woof woof");
    }
}
