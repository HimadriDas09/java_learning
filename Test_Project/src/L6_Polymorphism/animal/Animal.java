package L6_Polymorphism.animal;

public class Animal {
    private String name;
    int age = 5;

    public Animal() {
        System.out.println("Animal Constructor invoked");
    }

    public void sayHello() {
        System.out.println("...");
    }

    public void wild() {
        System.out.println("I am a wild animal!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        System.out.println("getAge of Animal called!");
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
