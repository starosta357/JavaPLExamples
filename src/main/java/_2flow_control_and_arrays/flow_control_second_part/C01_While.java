package _2flow_control_and_arrays.flow_control_second_part;

public class C01_While {

    public static void main(String[] args) {
        int counter = 0;

        while (counter < 3) {
            counter++;
            System.out.println("Counter: " + counter);
        }

        System.out.println("Produced " + counter + " iteration.");
    }
}
