package _10exception_and_IO.IO.ex_002_Scanner_and_BufferReader;

import java.util.Scanner;

public class SimpleScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("print int value: ");
        int i = scanner.nextInt();

        System.out.print("print float value: ");
        float f = scanner.nextFloat();

        System.out.print("print string value(single word): ");
        String str = scanner.next();

        scanner = new Scanner(System.in);
        System.out.print("print string value(text): ");
        String str2 = scanner.nextLine();

        System.out.println("Number " + i +
                " Float " + f + " Word " + str + " Line " + str2);
    }
}
