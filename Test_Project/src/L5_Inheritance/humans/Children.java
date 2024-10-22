package L5_Inheritance.humans;

public class Children extends Parent {
    private int work;

    public Children() {
        super(); // super() is hidden by default: we don't need to explicitely call it.
        // super: represent parent class.
        this.work = super.getWork() + 10; // super.work -> error: bcz even via super we cannot access a private field.
        System.out.println("Children's constructor called!");
    }

    public void childMethod() {
        System.out.println("Child method");
        super.parentMethod();
    }

    public int getWork() {
        return work;
    }

    public void setWork(int work) {
        this.work = work;
    }

}
