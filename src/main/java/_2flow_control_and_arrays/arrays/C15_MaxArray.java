package _2flow_control_and_arrays.arrays;

public class C15_MaxArray {
    public static void main(String[] args) {
        // On line 7, create an array of integer elements named array with a dimension of 10 elements

        int[] list = {5, 6, 7, -7, -9, 2, 0, 11, -35, 5};

        // On line 11, create an integer variable max and enter into it the number that is contained in the zero index of the array

        int max = list[0];

        // On line 15, we go through the entire array and on line 19 we check if the array with the i-th index is greater than the value of the variable max
        // On line 17, if the variable max is less than the value of list [i], then we assign this number to it
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max)
                max = list[i];
        }
        System.out.println("Max is " + max);
    }
}
