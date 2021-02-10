package _2flow_control_and_arrays.flow_control_first_part;

import java.util.Scanner;

public class Example14_CoffeeMachine {

    public static void main(String[] args) {
        // We invite the user to choose a drink.
        System.out.println("Sizes of coffee cups: 1 = Small, 2 = Medium, 3 = Large");
        System.out.print("Please make your choice: ");

        // Accept user input.
        Scanner in = new Scanner(System.in);
        String coffeeSize = in.next();

        int cost = 0;

        switch (coffeeSize) {
            case "3":
                cost += 50;
            case "2":
                cost += 25;
            case "1":
                cost += 25;
                break;
            default:
                System.out.println("Wrong choice. Please select 1, 2, or 3.");
                break;
        }

        if (cost != 0) {
            System.out.println("You need to pay " + cost + "$");
            System.out.println("Thanks!");
        } else {
            System.out.print("Please reselect.");
        }
    }
}
