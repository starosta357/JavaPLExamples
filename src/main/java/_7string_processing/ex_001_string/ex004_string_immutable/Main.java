package _7string_processing.ex_001_string.ex004_string_immutable;

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1;
        System.out.println(s1 == s2);

        s1 += " World";
        s2 += " World";
        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
