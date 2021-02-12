package _4principles_inheritance_and_polymorphism.ex004_constructors;

public class BaseClass {
    public int baseNumber;

    // default Constructor
    public BaseClass() {
    }

    // Custom constructor.
    public BaseClass(int number) {
        this.baseNumber = number;
    }
}
