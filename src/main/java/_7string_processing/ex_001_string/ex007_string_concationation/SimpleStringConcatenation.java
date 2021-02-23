package _7string_processing.ex_001_string.ex007_string_concationation;

public class SimpleStringConcatenation {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + str2;

        // line 7 will be the same as line 11

        String str4 = new StringBuilder().append(str1).append(str2).toString();
    }
}
