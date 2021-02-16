package _5abstract_classes_and_interfaces.static_members_repeat.ex005_constructors;

public class Main {
    public static void main(String[] args) {
        // 1 variant.
        NotStaticClass nc = new NotStaticClass();
        NotStaticClass nc1 = new NotStaticClass();
        NotStaticClass.staticMethod();

        // 2 variant.
//        new NotStaticClass().notStaticMethod();
    }
}
