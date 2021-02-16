package _5abstract_classes_and_interfaces.interfaces.ex007_interfaces;

interface Interface {
    void method();
}

abstract class AbstractClass implements Interface {
    //  Overwriting an abstract method from an interface in an abstract class is optional.
    public abstract void method();
}

class ConcreteClass extends AbstractClass {
    // Implementation of an abstract method from an abstract class, in a concrete class is required.
    public void method() {
        System.out.println("Method - implementation interface in an abstract class.");
    }
}

public class Main {
    public static void main(String[] args) {
        ConcreteClass instance = new ConcreteClass();
        instance.method();
    }
}
