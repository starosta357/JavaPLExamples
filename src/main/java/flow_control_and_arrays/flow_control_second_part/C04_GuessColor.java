package flow_control_and_arrays.flow_control_second_part;

import java.util.Scanner;

public class C04_GuessColor {

    public static void main(String[] args) {
        System.out.println("Guess your intended color in five tries.");
        System.out.println("To exit the program, enter word - exit.");

        final int MAX_ATTEMPT = 5; // Number of attempts allowed.
        int attempt = 0;           // Attempt counter.
        String color = "red";      // Intended color.
        Scanner in = new Scanner(System.in);

        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("attempt number " + attempt + ":");
            String value = in.next();

            if (value.equals("exit")) {
                break;
            }

            if (!value.equals(color)) {
                continue;
            }

            System.out.println("Congratulations, you guessed. Attempt number: " + attempt);
            break;
        }

        System.out.println("Game over!");
    }
}
