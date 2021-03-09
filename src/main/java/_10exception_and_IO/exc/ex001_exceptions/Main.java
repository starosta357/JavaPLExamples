package _10exception_and_IO.exc.ex001_exceptions;

public class Main {
    public static void main(String[] args) {
        // What you need to know:
        // 1) Definition of exception: An exception is an event that occurs during the EXECUTION(not compilation)
        // of a program that disrupts the normal flow of instructions.
        // 2) We use next keywords in Java to work with exception: try/catch/finally
        // 3) finally block is not mandatory.
        // 4) if in try block exception appear ->
        // catch block start to execution not the next line in try block section
        // 5) if try block works without exception, catch block will be skipped
        // 6) finally block will be executed in any case, with exception in try or without
        // 6.1) it is possible to use try/finally block and try/catch/finally block
        // 7) Exists checked and unchecked exceptions
        // 8) checked exception must be or in try/catch blocks handled or clearly write in method signature that this
        // method throws this exception. if not -> compilation error
        // 9) unchecked - can be without handling for the compilation
        // 10) it is possible to have more than one catch blocks

        int a = 1, n = 2;

        try {
            // Attempted division by zero.
            a = a / (2 - n);
            System.out.println("a = " + a);
        } catch (Exception e) {
            System.out.println("catch block.");
            System.out.println(e.getMessage());
        }
    }
}
