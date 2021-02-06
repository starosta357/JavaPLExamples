package flow_control_and_arrays.flow_control_first_part;
import java.util.Scanner;

public class Example7_Ternary {

    public static void main(String[] args) {
        //how to rename this value everywhere?
        String hiString = "Hello ";

        System.out.println("Enter your login: ");
        Scanner in = new Scanner(System.in);

        String login = in.next();

        hiString += login.equals("Admin") ? "Administrator" : "User";
        System.out.println(hiString);
    }
}
