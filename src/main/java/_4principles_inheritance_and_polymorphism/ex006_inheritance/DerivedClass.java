package _4principles_inheritance_and_polymorphism.ex006_inheritance;

public class DerivedClass extends BaseClass {

    @Override
    public void method() {
        System.out.println("method from DerivedClass");
    }

    public void methodToCallParent() {
        super.method();
    }

}
