package flow_control_and_arrays.arrays;

public class C07_TwoDimentionalArrayFill {
    // Multidimensional arrays.
    public static void main(String[] args) {
        // The compiler determines the size of the array based on the initialization expression.
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(array);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.print("\n");
        }
    }
}
