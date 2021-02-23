package _7string_processing.ex_005_character_encoding;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Example {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String rawString = "Привет, как ви там?";
        System.out.println(rawString);

        byte[] bytes = rawString.getBytes("Windows-1251");
        String utf8EncodedString = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(utf8EncodedString);
    }
}
