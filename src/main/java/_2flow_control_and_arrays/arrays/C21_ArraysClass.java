package _2flow_control_and_arrays.arrays;

import java.util.Arrays;

public class C21_ArraysClass {
    public static void main(String[] args) {

        // Get the Arrays
        int intArr[] = { 10, 20, 15, 22, 35 };
        int intArr2[] = { 10, 20, 15, 22, 35 };

        int intKey = 22;

        String arrayString = Arrays.toString(intArr);
        String arrayString2 = Arrays.toString(intArr2);

        System.out.println(2 == 2);
        System.out.println(arrayString == arrayString2);

        System.out.println(arrayString.equals(arrayString2));

    }
}
