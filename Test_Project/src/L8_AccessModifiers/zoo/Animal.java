package L8_AccessModifiers.zoo;

public class Animal {
    private String name;

    protected String sound;

    // constructor
    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(name + " make sound: " + sound);
    }

    // protected: can only be accessed within this class or it's children class.
    protected void changeSound(String newSound) {
        this.sound = newSound;
    }
}
