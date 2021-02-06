package flow_control_and_arrays.flow_control_second_part;

public class C07_DoWhileContinue {

    public static void main(String[] args) {
        int counter = 0;

        do {
            counter++;
            System.out.println("Counter " + counter);

            if (true) continue;

            System.out.println("This line will not be printed.");
        } while (counter < 3);

        System.out.println("Produced " + counter + " iteration.");
    }
}
