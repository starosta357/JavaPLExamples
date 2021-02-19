package _6nested_classes_enums_wrapper_classes.anonymous_classes.ex004_anonymous_classes;

// Anonymous classes.
// Local variables are available in the anonymous class declaration block.
interface Interface {
    void method();
}

public class Main {
    public static void main(String[] args) {
        // Local variables are available in the anonymous class declaration block
        int n = 100;

        // Anonymous (inner) class declaration
        Interface instance = new Interface() {
            public int publicField = 11;

            @Override
            public void method() {
                publicField = n;
                System.out.println("instance: n = " + publicField);
            }
        };

        instance.method();
    }
}
