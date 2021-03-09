package _10exception_and_IO.IO.ex_000_error_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            new FileInputStream("D:");
        } catch (FileNotFoundException e) {
            System.out.println("out before err");
            System.err.println("File opening failed");
            System.out.println("out after err");
            e.printStackTrace();
        }
    }
}
