package _5abstract_classes_and_interfaces.interfaces.ex006_interfaces;


interface Interface {
    void method();
}

abstract class AbstractClass implements Interface {
    // Implementing an abstract method from an interface in an abstract class is optional.
    @Override
    public void method() {
        System.out.println("Method - implementation interface in an abstract class.");
    }
}

class ConcreteClass extends AbstractClass {
}

public class Main {
    public static void main(String[] args) {
        ConcreteClass instance = new ConcreteClass();
        instance.method();
    }
}
