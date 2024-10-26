package L8_AccessModifiers.test;

public class School {
    // static methods: to access them with className only
    private static School instance;

    private School() {
        // so that no object can be created
    }

    public static School getInstance() {
        if (instance == null) {
            instance = new School();
        }

        return instance;
    }
}
