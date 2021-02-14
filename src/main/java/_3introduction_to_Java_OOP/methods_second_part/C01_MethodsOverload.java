package _3introduction_to_Java_OOP.methods_second_part;

public class C01_MethodsOverload {
    // Overloaded methods can differ in type and number of arguments.

    static void function() {                 // first Overload.
        System.out.println("Hello!");
    }

    static void function(String s) {        // second Overload.
        System.out.println(s);
    }

    static void function(int i) {           // third Overload.
        System.out.println(i);
    }

    static void function(double d) {        // Overload number 4.
        System.out.println(d);
    }

    static void function(String s, int i) { // Overload number 5.
        System.out.println(s + i);
    }

    static void function(int i, String s) { // Overload number 6.
        System.out.println(i + s);
    }

//    Overloaded methods cannot differ in return values!
//    static String function(String s) {   // line 7 Overload.
//
//        return s;
//    }

    public static void main(String[] args) {
        function();                         // 1 Overload
        function("A");                   // 2 Overload
        function(1);                    // 3 Overload
        function(3.14);              // 4 Overload
        function("B ", 2);           // 5 Overload
        function(3, " C");           // 6 Overload
    }
}
