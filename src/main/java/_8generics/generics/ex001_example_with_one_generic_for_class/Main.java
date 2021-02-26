package _8generics.generics.ex001_example_with_one_generic_for_class;

//create a class named MyClass, parameterized by a placeholder with type - T
class MyClass<T> {
    public T field;

    public void method() {
        System.out.println(field.getClass());
    }
}

public class Main {
    public static void main(String[] args) {
        // We create an instance of the MyClass class and pass
        // the String type as a type parameter (type MyClass).
        MyClass<String> instance1 = new MyClass<String>();
        instance1.field = "ABC";
        instance1.method();

        // You cannot pass primitive types
        // (int, long, float, double, and so on) as a type parameter.
        //MyClass<int> instance2 = new MyClass<int>();
        //instance2.method();

        // We create an instance of the class MyClass and pass the
        // Integer type as a type parameter (type MyClass).
        MyClass<Integer> instance3 = new MyClass<Integer>();
        instance3.field = 1234;
        instance3.method();
    }
}
