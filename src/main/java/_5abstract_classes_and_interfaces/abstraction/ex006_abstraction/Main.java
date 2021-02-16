package _5abstract_classes_and_interfaces.abstraction.ex006_abstraction;

abstract class AbstractClass {
    public AbstractClass() {
        System.out.println("1 AbstractClass()");

        this.abstractMethod();

        System.out.println("2 AbstractClass()");
    }

    public abstract void abstractMethod();
}

class ConcreteClass extends AbstractClass {
    String s = "FIRST";

    public ConcreteClass() {
        System.out.println("3 ConcreteClass()");
        s = "SECOND";
    }

    @Override
    public void abstractMethod() {
        System.out.println("Implementation of the method abstractMethod() v ConcreteClass  " + s);
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractClass instance = new ConcreteClass();

        System.out.println("-------------------------------");

        instance.abstractMethod();
    }
}
