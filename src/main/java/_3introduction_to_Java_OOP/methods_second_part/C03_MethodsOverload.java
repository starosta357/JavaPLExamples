package _3introduction_to_Java_OOP.methods_second_part;

public class C03_MethodsOverload {
    // Method overloading.

    static void operation() {                                           // first Overload.
        operation("val", 10, 12.2);
    }

    static void operation(String value1) {                              // second Overload.
        operation(value1, 10, 12.2);
    }

    static void operation(String value1, int value2) {                  // third Overload.
        operation(value1, value2, 12.2);
    }

    static void operation(String value1, int value2, double value3) {
        System.out.println(value1 + ", " + value2 + ", " + value3);
    }

    public static void main(String[] args) {
        operation();
        operation("val");
        operation("val", 10);
        operation("val", 10, 12.2);
    }
}
