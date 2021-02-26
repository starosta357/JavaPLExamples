package _8generics.generics.ex010_generics_bounded_type_final;

interface Interface1 { /* ... */
}

interface Interface2<U> extends Interface1 { /* ... */
}

class Derived implements Interface1, Interface2<Object> { /* ... */
}

class Derived2 implements Interface2<Object> { /* ... */
}

// where T : Interface, Interface<Object> -
// type argument must be or implement the specified interface.
// Several interface restrictions can be set.
// The bounding interface can also be generic.

class MyClass<T extends Interface1> { /* ... */
}

class MyClass2<T extends Interface2<Object>> { /* ... */
}

public class Main {
    public static void main(String[] args) {
        //  The type argument is fine because Interface <Object> inherits from Interface
        MyClass<Interface2<Object>> my1 = new MyClass<>();
        MyClass2<Derived> my2 = new MyClass2<>();
        MyClass2<Derived2> my3 = new MyClass2<>();
        MyClass2<Interface2<Object>> my4 = new MyClass2<>();
    }
}
