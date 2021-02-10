package _2flow_control_and_arrays.arrays;

public class C02_ArraysFill {
    // One-dimensional array

    public static void main(String[] args) {
        int[] array = new int[5];

        // Filling the array.
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }

        // print values of array elements.
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Special notation for loop for looping through array elements (Java 8)
        // Similar construction foreach,
        // used in other programming languages (example C#, PHP)
        // for (int key, array)
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
    }
}
