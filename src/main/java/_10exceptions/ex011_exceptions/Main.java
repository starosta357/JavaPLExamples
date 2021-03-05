package _10exceptions.ex011_exceptions;


public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 52};
        int a = 2, b = 2;

        try {
            System.out.println(a / b);
            System.out.println(arr[100]);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

}
