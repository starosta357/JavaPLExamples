package _3introduction_to_Java_OOP.class_and_packages.ex_001_class_declaration;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String arr = "Str123";
        System.out.println(arr);
        arr = null;
        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }

    public static void var (String... strings){
        for (String s: strings) {
            System.out.println(s);
        }
    }
}
