package _7string_processing.ex_001_string.ex006_string_intern;

public class Main {
    public static void main(String[] args) {
        String s1 = "World";   // will be created in String pool
        String s2 = "World";   // will be created in String pool

        // Create String object via constructor(not in String pool)
        String s3 = new String("World");
        String s4 = new String("World");
        System.out.println(s1 == s2);

        // Use intern method to move String to the pool
        System.out.println(s1 == s3.intern());
        System.out.println(s3.intern() == s4.intern());
        System.out.println();
    }
}
