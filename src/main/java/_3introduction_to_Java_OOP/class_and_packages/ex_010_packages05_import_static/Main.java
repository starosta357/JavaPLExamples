package _3introduction_to_Java_OOP.class_and_packages.ex_010_packages05_import_static;

import static java.lang.Math.PI;
import static java.lang.Math.cos;

public class Main {
    public static void main(String[] args) {
        // made a static import,
        // which allowed us to optimize the code

        double number = 1;
        double result = cos(PI * number);
    }
}
