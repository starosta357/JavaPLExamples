package _10exception_and_IO.IO.ex_006_ioStream.io_stream;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "Cp866"));
             PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"), true)){
            //true – means that after pw.println(…) don't need to call pw.flush().

            // System.out.println(...) and  pw.println(...) - work in the same way;
            String str = "Hello World";
            System.out.println("System.out puts: " + str);
            pw.println("PrintWriter puts: " + str);

            char helperChar;
            pw.println("input by char: ");
            while ((helperChar = (char) br.read()) != 'q') {
                pw.println(helperChar);
            }

            pw.println("input by string: ");
            do {
                str = br.readLine();
                pw.println(str);
            } while (!str.equals("q"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

