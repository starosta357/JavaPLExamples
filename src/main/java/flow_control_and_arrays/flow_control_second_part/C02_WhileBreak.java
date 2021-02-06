package flow_control_and_arrays.flow_control_second_part;

public class C02_WhileBreak {

    public static void main(String[] args) {
        int counter = 0;

        while (counter < 3) {
            counter++;
            System.out.println("Counter " + counter);

            if (false) break;

            System.out.println("This line will not be printed.");
        }

        System.out.println("Produced " + counter + " iteration.");
    }
}
