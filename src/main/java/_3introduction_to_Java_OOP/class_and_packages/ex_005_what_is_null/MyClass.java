package _3introduction_to_Java_OOP.class_and_packages.ex_005_what_is_null;

import _3introduction_to_Java_OOP.class_and_packages.ex_004_method_calling.*;


public class MyClass {
    public static void main(String[] args) {
        String st1 = null;    // you can assign null to the string
        Car car1 = null;      // you can assign null to an instance of the class
//         int i = null;      // you can't assign null into a primitive type

        String str2 = (String) null;
        Car car2 = (Car) null;

        System.out.println(null == null);      // true
        System.out.println(car1 == null);      // true
//        System.out.println(str2.equals(null));

        car1.getMaxSpeed(); // NullPointerException (RuntimeException)
    }
}
