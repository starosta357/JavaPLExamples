package _8generics.generics.ex009_generics_bounded_type_essential;

interface Interface1 {}

interface Interface2<U> {}

class Derived implements Interface1, Interface2<Object> {}

// T extends Interface1 and T extends Interface2<Object>
// so, type argument must be or implement the specified interface.
// The bounding interface can also be generic.

class MyClass1<T extends Interface1> {}

class MyClass2<T extends Interface2<Object>> {}

public class Main {
    public static void main(String[] args) {
        MyClass1<Interface1> my1 = new MyClass1<>();
        MyClass1<Derived> my2 = new MyClass1<>();

        MyClass2<Interface2<Object>> my3 = new MyClass2<>();
        MyClass2<Derived> my4 = new MyClass2<>();
    }
}
