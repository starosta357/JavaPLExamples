package flow_control_and_arrays.flow_control_second_part;

public class C05_DoWhile {

    public static void main(String[] args) {
        int counter = 0;

        do {
            counter++;
            System.out.println("Counter " + counter);
        }
        while (counter < 3);

        System.out.println("Produced " + counter + " iteration.");
    }
}
