package _4principles_inheritance_and_polymorphism.ex001_inheritance;

public class DerivedClass extends BaseClass {
    // Constructor.
    public DerivedClass() {
        // We change all available fields inherited from the base class.
        publicField = "DerivedClass.publicField";
        protectedField = "DerivedClass.protectedField";
    }
}
