package _4principles_inheritance_and_polymorphism.ex007_override;

public class DerivedClass extends BaseClass {
    // Overriding a base class method.

    @Override
    public void method() {
        System.out.println("method from DerivedClass");
    }

}
