package _6nested_classes_enums_wrapper_classes.wrappers.ex004_parse_methods;

public class Parse {

    public static void main(String[] args) {
        int x = Integer.parseInt("9");
        double c = Double.parseDouble("5");
        //u can use different radix
//        int b = Integer.parseInt("444", 8);
        int b = Integer.parseInt("444", 10);
//        int b = Integer.parseInt("444", 8);

        System.out.println(x);
        System.out.println(c);
        System.out.println(b);

    }
}
