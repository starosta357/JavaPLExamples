package _6nested_classes_enums_wrapper_classes.nested_classes.ex005_nestedclasses;


class MyClass extends BaseClass {
    public class Nested
    {
        public void methodFromNested() {
            System.out.println("Method from Nested class.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass instance1 = new MyClass();
        instance1.methodFromBase();

        MyClass.Nested instance2 = new MyClass().new Nested();
        instance2.methodFromNested();
    }
}
