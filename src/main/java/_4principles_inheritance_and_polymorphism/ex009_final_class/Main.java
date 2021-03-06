package _4principles_inheritance_and_polymorphism.ex009_final_class;

final class FinalClass {
    public int x;
    public int y;
}

// Attempting to inherit from FinalClass results in a compiler error.
class DerivedClass { //extends FinalClass {   // Error
}

public class Main {
    public static void main(String[] args) {
        FinalClass instance = new FinalClass();
        instance.x = 100;
        instance.y = 200;

        System.out.println("x = " + instance.x + "y = " + instance.y);
    }
}