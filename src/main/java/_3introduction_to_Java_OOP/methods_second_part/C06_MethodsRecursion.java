package _3introduction_to_Java_OOP.methods_second_part;

public class C06_MethodsRecursion {
    // Recursion (indirect).
    // Indirect recursion -  calling a method itself, through another method.

    static void recursion(int counter) {
        counter--;

        System.out.println("first part of the recursion: " + counter);

        if (counter != 0)
            method(counter);

        System.out.println("first part of the recursion: " + counter);
    }

    static void method(int counter) {
        System.out.println("first part of the method: " + counter);

        recursion(counter);

        System.out.println("first part of the method: " + counter);
    }

    public static void main(String[] args) {
        method(3);
    }
}

