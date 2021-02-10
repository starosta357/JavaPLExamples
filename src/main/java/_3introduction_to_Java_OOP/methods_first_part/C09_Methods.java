package _3introduction_to_Java_OOP.methods_first_part;

import java.util.Scanner;

public class C09_Methods {
    // A parameter passed by value is destroyed when the method returns a value.
    // To get a modified result, use the return keyword

    static int addTwo(int a) {
        a = a + 2;
        System.out.println("Значение int a = " + a);
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);

        // Accept input from the user and convert it to an integer value

        String number = in.next();
        int result = Integer.parseInt(number);

        System.out.println("value result = " + result);

        // Set the variable result to the value returned by the addTwo () method
        result = addTwo(result);
        System.out.println("value result = " + result);
    }
}
