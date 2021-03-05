package _10exceptions.ex002_exceptions;

public class Main {
    public static void main(String[] args) {
        // What you need to know:
        // 1) keyword throw - generate an exception
        // 2) exceptions in Java are objects
        Exception ex = new Exception("My Exception");

        try {
            throw ex;
        } catch (Exception e) {
            System.out.println("catch block");
            System.out.println(e.getMessage());
        }
    }
}
