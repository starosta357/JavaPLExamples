package _6nested_classes_enums_wrapper_classes.wrappers.ex003_equals_from_number_class;

public class Equals {

    public static void main(String[] args) {
        Integer x = 5;
        Integer y = 10;
        Integer z = 5;
        Short a = 5;

        System.out.println(x.equals(y));
        System.out.println(x.equals(z));
        System.out.println(x.equals(a));

    }
}