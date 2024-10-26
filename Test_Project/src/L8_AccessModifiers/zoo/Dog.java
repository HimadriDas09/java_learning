package L8_AccessModifiers.zoo;

public class Dog extends Animal {

    // constructor
    public Dog(String name) {
        super(name, "Bark");
    }

    public void wagTail() {
        System.out.println(getName() + " is wagging it's tail. ");
    }

    private String getName() {
        // getClass(): return class object of the runtime object.
        // getSimpleName(): name(String) of the class object.
        return getClass().getSimpleName();
    }

    public void setDogSound(String newSound) {
        changeSound(newSound);
    }

}
