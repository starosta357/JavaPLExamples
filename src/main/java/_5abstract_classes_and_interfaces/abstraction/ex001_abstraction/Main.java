package _5abstract_classes_and_interfaces.abstraction.ex001_abstraction;


abstract class AbstractClass {
    public abstract void method();
}

class ConcreteClass extends AbstractClass {
    public void method() {
        System.out.println("Implementation");
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractClass instance = new ConcreteClass();

        instance.method();
    }
}
