package _5abstract_classes_and_interfaces.interfaces.ex008_interfaces;

interface Interface {
    void method();
}

class BaseClass {
    public void method() {
        System.out.println("BaseClass.method()");
    }
}

class DerivedClass extends BaseClass implements Interface {

    public DerivedClass(){

    }
    // Implementation of the interface is optional, because the signatures
    // of the methods in the class and the interface are the same.
}

public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();
        instance.method();

        Interface instance1 = (Interface) instance;
        instance1.method();
    }
}
