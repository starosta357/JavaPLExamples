package flow_control_and_arrays.arrays;

public class C13_MethodWithArray {
    static int[] modifyArray(int[] array, int modifier) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * modifier;
        }

        return array;
    }

    public static void main(String[] args) {

        int[] myArray = modifyArray(new int[]{1, 2, 3, 4, 5}, 5);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i] + ", ");
        }
    }
}
