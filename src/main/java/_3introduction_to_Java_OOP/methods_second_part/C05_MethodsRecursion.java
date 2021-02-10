package _3introduction_to_Java_OOP.methods_second_part;

public class C05_MethodsRecursion {
    // recursion (direct).

    // In the body of the recursion method, on the 15th line, the recursion method is called recursively.
    // Simple recursion is a method call to itself. With each call, a new copy of the method is built.

    static void recursion(int counter) {
        counter--;

        System.out.println("first part of the method: " + counter);

        if (counter != 0)
            recursion(counter);

        System.out.println("second part of the method: " + counter);
    }

    public static void main(String[] args) {
        recursion(3);
    }
}
