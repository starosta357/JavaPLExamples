package _2flow_control_and_arrays.arrays;

import java.util.Arrays;

public class C18_ArraysClass {
    public static void main(String[] args) {

        int intArr[] = { 10, 20, 15, 22, 35 };

        Arrays.sort(intArr);

        int intKey = 22;

        System.out.println(intKey + " found at index = "
                + Arrays.binarySearch(intArr, intKey));
    }
}
