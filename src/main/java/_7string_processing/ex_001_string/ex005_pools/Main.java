package _7string_processing.ex_001_string.ex005_pools;

public class Main {
    public static void main(String[] args) {

        String s1 = "World";   // will be created in String pool
        String s2 = "World";   // will used from the String pool

        // create strings using keyword 'new' (will be not present in pool)
        String s3 = new String("World");
        String s4 = new String("World");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println();


        //INTEGER POOL ONE MORE TIME))

        Integer a = 10;
        Integer b = 10;
        Integer c1 = 128;
        Integer c2 = 128;
        Integer aNew = new Integer(10);
        Integer bNew = new Integer(10);
        System.out.println(aNew == bNew);
        // Integer wrapper classes(Byte, Short, Long, Integer, Character) put their values in the pool,
        // numbers from -128..127 (1 byte) can be stored in the pool
        System.out.println(a == b);
        // We go beyond the range of 1 byte and get a negative result
        System.out.println(c1 == c2);
    }
}
