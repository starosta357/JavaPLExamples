package _2flow_control_and_arrays.arrays;

public class C06_TwoDimentionalArrayFill {
    // Multidimensional arrays.

    public static void main(String[] args) {
        int sizeI = 3;
        int sizeJ = 3;
        int[][] array = new int[sizeI][sizeJ];

        for (int i = 0; i < sizeI; i++) {
            for (int j = 0; j < sizeJ; j++) {
                array[i][j] = i * j + 1;
            }
        }

        for (int i = 0; i < sizeI; i++) {
            for (int j = 0; j < sizeJ; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.print("\n");
        }
    }
}
