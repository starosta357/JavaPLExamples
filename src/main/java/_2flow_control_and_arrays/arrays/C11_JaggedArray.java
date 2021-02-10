package _2flow_control_and_arrays.arrays;

public class C11_JaggedArray {
    // Jagged Array.

    public static void main(String[] args) {
        int[][] jagged = new int[3][];

        jagged[0] = new int[]{1, 2};
        jagged[1] = new int[]{1, 2, 3, 4, 5};
        jagged[2] = new int[]{1, 2, 3};

        // The outer loop iterates over all nested arrays.
        for (int i = 0; i < jagged.length; ++i) {
            // In the inner loop, each element of the nested array is accessed.
            for (int j = 0; j < jagged[i].length; ++j) {
                System.out.print(" " + jagged[i][j]);
            }
            System.out.print("\n");
        }
    }
}
