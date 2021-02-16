package _5abstract_classes_and_interfaces.interfaces.ex003_interfaces;

public class DerivedClass extends BaseClass implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Implementation of the method method1() iz Interface1");
    }

    public void method2() {
        System.out.println("Implementation of the method method2() iz Interface2");
    }
}
