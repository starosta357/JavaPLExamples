package _7string_processing.ex_001_string.ex001_string_equals_char_array;

public class SimpleString {
    public static void main(String[] args) {
        String str = "Hello";  // via literal
        String str2 = new String("Hello"); // via keyword new

        char[] arr = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(arr);
        System.out.println(str3);

        //we have a lot of constructors for String object
        String str4 = new String(arr, 0, 4);
        System.out.println(str4);

    }
}
