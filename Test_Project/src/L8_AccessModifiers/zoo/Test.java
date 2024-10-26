package L8_AccessModifiers.zoo;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("Lion", "Roar");

        // to check if we can access 'protected' in non-child + same package.: yes we can.
        animal.makeSound();
        animal.changeSound("meow");
        animal.makeSound();

    }
}
