package _6nested_classes_enums_wrapper_classes.anonymous_classes.ex003_anonymous_classes;

// Anonymous classes.
interface Interface {
    void method();
}

public class Main {
    public static void main(String[] args) {
        //Anonymous (inner) class declaration
        Interface instance = new Interface() {
            public int publicField = 3;

            @Override
            public void method() {
                publicField = 1234;
                System.out.println("instance1: publicField = " + getPublicField());
            }

            public int getPublicField() {
                return publicField;
            }
        };

        instance.method();

        // Field not available
//         System.out.println(instance.getPublicField());
    }
}
