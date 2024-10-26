package L8_AccessModifiers.test;

import L8_AccessModifiers.zoo.Dog;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Bob");

        dog.makeSound();
        dog.setDogSound("modified bark");
        dog.makeSound();
        dog.wagTail();

    }
}