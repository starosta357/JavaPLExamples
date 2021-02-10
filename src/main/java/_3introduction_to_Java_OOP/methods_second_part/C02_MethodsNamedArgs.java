package _3introduction_to_Java_OOP.methods_second_part;

public class C02_MethodsNamedArgs {
    // Named method arguments

    static int difference(int height, int width) {
        return height - width;
    }

    public static void main(String[] args) {
        // You can call the method like this:
        int difference;
        difference = difference(6, 5);

        // or like this:
         difference = difference(5, 6);

        System.out.println("The difference is: " + difference);
    }
}

