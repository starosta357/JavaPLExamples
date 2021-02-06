package flow_control_and_arrays.flow_control_first_part;

public class Example5_Ternary {
    public static void main(String[] args) {
        int a = 1, b = 2, max;

        max = (a > b) ? a : b;   // If:  (a > b)  return:  a  else: return b;
        System.out.println(max);
    }
}
