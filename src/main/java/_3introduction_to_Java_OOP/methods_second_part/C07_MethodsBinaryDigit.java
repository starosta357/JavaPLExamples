package _3introduction_to_Java_OOP.methods_second_part;

public class C07_MethodsBinaryDigit {
    // Output in binary format of a number transmitted in decimal format

    static void converter(int n) {
        int temp;

        temp = n % 2;

        if (n >= 2)
            converter(n / 2);

        System.out.print(temp);
    }

    public static void main(String[] args) {
        int n = 6487;

        converter(n);
    }
}
