package flow_control_and_arrays.arrays;

public class C01_Arrays {
    // One-dimensional array

    public static void main(String[] args) {
        // On line 9, create an array of integer elements named array with a dimension of 5 elements

        int[] array = new int[5];

        // On the 13th line, the element of the array array at index 0 is assigned the value 10

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        // On line 21, display the value of the array element at index 0

        System.out.println(array[0] + 1);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }
}
