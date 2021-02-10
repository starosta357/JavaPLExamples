package _2flow_control_and_arrays.flow_control_first_part;
import java.util.Scanner;

public class Example12_Switch {
    public static void main(String[] args) {
        int myDay;
        System.out.print("Enter the day of the week: 1-2-3-4-5-6-7: ");
        Scanner in = new Scanner(System.in);
        myDay = in.nextInt();

        switch (myDay) {
            case 1:
                System.out.println("Sunday.");
                break;
            case 2:
                System.out.println("Monday.");
                break;
            case 3:
                System.out.println("Tuesday.");
                break;
            case 4:
                System.out.println("Wednesday.");
                break;
            case 5:
                System.out.println("Thursday.");
                break;
            case 6:
                System.out.println("Friday.");
                break;
            case 7:
                System.out.println("Saturday.");
                break;
            default:
                System.out.println("You entered a non-existent day of the week.");
                break;
        }
    }
}
