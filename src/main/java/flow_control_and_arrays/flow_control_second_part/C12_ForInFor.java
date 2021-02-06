package flow_control_and_arrays.flow_control_second_part;

public class C12_ForInFor {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            // Move to a new line.
            System.out.println();
        }
    }
}
