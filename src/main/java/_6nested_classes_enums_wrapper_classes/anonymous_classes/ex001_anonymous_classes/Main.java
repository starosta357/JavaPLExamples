package _6nested_classes_enums_wrapper_classes.anonymous_classes.ex001_anonymous_classes;

//Anonymous classes.
interface Interface1 {
    void method();
}

public class Main {
    public static void main(String[] args) {
        // Anonymous (inner) class declaration
        Interface1 instance = new Interface1() {
            @Override
            public void method() {
                System.out.println("Call method() from anonymous class");
            }
        };

        // Calling a method of an object of an anonymous class
        instance.method();
    }
}
