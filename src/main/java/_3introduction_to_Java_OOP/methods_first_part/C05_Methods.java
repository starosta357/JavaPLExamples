package _3introduction_to_Java_OOP.methods_first_part;

public class C05_Methods {

    static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static void main(String[] args) {
        int firstNumber = 2, secondNumber = 3;

        int sum = add(firstNumber, secondNumber);

        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
    }
}
