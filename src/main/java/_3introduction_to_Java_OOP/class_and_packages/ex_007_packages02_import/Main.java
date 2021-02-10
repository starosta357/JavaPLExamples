package _3introduction_to_Java_OOP.class_and_packages.ex_007_packages02_import;

import _3introduction_to_Java_OOP.class_and_packages.ex_001_class_declaration.*;

public class Main {
    public static void main(String[] args) {
        // If the class (Machine) lies in another package,
        // then in order to use it in the Main Class,
        // it must be imported
        Car myCar = new Car();
    }
}
