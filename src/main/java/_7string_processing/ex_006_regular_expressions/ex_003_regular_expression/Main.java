package _7string_processing.ex_006_regular_expressions.ex_003_regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Checking whether a string matches a pattern
        Pattern p1 = Pattern.compile("a+y");
        Matcher m1 = p1.matcher("aay");

        // Matches string to pattern
        boolean b = m1.matches();
        System.out.println(b);

        // Find and select a substring specified by a pattern
        String regex = "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)?";
        String address = "address :firstmail@mail.ua and secondmail@gmail.com";

        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher(address);
        while (m2.find()) {
            System.out.println("e-mail: " + m2.group());
        }

        // Splitting a string into substrings using a template as a delimiter
        Pattern p3 = Pattern.compile("\\d+\\s?");
        String[] words = p3.split("java1language 22 for3everyone");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
