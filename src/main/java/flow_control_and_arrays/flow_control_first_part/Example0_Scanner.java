package flow_control_and_arrays.flow_control_first_part;

import java.util.Scanner;

public class Example0_Scanner {

    public static void main(String[] args) {
        System.out.print("Just input smth:");

        Scanner sc = new Scanner(System.in);

        //shift + f6
//        String string = input.next(); // read all string before first space
        //ctrl+?
        String string = sc.next(); // read all string

        System.out.println(string);
    }
}
