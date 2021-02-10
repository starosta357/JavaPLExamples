package _2flow_control_and_arrays.arrays;

import java.util.Arrays;

public class C17_ArraysClass {
    public static void main(String[] args) {

        int[] list = {5, 6, 7, -7, -9, 2, 0, 11, -35, 5};

        Arrays.sort(list);

        for (Integer item : list) {
            System.out.print(item + ", ");
        }

    }
}
