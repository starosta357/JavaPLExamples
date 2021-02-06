package flow_control_and_arrays.flow_control_second_part;

public class C11_ForContinue {

    public static void main(String[] args) {
        for (int counter = 0; counter < 3; counter++) {
            System.out.println("Counter = " + counter);

            if (true) continue;

            System.out.println("This line will not be printed.");
        }
    }
}
