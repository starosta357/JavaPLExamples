package _6nested_classes_enums_wrapper_classes.string_and_integer_pools.ex003_string_pool;

public class StingPool {
    public static void main(String[] args) {
        String firstString = "Here is the string";
        String secondString = "Here is the string";

        System.out.println(firstString == secondString);
        System.out.println(firstString.equals(secondString));

        firstString = new String("Here is the string");
        secondString = new String("Here is the string");

        System.out.println(firstString == secondString);
        System.out.println(firstString.equals(secondString));
    }
}
