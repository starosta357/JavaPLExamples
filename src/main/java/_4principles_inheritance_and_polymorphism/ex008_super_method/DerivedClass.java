package _4principles_inheritance_and_polymorphism.ex008_super_method;

public class DerivedClass extends BaseClass {

    @Override
    public void method() {
        // Calling a method of the base class.
        super.method();

        System.out.println("method from DerivedClass");
    }
}