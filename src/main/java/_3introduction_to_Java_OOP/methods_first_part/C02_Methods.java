package _3introduction_to_Java_OOP.methods_first_part;

public class C02_Methods {

    static String function() {
        return "Hello!";
    }

    static void print(int a) {
        System.out.println(a);
    }

    static void print(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {

        print("hi");

        String string = function();

        System.out.println(string);
    }

}
