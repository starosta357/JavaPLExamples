package _3introduction_to_Java_OOP.methods_first_part;

public class C07_Methods {

    //rename value1 and value2, how we can do this?
    static String compare(int value1, int value2) {
        if (value1 < value2) {
            return "Comparison Less Than";
        } else if (value1 > value2) {
            return "Comparison Greater Than";
        }
        return "Comparison Equal";
    }

    public static void main(String[] args) {
        int operand1 = 1, operand2 = 2;

        String result = compare(operand1, operand2);

        System.out.println(result);
    }
}
