package L3_Encapsulation;

public class Student {
    // stop the access of instance variables to other classes : make private
    // so they can only be access within their own class

    private String name;
    private int age;
    private int rollNumber;

    // getters and setters methods
    public void setAge(int age) {
        if (age < 0) {
            age = 0;
        }
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return this.age;
    }

    public void getInfo() {
        System.out.println(getAge());
        System.out.println(getName());
        System.out.println(getRollNumber());
    }
}
