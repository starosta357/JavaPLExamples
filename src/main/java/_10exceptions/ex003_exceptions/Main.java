package _10exceptions.ex003_exceptions;


public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.out.println("catch block");
            System.out.println(e.getMessage());
        }
    }
}
