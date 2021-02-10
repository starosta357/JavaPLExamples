package _2flow_control_and_arrays.flow_control_first_part;

import java.util.Scanner;

public class Example4_Authentication {

    public static void main(String[] args) {
        String login = "Admin";
        String password = "Password";

        // create an instance from class Scanner.
        // shift + f6 to rename something globally.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your login: ");
        String userLogin = sc.next();

        if (login.equals(userLogin)) {
            System.out.print("Enter your password: ");
            String userPassword = sc.next();

            if (password.equals(userPassword)){
                System.out.println("Hi " + userLogin + "!");
            } else {
                System.out.println("Password incorrect");
            }
        } else {
            System.out.println("Do not have user with login: " + userLogin);
        }
    }
}
