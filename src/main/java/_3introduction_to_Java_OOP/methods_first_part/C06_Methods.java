package _3introduction_to_Java_OOP.methods_first_part;

public class C06_Methods {

    static boolean and(boolean a, boolean b) {
        return a && b;
    }

    public static void main(String[] args) {
        boolean operand1 = true, operand2 = true;

        boolean result = and(operand1, operand2);

        System.out.println(operand1 + " && " + operand2 + " = " + result);
    }
}
