package _8generics.sorting.ex011_sorting_primitive_types;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //sort primitives array like int array
        int[] intArr = {41, -8, 22, 0, 23, 4624, -62, 63, -4, 3, 235};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));

        //sorting String array
        String[] strArr = {"String", "Zoo", "Apple", "Apple2", "Do", "Each"};
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

    }

}
