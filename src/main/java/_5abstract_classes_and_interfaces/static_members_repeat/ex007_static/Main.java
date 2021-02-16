package _5abstract_classes_and_interfaces.static_members_repeat.ex007_static;

// Static members cannot be overridden or abstract.
// But static members support substitution.
abstract class BaseClass {
//    public abstract static void abstractStaticMethod(); // Error

    static int i =1;

    public static void staticMethod() {
        System.out.println("BaseClass.staticMethod");
    }
}

class DerivedClass extends BaseClass {
    public static void staticMethod() {
        System.out.println("DerivedClass.staticMethod");
    }
}

public class Main {
    public static void main(String[] args) {
        BaseClass.staticMethod();
        DerivedClass.staticMethod();
    }
}
