package _2flow_control_and_arrays.flow_control_first_part;

public class Example6_Ternary {
    public static void main(String[] args) {
        int a = 1, b = 2, c, max;

        max = a > b ? (c = a) : (c = b); // first of all: c = a, and then: max = c
        System.out.println(c);
        System.out.println(max);
    }
}
