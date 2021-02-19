package _6nested_classes_enums_wrapper_classes.wrappers.ex002_number_class;

//Autoboxing and Unboxing
public class NumberClassExample {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40;

        float f = 50.0F;
        double d = 60.0D;

        Number[] numbersArray = {b, s, i, l, f, d};

        for (Number number : numbersArray)
            System.out.println(number);
    }
}

