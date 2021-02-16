package _5abstract_classes_and_interfaces.static_members_repeat.ex005_constructors;

public class NotStaticClass {
    // Instance constructor, called only when the class is instantiated.
    public NotStaticClass() {
        System.out.println("Constructor.");
    }

    // static block will called in any case,
    // both when accessing a static member and when instantiating a class.
    static {
        System.out.println("Static block.");
    }

    public static void staticMethod() {
        System.out.println("staticMethod");
    }

    public void notStaticMethod() {
        System.out.println("notStaticMethod");
    }
}
