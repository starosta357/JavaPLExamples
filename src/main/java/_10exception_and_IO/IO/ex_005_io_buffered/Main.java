package _10exception_and_IO.IO.ex_005_io_buffered;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        // create a copy of this file (read the file)

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("B:\\IdeaProject\\JavaPLExamples\\src\\main\\java\\_10exception_and_IO\\IO\\ex_005_io_buffered\\Main.java"), "Cp866"));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Main.java"), "Cp866"))){

            int c;
            while ((c = br.read()) != -1) {
                bw.write((char) c);
            }
            bw.flush();
            System.out.println("The job's finished.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
