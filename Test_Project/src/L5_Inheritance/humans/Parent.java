package L5_Inheritance.humans;

public class Parent extends Grandparent {
    private int work;

    public Parent() {
        this.work = super.getWork() + 10;

        System.out.println("Parent's constructor called!");
    }

    public void parentMethod() {
        System.out.println("Parent Method");
    }

    public int getWork() {
        return work;
    }

    public void setWork(int work) {
        this.work = work;
    }
}
