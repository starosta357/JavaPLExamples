package _6nested_classes_enums_wrapper_classes.nested_classes.ex006_nestedclasses;

class MyClass {

    public static class Nested {

        public static void staticMethodFromNested() {
            System.out.println("static method in Nested class.");
        }

        public void helper() {
            System.out.println("helper.");
        }

    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Nested nested = new MyClass.Nested();
        nested.helper();
        MyClass.Nested.staticMethodFromNested();
    }
}
