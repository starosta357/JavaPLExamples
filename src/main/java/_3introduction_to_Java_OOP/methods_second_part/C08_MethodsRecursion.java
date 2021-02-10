package _3introduction_to_Java_OOP.methods_second_part;

public class C08_MethodsRecursion {
    // Finding the Greatest Common Divisor (GCD) of Two Integers

    // first approach:

    static int calculate(int a, int b) {
        if (a % b == 0)
            return b;
        else
            return calculate(b, a % b);
    }

    public static void main(String[] args) {

        System.out.println("Finding the Greatest Common Divisor of Two Integers");

        int a = 676, b = 3676;

        System.out.println("a = " + a + ", b = " + b + ", GCD = " + calculate(a, b) + ";");
    }

    // second approach

    static int calculate2(int a, int b) {
        while (b != 0)
            b = a % (a = b);
        return a;
    }
}
