package _10exception_and_IO.IO.ex_002_Scanner_and_BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
    public static void main(String[] args) throws IOException {

        // We have 3 variants to read value from the keywords:

        // System.in => read bytes
        // InputStreamReader => read Symbols
        // BufferedReader => read text(lines) and use buffer
        // (8192 by default in Scanner default 1024)

        // It is better to use BufferedReader when we works with big amount of data.


        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int num = Integer.parseInt(br.readLine());
            System.out.println(num);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // System.in => read bytes
//        int i = System.in.read();
//        System.out.println(i);
//        System.out.println((char)i);

//        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//        int i2 = inputStreamReader.read();
//        System.out.println("in int representation: " +  i2);
//        System.out.println("in char representation: " + (char)i2);
    }
}
