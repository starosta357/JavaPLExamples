package _2flow_control_and_arrays.flow_control_second_part;

public class C08_Factorial {

    // In mathematics, the factorial of a positive integer n, denoted by n!,
    // is the product of all positive integers less than or equal to n:
    //     n! = 1 * 2 * 3 * ... * n
    //     0! = 1

    //In combinatorics, the factorial of a natural number n is interpreted as the number of permutations of a set of n elements.
    // Example, for {A,B,C,D} out of 4 elements there are: 4! = 1 * 2 * 3 * 4 = 24 permutations:

    //     ABCD  BACD  CABD  DABC
    //     ABDC  BADC  CADB  DACB
    //     ACBD  BCAD  CBAD  DBAC
    //     ACDB  BCDA  CBDA  DBCA
    //     ADBC  BDAC  CDAB  DCAB
    //     ADCB  BDCA  CDBA  DCBA

    public static void main(String[] args) {
        int counter = 100;
        int factorial = 1;

        System.out.print("factorial of: " + counter + "! = ");

        do {
            // First multiplication, then decrement.

            if (counter == 0 ) break;
            factorial *= counter--;

            // line 30 is equivalent to:

            //factorial = factorial * counter;
            //counter = counter - 1;
        }
        while (counter > 0);

        System.out.print(factorial);
    }
}
