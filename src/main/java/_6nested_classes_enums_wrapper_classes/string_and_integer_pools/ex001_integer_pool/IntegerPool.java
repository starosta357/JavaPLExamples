package _6nested_classes_enums_wrapper_classes.string_and_integer_pools.ex001_integer_pool;

public class IntegerPool {

    public static void main(String[] args) {
        //the same will be with : Byte, Short, Integer, Long, Character
        Integer firstInt = 100;
        Integer secondInt = 100;
        System.out.println(firstInt == secondInt);

        firstInt = new Integer(100);
        System.out.println(firstInt == secondInt);

        secondInt = new Integer(100);
        System.out.println(firstInt == secondInt);

        System.out.println("Using equals method: "
                + firstInt.equals( secondInt));
    }
}
