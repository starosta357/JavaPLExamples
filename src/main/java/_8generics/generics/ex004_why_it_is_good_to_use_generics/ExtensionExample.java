package _8generics.generics.ex004_why_it_is_good_to_use_generics;

public class ExtensionExample {
    public static void main(String[] args) {
        Number[] num = new Integer[10];
        num[0] = 10.10d;

        //runtime error
        System.out.println(num[0]);

        //compilation error
//        List<Number> list = new ArrayList<Integer>();
    }
}
