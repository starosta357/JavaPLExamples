package _2flow_control_and_arrays.flow_control_first_part;

import java.util.Scanner;

public class Example13_Switch {
    public static void main(String[] args) {
        System.out.print("Enter the day of the week: 1-2-3-4-5-6-7: ");
        Scanner in = new Scanner(System.in);
        String day = in.next();

        switch (day) {
            // Sinking
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                System.out.println("This day of the week is Worker.");
                break;
            case "6":
            case "7":
                System.out.println("This day of the week is a day off.");
                break;

            default:
                System.out.println("You entered a non-existent day of the week.");
                break;
        }
    }
}
