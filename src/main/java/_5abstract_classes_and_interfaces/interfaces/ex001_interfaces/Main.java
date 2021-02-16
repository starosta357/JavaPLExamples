package _5abstract_classes_and_interfaces.interfaces.ex001_interfaces;

interface Interface {
    void method();
}

class MyClass implements Interface {
    @Override
    public void method() {
        System.out.println("Method - Interface.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass my = new MyClass();

        my.method();
    }
}
