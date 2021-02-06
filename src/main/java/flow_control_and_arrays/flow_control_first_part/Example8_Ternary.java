package flow_control_and_arrays.flow_control_first_part;

public class Example8_Ternary {
    public static void main(String[] args) {
        int a = 1;
        double b = 0.0;
        int max; //0

        // Expressions [?] and [:]  - must be of the same type.

        max = (int)((a > b) ? a : b);

        // ... or use this

        max = (a > b) ? a : (int)b;

        System.out.println(max);
    }
}
