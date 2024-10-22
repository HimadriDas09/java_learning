package L4_Constructors;

public class Test {
    public static void main(String[] args) {
        Student st = new Student();
        Student st2 = new Student("abc", 1);
        Student st3 = new Student("def");

        System.out.println(st.getAge());
        System.out.println(st2.getAge());

        System.out.println(st3.getName());
        System.out.println(st3.getAge()); // 0
    }
}
