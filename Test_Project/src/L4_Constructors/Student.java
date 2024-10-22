package L4_Constructors;

public class Student {
    private int age;
    private String name;

    // default constructor
    public Student() {
        // overloading the default constructor.
        this.age = 10;
    }

    // parameterized constructor
    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
