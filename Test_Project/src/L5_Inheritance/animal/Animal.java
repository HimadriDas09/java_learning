package L5_Inheritance.animal;

public class Animal {
    private String name;
    private int age;

    public void sayHello() {
        System.out.println("");
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}