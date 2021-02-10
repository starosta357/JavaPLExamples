package _2flow_control_and_arrays.flow_control_first_part;

import java.util.Scanner;

public class Example11_Switch {

    public static void main(String[] args) {
        System.out.print("Enter number 1 or 2: ");

        // Accept user input.
        Scanner in = new Scanner(System.in);
        String number = in.next();

        switch (number) {
            case "1": {
                System.out.println("One");
                // Exit from switch
                break;
            }
            case "2": {
                System.out.println("Two");
                break;
            }
        }

        System.out.println("End");
    }
}
