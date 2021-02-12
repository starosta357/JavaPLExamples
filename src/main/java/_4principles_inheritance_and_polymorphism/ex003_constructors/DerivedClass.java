package _4principles_inheritance_and_polymorphism.ex003_constructors;

public class DerivedClass extends BaseClass {
    public int derivedField;

    // default Constructor
    public DerivedClass()
    {
    }

    // Custom constructor.
    // When you create an object of a derived class, the constructor of the derived
    // class automatically calls the default constructor from the base class.
    // The constructor of the base class will assign some of its safe values to all data.
    // The derived class constructor will then begin to
    // redefine values for inherited members. (DOUBLE WORK)!
    public DerivedClass(int number1, int number2) {
        // We initialize the base class field.
        baseNumber = number1;

        // We initialize the field of the derived (given) class.
        derivedField = number2;
    }
}
