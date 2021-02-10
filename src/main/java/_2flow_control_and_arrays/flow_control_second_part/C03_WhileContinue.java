package _2flow_control_and_arrays.flow_control_second_part;

public class C03_WhileContinue {

    public static void main(String[] args) {
        int counter = 0;

        while (counter < 3) {
            counter++;
            System.out.println("Counter " + counter);

            if (true) continue;

            System.out.println("This line will not be printed.");
        }

        System.out.println("Produced " + counter + " iteration.");
    }
}
