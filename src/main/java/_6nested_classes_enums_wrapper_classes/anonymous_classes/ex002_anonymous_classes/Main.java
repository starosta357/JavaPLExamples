package _6nested_classes_enums_wrapper_classes.anonymous_classes.ex002_anonymous_classes;

//Anonymous classes.
interface Interface {
    void method();
}

public class Main {
    public static void main(String[] args) {
        // Anonymous (inner) class declaration
        Interface instance = new Interface() {
            public double d = 1.3;
            protected String str = "Anonymous class";
            private int num = 10;

            @Override
            public void method() {
                num = 1234;
                System.out.println("instance1: d = " + d + ", str = " + str + ", num = " + num);
            }
        };
        instance.method();

        // Field not available
        // System.out.println(instance.d);
    }
}
