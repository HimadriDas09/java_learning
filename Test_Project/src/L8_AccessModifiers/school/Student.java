package L8_AccessModifiers.school;

public class Student {
    private String name;

    private int age;

    public Student() {
        System.out.println("Student constructor");
    }

    public void sayHello() {
        System.out.println("Hello from Student");
    }
}
