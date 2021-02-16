package _5abstract_classes_and_interfaces.abstraction.ex004_abstraction;

public abstract class AbstractBaseClass {

    public void simpleMethod() {
        System.out.println("AbstractBaseClass.simpleMethod");
    }

    public void overriddenMethod() {
        System.out.println("AbstractBaseClass.overriddenMethod");
    }

    abstract public void abstractMethod();
}
