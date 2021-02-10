package _3introduction_to_Java_OOP.constructors.ex_008_initialization_blocks.methods;

public class Main {
    private int count;

    public static void main(String[] args) {
        // calling a static method using a class
        Main.doSmth(); // via class name
        doSmth();      // in the class itself, without using the class name

        // calling a non-static method or field from a static context
        // is prohibited and results in a compilation error
        // System.out.println(Main.count);
    }
    public static void doSmth() {
        System.out.println("Hello !");
    }
}