package _4principles_inheritance_and_polymorphism.ex004_constructors;

public class DerivedClass extends BaseClass {
    public int derivedField;

    // default Constructor
    public DerivedClass() {
    }

    // Custom constructor.
    // the custom constructor of the base class is called
    // without having to assign values to the inherited
    // members in the constructor of the derived class.
    public DerivedClass(int number1, int number2) {
        super(number1);
        derivedField = number2;
    }
}
