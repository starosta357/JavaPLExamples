package _5abstract_classes_and_interfaces.static_members_repeat.ex002_static;

// in the static method it is not possible to call for not static fields or methods.
public class Main {
    public static void main(String[] args) {
        NotStaticClass instance = new NotStaticClass(1);

        NotStaticClass.method();
    }
}
