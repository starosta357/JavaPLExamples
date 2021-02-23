package _7string_processing.ex_001_string.ex002_compare_time_execution;

public class CompareTimeExecution {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";
        String str3 = "!!!";

        long l3 = System.nanoTime();
        String str6 = str1 + str2 + str3;
        long l4 = System.nanoTime();
        System.out.println("time using the +: " + (l4 - l3));


        long l1 = System.nanoTime();
        String str = str1.concat(str2).concat(str3);
        long l2 = System.nanoTime();
        System.out.println("time using the concat: " + (l2 - l1));


        long l5 = System.nanoTime();
        String str7 = new StringBuilder().append(str1).append(str2).append(str3).toString();
        long l6 = System.nanoTime();
        System.out.println("time using the append: " + (l6 - l5));
    }
}
