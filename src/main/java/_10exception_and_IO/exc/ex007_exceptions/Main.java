package _10exception_and_IO.exc.ex007_exceptions;


public class Main {
    public static void main(String[] args) {
        int a = 1, n = 2;

        try {
            System.out.println("Attempted division by zero.");
            System.out.println("a / (2 - n) = " + (a / (2 - n)));
        } catch (Exception e) {
            System.out.println("catch block.");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally block.");
        }

        System.out.println("the end.");
    }
}
