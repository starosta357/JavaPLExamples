package _3introduction_to_Java_OOP.methods_second_part;

public class C09_MethodsFactorial {
    // Finding the factorial of a number.

    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int factorial = factorial(5);

//        int factorial = factorial(13);

        System.out.println(factorial);
    }

}
