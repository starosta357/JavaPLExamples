package _5abstract_classes_and_interfaces.static_members_repeat.ex006_abstract_class;

public abstract class AbstractClass {
    // A static factory method.
    public static AbstractClass createObject() {
        return new ConcreteClass();
    }

    public abstract void method();
}

