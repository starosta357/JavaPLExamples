package _3introduction_to_Java_OOP.methods_first_part;

public class C04_Methods {

    static String function(String name) {

        String sentence = "Hello " + name + "!";

        return sentence;
    }

    public static void main(String[] args) {

        String sentence = function("World");

        System.out.println(sentence);

    }
}
