package _5abstract_classes_and_interfaces.static_members_repeat.ex001_static;

public class Main {
    public static void main(String[] args) {
        NotStaticClass instance1 = new NotStaticClass(1);
        NotStaticClass instance2 = new NotStaticClass(2);

        instance1.method();
        instance2.method();

        NotStaticClass.field = 1;

        instance1.method();
        instance2.method();
    }
}
