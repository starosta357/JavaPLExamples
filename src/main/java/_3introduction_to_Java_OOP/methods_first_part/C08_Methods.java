package _3introduction_to_Java_OOP.methods_first_part;

import java.util.Scanner;

public class C08_Methods {

    static int addTwo(int a) {
        a = a + 2;
        System.out.println("value int a = " + a);
        return a;
    }

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner in = new Scanner(System.in);

        // Accept input from the user and convert it to an integer value

        String number = in.next();
        int result = Integer.parseInt(number);

        System.out.println("value result = " + result);
        result = 10;
        // Not the result variable itself is passed as an argument, but its copy.
        result = addTwo(result);
        System.out.println(addTwo(result));
        System.out.println(result);
    }
}
