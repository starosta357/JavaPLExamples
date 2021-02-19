package _6nested_classes_enums_wrapper_classes.nested_classes.ex004_nestedclasses;


class MyClass { // extends from BaseClass not works.
    public class Nested extends BaseClass {
        public void methodFromNested() {
            System.out.println("Method Nested class.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Nested instance = new MyClass().new Nested();

        instance.methodFromBase();
        instance.methodFromNested();
    }
}
