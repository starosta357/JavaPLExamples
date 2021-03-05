package _10exceptions.ex008_exceptions;


class UserException extends Exception {
    public void method() {
        System.out.println("My exception!");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new UserException();
        } catch (UserException userException) {
            System.out.println("first catch block");
            userException.method();

            try {
                throw userException;
            } catch (UserException exception) {
                System.out.println("second catch block");
                exception.method();
            }
        } finally {
            System.out.println("finally block.");
        }

        System.out.println("the end.");
    }
}
