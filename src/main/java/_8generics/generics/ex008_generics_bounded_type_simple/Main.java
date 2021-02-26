package _8generics.generics.ex008_generics_bounded_type_simple;

class Base {
}

class Derived extends Base {
}

// T extends Base - the type argument must be
// or be derived from the specified base class.
class MyClass<T extends Base> {
}

public class Main {
    public static void main(String[] args) {
        MyClass<Base> mc1 = new MyClass<>();

        MyClass<Derived> mc2 = new MyClass<>();

        //MyClass<String> mc3 = new MyClass<>(); // ERROR.
    }
}
