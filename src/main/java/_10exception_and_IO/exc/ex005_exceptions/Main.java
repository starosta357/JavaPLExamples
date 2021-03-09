package _10exception_and_IO.exc.ex005_exceptions;


// What you need to know:
// 1) we can create our custom exceptions, to do this we need to create a class and extends from the Exception

class UserException extends Exception {
    public void method() {
        System.out.println("My UserException");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new UserException();
        } catch (UserException e) {
            System.out.println("catch block");
            e.method();
        }
    }
}
