package L5_Inheritance.humans;

public class Grandparent {
    private String name;

    private int age;

    private boolean hasSuperPowers;

    private int work;

    // constructor
    public Grandparent() {
        hasSuperPowers = true;
        this.work = 10;
        System.out.println("Grandparent Constructor called!");
    }

    public int getWork() {
        return work;
    }

    public void setWork(int work) {
        this.work = work;
    }

    // getters and setters
    public boolean getHasSuperPowers() {
        return hasSuperPowers;
    }

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
