package _5abstract_classes_and_interfaces.interfaces.ex004_interfaces;

interface Interface1 {
    void method1();
}

interface Interface2 extends Interface1 {
    void method2();
}

class ConcreteClass implements Interface2 {
    public void method1() {
        System.out.println("method1 - implementation interface Interface1");
    }

    public void method2() {
        System.out.println("method2 - implementation interface Interface2");
    }
}

public class Main {
    public static void main(String[] args) {
        ConcreteClass instance = new ConcreteClass();
        instance.method1();
        instance.method2();

        Interface1 instance1 = (Interface1) instance;
        instance1.method1();

        Interface2 instance2 = (Interface2) instance;
        instance2.method1();
        instance2.method2();
    }
}
