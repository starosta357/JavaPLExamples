package _10exceptions.ex004_exceptions;


class MyClass {

    // What you need to know:
    // 1) keyword throws u can use to throws an Exception to the method which call this method
    // 2) Stack works by LiFo princeple.
    public void myMethod() throws Exception {
        Exception exception = new Exception("My Exception");
        throw exception;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            MyClass instance = new MyClass();
            instance.myMethod();
        } catch (Exception e) {
            System.out.println("Message: " + e.getMessage());
            System.out.println("Stack trace:");
            e.printStackTrace();
        }
    }
}
